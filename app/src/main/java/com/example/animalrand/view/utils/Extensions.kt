package com.example.animalrand.view.utils

import com.example.animalrand.model.data.Animal
import com.example.animalrand.model.dto.AnimalDTO

fun AnimalDTO.toModel(): Animal {
    return Animal(
        name = name?: "",
        latin_name = latin_name?:"",
        animal_type = animal_type?:"",
        active_time = active_time?:"",
        length_min = length_min?:"",
        length_max = length_max?:"",
        weight_min = weight_min?:"",
        weight_max = weight_max?:"",
        lifespan = lifespan?:"",
        habitat = habitat?:"",
        diet = diet?:"",
        geo_range = geo_range?:"",
        image_link = image_link?:"",
        id = id?: 0
    )
}