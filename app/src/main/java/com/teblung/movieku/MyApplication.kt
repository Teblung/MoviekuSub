@file:Suppress("unused")

package com.teblung.movieku

import android.app.Application
import com.teblung.movieku.core.di.databaseModule
import com.teblung.movieku.core.di.networkModule
import com.teblung.movieku.core.di.repositoryModule
import com.teblung.movieku.di.useCaseModule
import com.teblung.movieku.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger(Level.NONE)
            androidContext(this@MyApplication)
            modules(
                listOf(
                    databaseModule,
                    networkModule,
                    repositoryModule,
                    useCaseModule,
                    viewModelModule
                )
            )
        }
    }
}