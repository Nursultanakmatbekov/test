package com.example.domain.usecase

import com.example.domain.repositories.FilmsRepository
import javax.inject.Inject

class FetchFilmsUseCase @Inject constructor(private val repository: FilmsRepository) {

    operator fun invoke() = repository.fetchFilms()

}