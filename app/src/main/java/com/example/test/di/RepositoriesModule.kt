package com.example.test.di

import com.example.data.repositories.FilmsRepositoryImpl
import com.example.domain.repositories.FilmsRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface RepositoriesModule {

    @Binds
    fun providerRepository(repositoryImpl: FilmsRepositoryImpl): FilmsRepository

}