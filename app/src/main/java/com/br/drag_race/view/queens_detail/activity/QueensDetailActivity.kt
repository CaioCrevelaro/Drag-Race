package com.br.drag_race.view.queens_detail.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.br.drag_race.R
import com.br.drag_race.view.queens.adapter.viewholder.QueensViewHolder
import com.squareup.picasso.Picasso
import org.w3c.dom.Text

class QueensDetailActivity : AppCompatActivity() {

    val queen_image by lazy { findViewById<ImageView>(R.id.queens_detail_activity_image) }
    val queen_name by lazy { findViewById<TextView>(R.id.queens_detail_activity_name) }
    val queen_id by lazy { findViewById<TextView>(R.id.queens_detail_activity_id) }
    val queen_congeniality by lazy { findViewById<TextView>(R.id.queens_detail_activity_congeniality) }
    val queen_quote by lazy { findViewById<TextView>(R.id.queens_detail_activity_quote) }
    val queen_winner by lazy { findViewById<TextView>(R.id.queens_detail_activity_winner) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initView()
        dataFromIntent()
    }

    private fun initView() = setContentView(
        R.layout.activity_queens_detail
    )

    private fun dataFromIntent() {

        val intent = intent.extras

        val queenImage = intent?.getString("IMAGE")
        val queenName = intent?.getString("NAME")
        val queenId = intent?.getString("ID")
        val queenCongeniality = intent?.getString("MISS_CONGENIALITY")
        val queenQuote = intent?.getString("QUOTE")
        val queenWinner = intent?.getString("WINNER")

        Picasso.get().load(queenImage).into(queen_image)
        queen_name.text = queenName
        queen_id.text = "ID: " + queenId
        queen_congeniality.text = "Miss Congeniality: " + queenCongeniality.toString()
        queen_quote.text = queenQuote
        queen_winner.text = "Winner: " + queenWinner.toString()

    }
}