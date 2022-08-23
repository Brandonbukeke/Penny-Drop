package com.bukeke.pennydrop.fragments

import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bukeke.pennydrop.R
import com.bukeke.pennydrop.databinding.FragmentGameBinding

class GameFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = FragmentGameBinding.inflate(inflater,container,false).apply {
            textCurrentTurnInfo.movementMethod = ScrollingMovementMethod()}

        return binding.root
    }


}