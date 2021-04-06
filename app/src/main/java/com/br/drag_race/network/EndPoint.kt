package com.br.drag_race.network

import com.br.drag_race.model.QueensResponse
import retrofit2.http.GET

interface EndPoint {

    @GET("queens/all")
    suspend fun getQueensResponse(): QueensResponse
}