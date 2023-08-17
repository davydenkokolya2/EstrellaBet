package com.example.estrellabet.ui.home_fitness_salon

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.estrellabet.databinding.FragmentHomeFitnessSalonBinding
import com.example.estrellabet.ui.GraphViewModel
import com.example.estrellabet.util.Graph

class HomeFitnessSalonFragment : Fragment() {


    private val graphViewModel: GraphViewModel by activityViewModels()
    private lateinit var binding: FragmentHomeFitnessSalonBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeFitnessSalonBinding.inflate(inflater, container, false)

        binding.btnHomeBody.setOnClickListener {
            graphViewModel.loadState(Graph.HOME_WORKOUTS)
        }
        binding.btnHomeCrossfit.setOnClickListener {
            graphViewModel.loadState(Graph.HOME_WORKOUTS)
        }
        binding.btnHomePilates.setOnClickListener {
            graphViewModel.loadState(Graph.HOME_WORKOUTS)
        }
        binding.btnHomeSwimming.setOnClickListener {
            graphViewModel.loadState(Graph.HOME_WORKOUTS)
        }
        return binding.root
    }
}