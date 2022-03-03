package com.example.animalrand.di.module

import com.example.animalrand.view.home.HomeFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module()
abstract class FragmentModule {

    @ContributesAndroidInjector
    abstract fun contributeHomeFragment():HomeFragment

}