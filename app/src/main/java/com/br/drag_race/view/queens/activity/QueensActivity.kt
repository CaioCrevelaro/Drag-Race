package com.br.drag_race.view.queens.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.br.drag_race.R
import com.br.drag_race.model.Queens
import com.br.drag_race.view.queens.adapter.QueensAdapter
import com.br.drag_race.viewmodel.QueensViewModel

class QueensActivity : AppCompatActivity() {

    private val recyclerView by lazy { findViewById<RecyclerView>(R.id.queens_recyclerview) }
    private val queensResponse by lazy { ArrayList<Queens>() }
    private val queensViewModel by lazy {
        ViewModelProviders
            .of(this)
            .get(QueensViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initView()
        setStatusBarColor()
        setRecyclerView()
        requestQueensViewModel()
    }

    private fun initView() = setContentView(R.layout.activity_queens)

    private fun setStatusBarColor(){

        val window = this.window
        window.statusBarColor = ContextCompat.getColor(this, R.color.green_1)
    }

    private fun setRecyclerView() {

//        recyclerView.adapter = QueensAdapter(QueensMock.list)
        recyclerView.adapter = QueensAdapter(queensResponse, this)

        recyclerView.layoutManager = LinearLayoutManager(
            this,
            LinearLayoutManager.HORIZONTAL,
            false)

    }

    private fun requestQueensViewModel() {

        queensViewModel.getAllQueens()
        queensViewModel.queensArrayList.observe(this, Observer {
            it?.let { itchar -> queensResponse.addAll(itchar) }
            recyclerView.adapter?.notifyDataSetChanged()
        })
    }
}