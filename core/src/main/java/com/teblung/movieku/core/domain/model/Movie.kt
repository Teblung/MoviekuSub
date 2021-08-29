package com.teblung.movieku.core.domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Movie(
    val movieId: Int,
    val overview: String,
    val title: String,
    val posterPath: String,
    val isFavorite: Boolean
) : Parcelable