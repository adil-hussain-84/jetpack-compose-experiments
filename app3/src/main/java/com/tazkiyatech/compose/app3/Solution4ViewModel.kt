package com.tazkiyatech.compose.app3

import androidx.compose.runtime.IntState
import androidx.compose.runtime.mutableIntStateOf
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel

class Solution4ViewModel(val savedStateHandle: SavedStateHandle) : ViewModel() {

    private val _count = mutableIntStateOf(savedStateHandle.getOrDefault("count", 0))
    val count: IntState = _count

    fun incrementCount() {
        _count.intValue++
        savedStateHandle["count"] = _count.intValue
    }
}
