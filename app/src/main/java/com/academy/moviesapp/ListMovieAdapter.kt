package com.academy.moviesapp

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.google.gson.Gson

class ListMovieAdapter(private val listMovie: ArrayList<Movie>) : RecyclerView.Adapter<ListMovieAdapter.ListViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_movies, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val movie = listMovie[position]

        Glide.with(holder.itemView.context)
            .load(movie.image)
            .apply(RequestOptions().override(200, 200))
            .into(holder.imgPhoto)

        holder.tvTitle.text = movie.title
        holder.tvDescription.text = movie.description
        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(listMovie[holder.adapterPosition]) }
        holder.btnViewMore.setOnClickListener{ onItemClickCallback.onItemClicked(listMovie[holder.adapterPosition]) }
    }

    override fun getItemCount(): Int {
        return listMovie.size
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Movie)
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvTitle: TextView = itemView.findViewById(R.id.tv_item_title)
        var tvDescription: TextView = itemView.findViewById(R.id.tv_item_description)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        var btnViewMore: Button = itemView.findViewById(R.id.btn_view_more)
    }
}