package com.example.presentation.models

import com.example.domain.models.FilmsResponse

data class FilmsResponseUi(
    val image: String = "",
    val originalTitle: String = "",
    val director: String = "",
    val description: String = "",
    val vehicles: List<String>?,
    val title: String = "",
    val rtScore: String = "",
    val people: List<String>?,
    val url: String = "",
    val releaseDate: String = "",
    val species: List<String>?,
    val originalTitleRomanised: String = "",
    val producer: String = "",
    val runningTime: String = "",
    val locations: List<String>?,
    val id: String = "",
    val movieBanner: String = ""
)

fun FilmsResponse.toUI(): FilmsResponseUi {
    return FilmsResponseUi(
        image,
        originalTitle,
        director,
        description,
        vehicles,
        title,
        rtScore,
        people,
        url,
        releaseDate,
        species,
        originalTitleRomanised,
        producer,
        runningTime,
        locations
    )
}