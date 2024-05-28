package com.example.finalprojectfinal

import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.finalprojectfinal.databinding.ListItemLayoutBinding
import androidx.navigation.findNavController


class StuffedAnimalViewHolder(val binding: ListItemLayoutBinding) :
    RecyclerView.ViewHolder(binding.root) {
    private lateinit var currentStuffedAnimal: StuffedAnimal

    init {
        binding.root.setOnClickListener { view ->
            //should refresh recycler view here????
            //this code is for responding to presses in the recycler view
            binding.root.findNavController()
                .navigate(R.id.action_stuffedAnimalListFragment_to_stuffedAnimalDetailsFragment)
        }
    }

    fun bindStuffedAnimal(stuffedAnimal: StuffedAnimal) {
        currentStuffedAnimal = stuffedAnimal
        binding.stuffedAnimalName.text = currentStuffedAnimal.name
        binding.stuffedAnimalImage.setImageResource(currentStuffedAnimal.returnImageResourceId())
    }
}
