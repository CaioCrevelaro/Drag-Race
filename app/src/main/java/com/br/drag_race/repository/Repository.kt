package com.br.drag_race.repository

import com.br.drag_race.model.QueensResponse
import com.br.drag_race.network.EndPoint
import com.br.drag_race.network.RetrofitInit

class Repository {

    private val url = "http://www.nokeynoshade.party/api/"

    private var service = EndPoint::class

    private val serviceQueen = RetrofitInit(url).create(service)
    //Método que cria a conexão com todos os endpoints da API, que constam em
    // "network/Endpoint"

    suspend fun getQueensService(): QueensResponse = serviceQueen.getQueensResponse()
}
