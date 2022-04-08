package com.anime.rest.service

import com.anime.rest.model.Anime
import java.util.Arrays
import org.springframework.stereotype.Service

@Service
class AnimeService(var animes: List<Anime>)  {
    fun listar(): List<Anime> {

    }

    init {
        val anime = Anime(
            id = 1,
            nome = "Dragon Ball",
            categoria = "Shounen",
            author = "Akira Toriyama"
        )
        animes = Arrays.asList(anime)
    }

}