package com.example.finalprojectfinal

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.example.finalprojectfinal.databinding.FragmentMainBinding
import com.example.finalprojectfinal.databinding.FragmentStuffedAnimalDetailsBinding

class StuffedAnimalDetailsFragment : Fragment() {

    private var _binding: FragmentStuffedAnimalDetailsBinding? = null
    private val binding get() = _binding!!

    private val viewModel: ViewModel by activityViewModels()



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding= FragmentStuffedAnimalDetailsBinding.inflate(inflater, container, false)
        val rootView = binding.root

        //setting ui
        binding.dateOfBirthDateTextView.text=viewModel.currentStuffedAnimal.birthdate
        binding.nameTextView.text=viewModel.currentStuffedAnimal.name
        binding.imageView.setImageResource(viewModel.currentStuffedAnimal.returnImageResourceId())




        return rootView    }
}