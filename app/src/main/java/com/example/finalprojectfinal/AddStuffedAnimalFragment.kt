package com.example.finalprojectfinal

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.fragment.app.activityViewModels
import androidx.navigation.findNavController
import com.example.finalprojectfinal.databinding.FragmentAddStuffedAnimalBinding
import com.example.finalprojectfinal.databinding.FragmentMainBinding
import com.example.finalprojectfinal.databinding.FragmentStuffedAnimalListBinding

class AddStuffedAnimalFragment : Fragment() {

    private var _binding: FragmentAddStuffedAnimalBinding? = null
    private val binding get() = _binding!!

    private val viewModel: ViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding= FragmentAddStuffedAnimalBinding.inflate(inflater, container, false)
        val rootView = binding.root

        //for current stuffedAnimal
        val currentStuffedAnimal:StuffedAnimal = StuffedAnimal("other","Bob","00-00-0000")

        //for setting up spinner
        val stuffedAnimalArrayAdapter = ArrayAdapter.createFromResource(requireActivity(),
            R.array.stuffed_animal_types,android.R.layout.simple_spinner_item)
        stuffedAnimalArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding.animalTypeSpinner.adapter=stuffedAnimalArrayAdapter

        //for navigation
        binding.addStuffedAnimalToListTextView.setOnClickListener { view ->
            rootView.findNavController().navigateUp()
            val myToast = Toast.makeText(requireActivity(),R.string.toast_text, Toast.LENGTH_SHORT).show()

        }
        //for spinner
        binding.animalTypeSpinner.onItemSelectedListener =
            object : AdapterView.OnItemSelectedListener {
                override fun onItemSelected(
                    adapterView: AdapterView<*>,
                    view: View,
                    viewPosition: Int,
                    rowId: Long
                ) {
                    currentStuffedAnimal.animalType= adapterView.getItemAtPosition(viewPosition).toString()
                }

                override fun onNothingSelected(adapterView: AdapterView<*>) {
                }
            }

        //setting currentStuffedAnimalValues From Edit Texts
        currentStuffedAnimal.name = binding.nameInput.text.toString()
        currentStuffedAnimal.birthdate = binding.dateOfBirthInput.text.toString()


        //adding plant to viewModel
        viewModel.addStuffedAnimal(currentStuffedAnimal)



        return rootView
    }
}