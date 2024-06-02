package com.example.finalprojectfinal
import androidx.lifecycle.ViewModel

class ViewModel:ViewModel() {
    private val _stuffedAnimals = mutableListOf<StuffedAnimal>()
    val stuffedAnimals:MutableList<StuffedAnimal>
        get()=_stuffedAnimals

    private var _currentStuffedAnimal:StuffedAnimal = StuffedAnimal("other","Bob","00-00-0000")
    val currentStuffedAnimal:StuffedAnimal
        get()=_currentStuffedAnimal


    fun addStuffedAnimal(newStuffedAnimal: StuffedAnimal){
        _stuffedAnimals.add(newStuffedAnimal)
    }
}