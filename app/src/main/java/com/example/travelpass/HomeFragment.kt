package com.example.travelpass

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.travelpass.databinding.ActivityNavHostBinding
import com.example.travelpass.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater, container,false)

       binding.busTopUp.setOnClickListener{
           it.findNavController().navigate(R.id.action_homeFragment_to_BRSFragment)
       }

        return binding.root
    }
}