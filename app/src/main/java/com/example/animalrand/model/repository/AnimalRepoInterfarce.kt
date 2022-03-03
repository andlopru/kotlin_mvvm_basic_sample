package com.example.animalrand.model.repository

import com.example.animalrand.model.dto.AnimalDTO

interface AnimalRepoInterface{
    suspend fun getAnimals(many:Int = 10)
}