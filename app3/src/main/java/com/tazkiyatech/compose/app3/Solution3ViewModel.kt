package com.tazkiyatech.compose.app3

import androidx.compose.runtime.IntState
import androidx.compose.runtime.mutableIntStateOf
import androidx.lifecycle.ViewModel

class Solution3ViewModel : ViewModel() {

    private val _countState = mutableIntStateOf(0)
    val countState: IntState = _countState

    fun incrementCount() {
        _countState.intValue++
    }
}
