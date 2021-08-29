package com.teblung.movieku.di

import com.teblung.movieku.core.domain.usecase.MovieInteractor
import com.teblung.movieku.core.domain.usecase.MovieUseCase
import com.teblung.movieku.detail.DetailViewModel
import com.teblung.movieku.home.HomeViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val useCaseModule = module {
    factory<MovieUseCase> { MovieInteractor(get()) }
}

val viewModelModule = module {
    viewModel { HomeViewModel(get()) }
    viewModel { DetailViewModel(get()) }
}