package com.example.estrellabet.ui.onboarding

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.example.estrellabet.R
import com.example.estrellabet.databinding.FragmentOnboardingBinding
import com.example.estrellabet.ui.GraphViewModel
import com.example.estrellabet.util.Graph

class OnboardingFragment : Fragment() {


    private lateinit var binding: FragmentOnboardingBinding
    private val graphViewModel: GraphViewModel by activityViewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentOnboardingBinding.inflate(inflater, container, false)
        binding.root.setOnClickListener {
            graphViewModel.loadState(Graph.HOME_FITNESS_SALON)
        }
        return binding.root
    }
}