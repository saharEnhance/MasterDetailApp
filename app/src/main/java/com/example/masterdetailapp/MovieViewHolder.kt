package com.example.masterdetailapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item.view.*

class MovieViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bind(movie: Movie, clickListener: (String) -> Unit){

        itemView.titleItem.text = movie.title
        itemView.yearItem.text = movie.year
        itemView.setOnClickListener { movie.toString()?.let { it1 -> clickListener(it1) } }
    }

}