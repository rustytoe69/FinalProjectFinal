package com.example.finalprojectfinal

import android.media.MediaPlayer
import android.widget.Toast
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.RecyclerView
import com.example.finalprojectfinal.databinding.ListItemLayoutBinding
import androidx.navigation.findNavController
import androidx.fragment.app.activityViewModels


class StuffedAnimalViewHolder(val binding: ListItemLayoutBinding, val viewModel: ViewModel): RecyclerView.ViewHolder(binding.root){
//    private val viewModel: ViewModel by activityViewModels()

    private lateinit var currentStuffedAnimal: StuffedAnimal

    init {
        binding.root.setOnClickListener { view ->
            //this code is for responding to presses in the recycler view
            viewModel.setCurrentStuffedAnimal(currentStuffedAnimal)
            binding.root.findNavController()
                .navigate(R.id.action_stuffedAnimalListFragment_to_stuffedAnimalDetailsFragment)
        }
    }

    fun bindStuffedAnimal(stuffedAnimal: StuffedAnimal) {
        currentStuffedAnimal = stuffedAnimal
        binding.stuffedAnimalNameText.text = currentStuffedAnimal.name
        binding.stuffedAnimalImage.setImageResource(currentStuffedAnimal.returnImageResourceId())
    }
}
