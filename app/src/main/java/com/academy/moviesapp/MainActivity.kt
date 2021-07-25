package com.academy.moviesapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

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
//        rvMovies.layoutManager = LinearLayoutManager(this)
//        val listMovieAdapter = ListMovieAdapter(list)
//        rvMovies.adapter = listMovieAdapter

        rvMovies.layoutManager = GridLayoutManager(this, 2)
        val gridHeroAdapter = ListMovieAdapter(list)
        rvMovies.adapter = gridHeroAdapter
    }
}