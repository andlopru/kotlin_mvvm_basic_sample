package com.example.animalrand.view.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.animalrand.model.data.AnimalListItem
import com.example.animalrand.model.repository.AnimalRepoInterface
import kotlinx.coroutines.launch
import javax.inject.Inject

class HomeViewModel @Inject constructor(
    private val animalRepo: AnimalRepoInterface
) : ViewModel() {

    val animalList:List<AnimalListItem> = emptyList()

    init {
        getAnimals()
    }

    private fun getAnimals(){
        viewModelScope.launch{
            animalRepo.getAnimals(8)
        }
    }
}