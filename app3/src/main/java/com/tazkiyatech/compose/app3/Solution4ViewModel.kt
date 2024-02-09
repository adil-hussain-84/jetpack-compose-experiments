package com.tazkiyatech.compose.app3

import androidx.compose.runtime.IntState
import androidx.compose.runtime.mutableIntStateOf
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel

class Solution4ViewModel(private val savedStateHandle: SavedStateHandle) : ViewModel() {

    private val _countState = mutableIntStateOf(savedStateHandle.getOrDefault("count", 0))
    val countState: IntState = _countState

    fun incrementCount() {
        _countState.intValue++
        savedStateHandle["count"] = _countState.intValue
    }
}
