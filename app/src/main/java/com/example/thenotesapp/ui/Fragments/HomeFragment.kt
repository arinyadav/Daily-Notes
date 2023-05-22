package com.example.thenotesapp.ui.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.thenotesapp.R
import com.example.thenotesapp.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
   lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        binding=FragmentHomeBinding.inflate(layoutInflater,container,false)

        binding.floatingbuttonhome.setOnClickListener {
          Navigation.findNavController(it).navigate((R.id.action_homeFragment2_to_createNotesFragment2))
        }
        return binding.root
    }
}