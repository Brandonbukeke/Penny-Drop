package com.bukeke.pennydrop.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.bukeke.pennydrop.R
import com.bukeke.pennydrop.databinding.FragmentPickPlayersBinding
import com.bukeke.pennydrop.viewModels.GameViewModel
import com.bukeke.pennydrop.viewModels.PickPlayersViewModel


class PickPlayersFragment : Fragment() {
    //override fun onCreate(savedInstanceState: Bundle?) {
       // super.onCreate(savedInstanceState)

    //}
    private  val pickPlayersViewModel by activityViewModels<PickPlayersViewModel>()
    private val gameViewModel by activityViewModels<GameViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentPickPlayersBinding.inflate(inflater, container, false)
            .apply {
            this.vm = pickPlayersViewModel
            this.buttonPlayGame.setOnClickListener {
                gameViewModel.startGame(
                    pickPlayersViewModel.players.value?.filter { newPlayer ->
                        newPlayer.isIncluded.get()
                    }?.map { newPlayer -> newPlayer.toPlayer()
                    }?: emptyList()
                )
                findNavController().navigate(R.id.gameFragment)
            }
        }

        return binding.root
        // Inflate the layout for this fragment

    }


}