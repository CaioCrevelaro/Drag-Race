package com.br.drag_race.view.queens.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.br.drag_race.R
import com.br.drag_race.model.Queens
import com.br.drag_race.view.queens.adapter.viewholder.QueensViewHolder
import com.squareup.picasso.Picasso

class QueensAdapter(
    val queensList: ArrayList<Queens>,
    private val context: Context
) : RecyclerView.Adapter<QueensViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): QueensViewHolder {

        val view = LayoutInflater
            .from(context)
            .inflate(
                R.layout.queens_cardview,
                parent,
                false
            )

        return QueensViewHolder(view)
    }

    override fun onBindViewHolder(
        holder: QueensViewHolder,
        position: Int
    ) {
        val queen = queensList.elementAt(position)

        val name = holder.queen_name
        name.text = queensList[position].name

        Picasso.get().load(queen.imageUrl).into(holder.queen_image)
//        val image = holder.queen_image
//        image.setImageResource(queensList[position].image)

    }

    override fun getItemCount(): Int = queensList.size
}