package com.tazkiyatech.compose.app3

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel

class Solution6ViewModel(private val savedStateHandle: SavedStateHandle) : ViewModel() {

    val countStateFlow = savedStateHandle.getStateFlow("count", 0)

    fun incrementCount() {
        savedStateHandle["count"] = countStateFlow.value + 1
    }
}
