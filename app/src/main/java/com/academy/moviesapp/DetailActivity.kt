package com.academy.moviesapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.google.gson.Gson


class DetailActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        val gson = Gson()
        val movieObject = gson.fromJson<Movie>(intent.getStringExtra("extra_movie"), Movie::class.java)

        val tvTitleReceived: TextView = findViewById(R.id.tv_title_received)
        val imgReceived: ImageView = findViewById(R.id.img_data_received)
        val tvDescReceived: TextView = findViewById(R.id.tv_desc_received)
        val tvRatingReceived: TextView = findViewById(R.id.tv_rating_received)
        val tvCriticReceived: TextView = findViewById(R.id.tv_critic_received)
        val btnOpenLink: Button = findViewById(R.id.btn_view_open_link)
        btnOpenLink.setOnClickListener(this)

        Glide.with(this).load(movieObject.image).into(imgReceived)

        tvTitleReceived.text = movieObject.title
        tvDescReceived.text = movieObject.description
        tvRatingReceived.text = movieObject.rating.toString()
        tvCriticReceived.text = movieObject.critic
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_view_open_link -> {
                val gson = Gson()
                val movieObject = gson.fromJson<Movie>(intent.getStringExtra("extra_movie"), Movie::class.java)
                val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse(movieObject.url))
                startActivity(browserIntent)

            }
        }
    }
}