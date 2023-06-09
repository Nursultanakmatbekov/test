package com.example.data.remote.apiservise

import com.example.data.dtos.FilmsResponseDto
import retrofit2.http.GET
import retrofit2.http.Query

interface FilmsApiService {

    @GET("films")
    suspend fun fetchFilms(
        @Query("fields") fields: String = "",
        @Query("limit") limit: Int = 50
    ): List<FilmsResponseDto>
}