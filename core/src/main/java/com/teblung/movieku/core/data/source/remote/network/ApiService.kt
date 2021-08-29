package com.teblung.movieku.core.data.source.remote.network

import com.teblung.movieku.core.data.source.remote.response.ListMovieResponse
import retrofit2.http.GET

interface ApiService {
    @GET("movie/popular")
    suspend fun getList(): ListMovieResponse
}