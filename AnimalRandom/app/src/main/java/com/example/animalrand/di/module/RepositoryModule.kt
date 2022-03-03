package com.example.animalrand.di.module

import com.example.animalrand.api.ApiInterface
import com.example.animalrand.model.repository.AnimalRepoImp
import com.example.animalrand.model.repository.AnimalRepoInterface
import dagger.Module
import dagger.Provides

@Module()
class RepositoryModule {

    @Provides
    fun provideAnimalRepository(api: ApiInterface): AnimalRepoInterface{
        return AnimalRepoImp(api)
    }
}