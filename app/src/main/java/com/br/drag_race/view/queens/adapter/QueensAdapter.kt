package com.br.drag_race.view.queens.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.br.drag_race.R
import com.br.drag_race.model.Queens
import com.br.drag_race.view.queens.adapter.viewholder.QueensViewHolder

class QueensAdapter(
    val queensList: ArrayList<Queens>
) : RecyclerView.Adapter<QueensViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): QueensViewHolder {

        val view = LayoutInflater
            .from(parent.context)
            .inflate(
                R.layout.queens_cardview,
                parent,
                false)

        return QueensViewHolder(view)
    }

    override fun onBindViewHolder(
        holder: QueensViewHolder,
        position: Int) {

        val name = holder.queen_name
        name.text = queensList[position].name

        val image = holder.queen_image
        image.setImageResource(queensList[position].image)

    }

    override fun getItemCount(): Int = queensList.size
}