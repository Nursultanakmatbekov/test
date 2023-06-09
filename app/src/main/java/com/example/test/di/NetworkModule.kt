package com.example.test.di

import com.example.data.remote.RetrofitClient
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {
    @Singleton
    val retrofitClient = RetrofitClient()

    @Singleton
    @Provides
    fun provideFilmsApiService() = retrofitClient.provideData()

}