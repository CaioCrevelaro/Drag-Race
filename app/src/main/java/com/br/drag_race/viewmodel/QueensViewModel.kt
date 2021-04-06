package com.br.drag_race.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.br.drag_race.model.Queens
import com.br.drag_race.model.QueensResponse
import com.br.drag_race.repository.Repository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class QueensViewModel: ViewModel() {

    val queensArrayList = MutableLiveData<ArrayList<Queens>>()

    private val repository = Repository()

    fun getAllQueens() = CoroutineScope(Dispatchers.IO)
        .launch {
            repository.getQueensService()
                .let { QueensResponse ->
                    queensArrayList.postValue(QueensResponse)
                }
        }




}