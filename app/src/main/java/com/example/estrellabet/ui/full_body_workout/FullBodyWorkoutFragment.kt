package com.example.estrellabet.ui.full_body_workout

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.example.estrellabet.databinding.FragmentFullBodyWorkoutBinding
import com.example.estrellabet.ui.GraphViewModel
import com.example.estrellabet.util.Graph

class FullBodyWorkoutFragment : Fragment() {

    private lateinit var binding: FragmentFullBodyWorkoutBinding
    private val graphViewModel: GraphViewModel by activityViewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFullBodyWorkoutBinding.inflate(inflater, container, false)
        binding.btnWorkoutBack.setOnClickListener {
            graphViewModel.loadState(Graph.HOME_FITNESS_SALON)
        }
        binding.btnLetsGo.setOnClickListener {
            graphViewModel.loadState(Graph.DYNAMIC_WARM_UP)
        }
        return binding.root
    }

}