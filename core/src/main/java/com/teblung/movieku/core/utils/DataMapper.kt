package com.teblung.movieku.core.utils

import com.teblung.movieku.core.data.source.local.entity.MovieEntity
import com.teblung.movieku.core.data.source.remote.response.MovieResponse
import com.teblung.movieku.core.domain.model.Movie

object DataMapper {
    fun mapResponsesToEntities(input: List<MovieResponse>): List<MovieEntity> {
        val movieList = ArrayList<MovieEntity>()
        input.map {
            val movie = MovieEntity(
                movieId = it.id,
                overview = it.overview,
                title = it.title,
                posterPath = it.posterPath,
                isFavorite = false
            )
            movieList.add(movie)
        }
        return movieList
    }

    fun mapEntitiesToDomain(input: List<MovieEntity>): List<Movie> =
        input.map {
            Movie(
                movieId = it.movieId,
                overview = it.overview,
                title = it.title,
                posterPath = it.posterPath,
                isFavorite = it.isFavorite
            )
        }

    fun mapDomainToEntity(input: Movie) = MovieEntity(
        movieId = input.movieId,
        overview = input.overview,
        title = input.title,
        posterPath = input.posterPath,
        isFavorite = input.isFavorite
    )
}