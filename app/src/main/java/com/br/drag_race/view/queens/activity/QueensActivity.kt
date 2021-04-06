package com.br.drag_race.view.queens.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.br.drag_race.R
import com.br.drag_race.test.mock.QueensMock
import com.br.drag_race.view.queens.adapter.QueensAdapter

class QueensActivity : AppCompatActivity() {

    val recyclerView by lazy{findViewById<RecyclerView>(R.id.queens_recyclerview)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initView()
        setRecyclerView()
    }

    private fun initView() = setContentView(R.layout.activity_queens)

    private fun setRecyclerView(){

        recyclerView.adapter = QueensAdapter(QueensMock.list)

        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

    }
}