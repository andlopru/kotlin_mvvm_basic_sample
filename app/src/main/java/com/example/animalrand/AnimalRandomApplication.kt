package com.example.animalrand

import android.app.Application
import com.example.animalrand.di.component.DaggerAppComponent
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject

class AnimalRandomApplication:Application(),
    HasAndroidInjector {
    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Any>

    override fun onCreate() {
//        AppInjector.init(this)
        DaggerAppComponent.builder().application(this).build().inject(this)
        super.onCreate()
    }

    override fun androidInjector() = dispatchingAndroidInjector
}