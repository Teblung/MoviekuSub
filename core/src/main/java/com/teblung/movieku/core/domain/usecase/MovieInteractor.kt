package com.teblung.movieku.core.domain.usecase

import com.teblung.movieku.core.domain.model.Movie
import com.teblung.movieku.core.domain.repository.IMovieRepository

class MovieInteractor(private val moviekuRepository: IMovieRepository): MovieUseCase {
    override fun getAllMovie() = moviekuRepository.getAllMovie()

    override fun getFavoriteMovie() = moviekuRepository.getFavoriteMovie()

    override fun setFavoriteMovie(movie: Movie, state: Boolean) = moviekuRepository.setFavoriteMovie(movie, state)

}