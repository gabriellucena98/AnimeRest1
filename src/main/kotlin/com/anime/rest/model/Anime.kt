package com.anime.rest.model

data class Anime(
    val id: Long? = null,
    val nome: String,
    val categoria: String,
    val author: String
)
