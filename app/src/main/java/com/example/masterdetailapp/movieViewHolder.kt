package com.example.masterdetailapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class movieViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun onCreateViewHolder(parent: ViewGroup, viewType: Int):movieViewHolder{

        val inflater = LayoutInflater.from(parent.context)
        val view = inflater(R.layout.item, parent, false)
        return movieViewHolder(view)
    }


}