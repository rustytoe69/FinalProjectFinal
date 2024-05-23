package com.example.finalprojectfinal

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.example.finalprojectfinal.databinding.FragmentAddStuffedAnimalBinding
import com.example.finalprojectfinal.databinding.FragmentMainBinding
import com.example.finalprojectfinal.databinding.FragmentStuffedAnimalListBinding

class AddStuffedAnimalFragment : Fragment() {

    private var _binding: FragmentAddStuffedAnimalBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding= FragmentAddStuffedAnimalBinding.inflate(inflater, container, false)
        val rootView = binding.root

        //for setting up spinner
        val stuffedAnimalArrayAdapter = ArrayAdapter.createFromResource(requireActivity(),
            R.array.stuffed_animal_types,android.R.layout.simple_spinner_item)
        stuffedAnimalArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding.animalTypeSpinner.adapter=stuffedAnimalArrayAdapter
        return rootView
    }
}