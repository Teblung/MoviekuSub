package com.teblung.movieku.detail

import androidx.lifecycle.ViewModel
import com.teblung.movieku.core.domain.model.Movie
import com.teblung.movieku.core.domain.usecase.MovieUseCase

class DetailViewModel(private val movieUseCase: MovieUseCase) : ViewModel() {
    fun setFavoriteMovie(movie: Movie, newStatus: Boolean) =
        movieUseCase.setFavoriteMovie(movie, newStatus)
}