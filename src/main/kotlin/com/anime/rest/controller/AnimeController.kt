package com.anime.rest.controller

import com.anime.rest.model.Anime
import com.anime.rest.service.AnimeService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/animes")
class AnimeController(private val service: AnimeService) {

    @GetMapping
    fun listar(): List<Anime> {
        return service.listar()
    }
}