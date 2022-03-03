package com.example.animalrand.di.module

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.animalrand.di.factory.FactoryViewModel
import com.example.animalrand.di.utils.ViewModelKey
import com.example.animalrand.view.home.HomeViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module()
abstract class ViewModelModule {
    @Binds
    abstract fun bindViewModelFactory(factoryViewModel: FactoryViewModel): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(HomeViewModel::class)
    abstract fun bindHomeViewModel(homeViewModel: HomeViewModel): ViewModel
}