package com.br.drag_race.view.queens.adapter.viewholder

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.br.drag_race.R

class QueensViewHolder(
    view: View
) : RecyclerView.ViewHolder(view) {

    val queen_image by lazy{itemView.findViewById<ImageView>(R.id.queens_activity_image)}
    val queen_name by lazy {itemView.findViewById<TextView>(R.id.queens_activity_name)}
}