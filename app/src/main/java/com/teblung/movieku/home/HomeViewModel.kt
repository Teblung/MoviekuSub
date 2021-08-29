package com.teblung.movieku.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.teblung.movieku.core.domain.usecase.MovieUseCase

class HomeViewModel(movieUseCase: MovieUseCase) : ViewModel() {
    val movie = movieUseCase.getAllMovie().asLiveData()
}