package com.example.estrellabet.ui.home_workouts

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.estrellabet.databinding.FragmentHomeWorkoutsBinding
import com.example.estrellabet.ui.GraphViewModel
import com.example.estrellabet.util.Graph

class HomeWorkoutsFragment : Fragment() {


    private lateinit var binding: FragmentHomeWorkoutsBinding
    private val graphViewModel: GraphViewModel by activityViewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeWorkoutsBinding.inflate(inflater, container, false)
        binding.btn16Workouts.setOnClickListener {
            graphViewModel.loadState(Graph.FULL_BODY_WORKOUTS)
        }
        binding.btn23Workouts.setOnClickListener {
            graphViewModel.loadState(Graph.FULL_BODY_WORKOUTS)
        }
        return binding.root
    }

}