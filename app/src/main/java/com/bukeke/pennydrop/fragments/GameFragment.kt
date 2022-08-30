package com.bukeke.pennydrop.fragments

import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.bukeke.pennydrop.R
import com.bukeke.pennydrop.databinding.FragmentGameBinding
import com.bukeke.pennydrop.viewModels.GameViewModel

class GameFragment : Fragment() {

    private val gameViewModel by activityViewModels<GameViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = FragmentGameBinding.inflate(inflater,container,false).apply {
            vm = gameViewModel
            textCurrentTurnInfo.movementMethod = ScrollingMovementMethod()
        lifecycleOwner = viewLifecycleOwner
        }

        return binding.root
    }


}