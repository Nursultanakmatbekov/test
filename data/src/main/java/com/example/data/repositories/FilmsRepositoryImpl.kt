package com.example.data.repositories

import com.example.data.base.BaseRepository
import com.example.data.dtos.toDomain
import com.example.data.remote.apiservise.FilmsApiService
import com.example.domain.either.Either
import com.example.domain.models.FilmsResponse
import com.example.domain.repositories.FilmsRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class FilmsRepositoryImpl @Inject constructor(private val service: FilmsApiService) :
    FilmsRepository, BaseRepository() {

    override fun fetchFilms() = doRequest {
        service.fetchFilms().map {
            it.toDomain()
        }
    }
}