package com.example.estrellabet.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.activity.viewModels
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import com.example.estrellabet.R
import com.example.estrellabet.databinding.ActivityMainBinding
import com.example.estrellabet.ui.dynamic_warm_up.DynamicWarmUpFragment
import com.example.estrellabet.ui.full_body_workout.FullBodyWorkoutFragment
import com.example.estrellabet.ui.home_fitness_salon.HomeFitnessSalonFragment
import com.example.estrellabet.ui.home_workouts.HomeWorkoutsFragment
import com.example.estrellabet.ui.onboarding.OnboardingFragment
import com.example.estrellabet.util.Graph
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val graphViewModel: GraphViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)

        lifecycleScope.launch {
            graphViewModel.stateGraph.collect {
                when(it) {
                    Graph.ONBOARDING -> replaceFragment(OnboardingFragment())
                    Graph.DYNAMIC_WARM_UP -> replaceFragment(DynamicWarmUpFragment())
                    Graph.FULL_BODY_WORKOUTS -> replaceFragment(FullBodyWorkoutFragment())
                    Graph.HOME_FITNESS_SALON -> replaceFragment(HomeFitnessSalonFragment())
                    Graph.HOME_WORKOUTS -> replaceFragment(HomeWorkoutsFragment())
                }
            }
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentContainerView, fragment)
        fragmentTransaction.commit()
    }
}