package com.example.animalrand.model.dto

import com.google.gson.annotations.SerializedName

data class AnimalDTO (
    @SerializedName("name")
    val name: String?,
    @SerializedName("latin_name")
    val latin_name: String?,
    @SerializedName("animal_type")
    val animal_type: String?,
    @SerializedName("active_time")
    val active_time: String?,
    @SerializedName("length_min")
    val length_min: String?,
    @SerializedName("length_max")
    val length_max: String?,
    @SerializedName("weight_min")
    val weight_min: String?,
    @SerializedName("weight_max")
    val weight_max: String?,
    @SerializedName("lifespan")
    val lifespan: String?,
    @SerializedName("habitat")
    val habitat: String?,
    @SerializedName("diet")
    val diet: String?,
    @SerializedName("geo_range")
    val geo_range: String?,
    @SerializedName("image_link")
    val image_link: String?,
    @SerializedName("id")
    val id: Int?

)