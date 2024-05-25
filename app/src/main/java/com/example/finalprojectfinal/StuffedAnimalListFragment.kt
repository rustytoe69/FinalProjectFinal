package com.example.finalprojectfinal

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.activityViewModels
import androidx.navigation.findNavController
import com.example.finalprojectfinal.databinding.FragmentMainBinding
import com.example.finalprojectfinal.databinding.FragmentStuffedAnimalListBinding
import com.google.android.material.snackbar.Snackbar

class StuffedAnimalListFragment : Fragment() {
    private var _binding: FragmentStuffedAnimalListBinding? = null
    private val binding get() = _binding!!

    private val viewModel: ViewModel by activityViewModels()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding= FragmentStuffedAnimalListBinding.inflate(inflater, container, false)
        val rootView = binding.root
        //navigation
        binding.newStuffedAnimalTextView.setOnClickListener { view ->
            rootView.findNavController().navigate(R.id.action_stuffedAnimalListFragment_to_addStuffedAnimalFragment)
        }

// TODO: change this stuff for the recycler view
//        binding.newStuffedAnimalTextView.setOnClickListener { view ->
//            rootView.findNavController().navigate(R.id.action_stuffedAnimalListFragment_to_addStuffedAnimalFragment)
//        }



        return rootView
    }
}