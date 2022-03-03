package com.example.animalrand.api

import com.example.animalrand.model.dto.AnimalDTO
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiInterface {
    @GET("/animals/rand")
    fun getRandAnimal(): Call<AnimalDTO>

    @GET("/animals/rand/{qty}")
    fun getRandAnimals(@Path("qty")qty:Int): Call<List<AnimalDTO>>
}