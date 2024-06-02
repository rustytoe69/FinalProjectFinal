package com.example.finalprojectfinal

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.RecyclerView
import com.example.finalprojectfinal.databinding.ListItemLayoutBinding
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.activityViewModels

class StuffedAnimalAdapter (val stuffedAnimalList: List<StuffedAnimal>,val viewModel: ViewModel): RecyclerView.Adapter<StuffedAnimalViewHolder>() {
//    private val viewModel: ViewModel by activityViewModels()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StuffedAnimalViewHolder {
        val binding = ListItemLayoutBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        //refresh recycler view here?
        return StuffedAnimalViewHolder(binding, viewModel)
    }

    override fun getItemCount(): Int {
        return stuffedAnimalList.size
    }

    override fun onBindViewHolder(holder: StuffedAnimalViewHolder, position: Int) {
        val currentStuffedAnimal = stuffedAnimalList[position]
        holder.bindStuffedAnimal(currentStuffedAnimal)
    }

}