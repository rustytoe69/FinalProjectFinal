package com.example.finalprojectfinal

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.example.finalprojectfinal.databinding.FragmentMainBinding
import android.media.MediaPlayer
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast
import androidx.activity.viewModels
import androidx.core.view.MenuHost
import androidx.core.view.MenuProvider
import androidx.navigation.findNavController
import androidx.fragment.app.setFragmentResultListener
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Lifecycle
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import androidx.fragment.app.viewModels
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.google.android.material.snackbar.Snackbar


class MainFragment : Fragment() {

    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!

    private val viewModel: ViewModel by activityViewModels()

    lateinit var mediaPlayer: MediaPlayer

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding= FragmentMainBinding.inflate(inflater, container, false)
        val rootView = binding.root

        mediaPlayer=MediaPlayer.create(context,R.raw.happymusic)
        mediaPlayer.setLooping(true)
        mediaPlayer.start()

        //navigation
        binding.clickMeTextView.setOnClickListener { view ->
            rootView.findNavController().navigate(R.id.action_mainFragment_to_stuffedAnimalListFragment)
            val mySnackbar = Snackbar.make(requireActivity().findViewById(android.R.id.content),R.string.snackbar_text,Snackbar.LENGTH_LONG).show()
        }

        return rootView
    }
}