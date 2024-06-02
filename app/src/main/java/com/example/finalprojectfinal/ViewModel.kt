package com.example.finalprojectfinal
import androidx.lifecycle.ViewModel

class ViewModel:ViewModel() {
    private val _stuffedAnimals = mutableListOf<StuffedAnimal>()
    val stuffedAnimals:MutableList<StuffedAnimal>
        get()=_stuffedAnimals

    private lateinit var _currentStuffedAnimal:StuffedAnimal
    val currentStuffedAnimal:StuffedAnimal
        get()=_currentStuffedAnimal

    fun setCurrentStuffedAnimal(StuffedAnimalEx:StuffedAnimal){
        _currentStuffedAnimal = StuffedAnimalEx
    }
    fun addStuffedAnimal(newStuffedAnimal: StuffedAnimal){
        _stuffedAnimals.add(newStuffedAnimal)
    }
}