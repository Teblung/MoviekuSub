package com.teblung.movieku.favorite

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.teblung.movieku.core.domain.usecase.MovieUseCase

class FavoriteViewModel(movieUseCase: MovieUseCase): ViewModel() {
    val favoriteMovie = movieUseCase.getFavoriteMovie().asLiveData()
}