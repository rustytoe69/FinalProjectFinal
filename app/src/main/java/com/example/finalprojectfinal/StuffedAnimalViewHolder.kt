package com.example.finalprojectfinal

import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.finalprojectfinal.databinding.ListItemLayoutBinding

class StuffedAnimalViewHolder(val binding: ListItemLayoutBinding) :
    RecyclerView.ViewHolder(binding.root) {
    private lateinit var currentStuffedAnimal: StuffedAnimal

    init{
        binding.root.setOnClickListener{view->
           //should refresh recycler view here????
        }
    }
    fun bindStuffedAnimal(stuffedAnimal: StuffedAnimal) {
        currentStuffedAnimal = stuffedAnimal
        binding.stuffedAnimalName.text = currentStuffedAnimal.name
        binding.stuffedAnimalImage.setImageResource(currentStuffedAnimal.returnImageResourceId())
    }
}
