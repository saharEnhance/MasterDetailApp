package com.example.masterdetailapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class movieListAdapter (private var list: MutableList<Movie>, private val clickListener: (String) -> Unit)
    : RecyclerView.Adapter<movieViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): movieViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item, parent, false)
        return movieViewHolder(view)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: movieViewHolder, position: Int) {
        holder.bind(list[position], clickListener)
    }

}
