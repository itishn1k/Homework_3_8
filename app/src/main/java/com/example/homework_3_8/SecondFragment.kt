package com.example.homework_3_8

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.homework_3_8.databinding.FragmentSecondBinding
import com.example.homework_3_8.Character

class SecondFragment : Fragment() {
    private lateinit var binding: FragmentSecondBinding
    private lateinit var navArgs: SecondFragmentArgs

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSecondBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        arguments?.let {
            navArgs= SecondFragmentArgs.fromBundle(it)
        }
        binding.tvStatus.text = navArgs.character.status
        binding.tvName.text=navArgs.character.name
        binding.ivImage.loadImage(navArgs.character.image!!)
    }

}