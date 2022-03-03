package com.example.animalrand.model.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.animalrand.api.ApiInterface
import com.example.animalrand.model.data.Animal
import com.example.animalrand.model.dto.AnimalDTO
import com.example.animalrand.view.utils.toModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import ru.gildor.coroutines.retrofit.awaitResult
import javax.inject.Inject

import ru.gildor.coroutines.retrofit.Result

class AnimalRepoImp @Inject constructor(
    private val api: ApiInterface
): AnimalRepoInterface {

    private var _mutableList = MutableLiveData<List<Animal>>().apply {
        value = emptyList()
    }
    val listLiveData:LiveData<List<Animal>> = _mutableList

    override suspend fun getAnimals(many: Int) {
        when(val result = withContext(Dispatchers.IO){
            api.getRandAnimals(many).awaitResult()
        }){
            is Result.Ok -> {
                _mutableList.value = rawToModel(result.value)
            }
            is Result.Error->{
                println("testing2, ${result.exception}")
            }
            is Result.Exception ->{
                println("testing3, ${result.exception}")
            }
        }
    }

    private fun rawToModel(rawList: List<AnimalDTO>):List<Animal>{
        for (rawItem in rawList){
            rawItem.toModel()
        }
        return emptyList()
    }
}