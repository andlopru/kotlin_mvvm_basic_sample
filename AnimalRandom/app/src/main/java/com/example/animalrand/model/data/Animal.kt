package com.example.animalrand.model.data

import java.io.Serializable

data class Animal(
    val name: String = "",
    val latin_name: String = "",
    val animal_type: String = "",
    val active_time: String = "",
    val length_min: String = "",
    val length_max: String = "",
    val weight_min: String = "",
    val weight_max: String = "",
    val lifespan: String = "",
    val habitat: String = "",
    val diet: String = "",
    val geo_range: String = "",
    val image_link: String = "",
    val id: Int
) : Serializable

data class AnimalListItem(
    val id: Int,
    val name: String = "",
    val latin_name: String = "",
    val animal_type: String = "",
    val habitat: String = "",
    val image_link: String = ""
)