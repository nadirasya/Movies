package com.academy.moviesapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.gson.Gson

class MainActivity : AppCompatActivity() {
    private lateinit var rvMovies: RecyclerView
    private var list: ArrayList<Movie> = arrayListOf()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        

        rvMovies = findViewById(R.id.rv_movies)
        rvMovies.setHasFixedSize(true)

        list.addAll(MoviesData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList(){
        rvMovies.layoutManager = GridLayoutManager(this, 2)
        val gridMovieAdapter = ListMovieAdapter(list)
        rvMovies.adapter = gridMovieAdapter

        gridMovieAdapter.setOnItemClickCallback(object : ListMovieAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Movie) {
//                showSelectedMovie(data)
                val gson = Gson()
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra("extra_movie", gson.toJson(data))
                startActivity(intent)
            }
        })
    }

    private fun showSelectedMovie(movie: Movie) {
        Toast.makeText(this, "Kamu memilih " + movie.title, Toast.LENGTH_SHORT).show()
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }
    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.action_about -> {
            }
        }
    }
}