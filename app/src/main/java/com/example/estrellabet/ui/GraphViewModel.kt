package com.example.estrellabet.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.estrellabet.util.Graph
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class GraphViewModel @Inject constructor(): ViewModel() {
    private val _stateGraph = MutableStateFlow<Graph>(Graph.ONBOARDING)
    val stateGraph: StateFlow<Graph> = _stateGraph
    fun loadState(graph: Graph) {
        viewModelScope.launch(Dispatchers.IO) {
            _stateGraph.emit(graph)
        }
    }
}