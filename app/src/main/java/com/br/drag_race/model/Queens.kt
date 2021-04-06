package com.br.drag_race.model


import com.google.gson.annotations.SerializedName

data class Queens(
    @SerializedName("id")
    val id: Int,
//    @SerializedName("image_url")
//    val imageUrl: String,
    val image: Int,
    @SerializedName("missCongeniality")
    val missCongeniality: Boolean,
    @SerializedName("name")
    val name: String,
    @SerializedName("quote")
    val quote: String,
    @SerializedName("winner")
    val winner: Boolean
)