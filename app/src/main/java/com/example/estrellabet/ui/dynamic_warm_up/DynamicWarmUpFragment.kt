package com.example.estrellabet.ui.dynamic_warm_up

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.estrellabet.databinding.FragmentDynamicWarmUpBinding
import com.example.estrellabet.ui.GraphViewModel
import com.example.estrellabet.util.Graph

class DynamicWarmUpFragment : Fragment() {

    private lateinit var binding: FragmentDynamicWarmUpBinding
    private val graphViewModel: GraphViewModel by activityViewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDynamicWarmUpBinding.inflate(inflater, container, false)
        binding.btnWarmUpBack.setOnClickListener {
            graphViewModel.loadState(Graph.FULL_BODY_WORKOUTS)
        }
        binding.btnWarmUpHome.setOnClickListener {
            graphViewModel.loadState(Graph.HOME_FITNESS_SALON)
        }
        return binding.root
    }

}