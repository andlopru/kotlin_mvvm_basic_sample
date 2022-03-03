package com.example.animalrand.di.module

import android.content.Context
import com.example.animalrand.AnimalRandomApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module()
class AppModule {
    @Provides
    @Singleton
    internal fun provideContext(application: AnimalRandomApplication):Context = application.applicationContext
}