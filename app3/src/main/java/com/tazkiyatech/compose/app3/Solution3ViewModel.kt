package com.tazkiyatech.compose.app3

import androidx.compose.runtime.IntState
import androidx.compose.runtime.mutableIntStateOf
import androidx.lifecycle.ViewModel

class Solution3ViewModel : ViewModel() {

    private val _count = mutableIntStateOf(0)
    val count: IntState = _count

    fun incrementCount() {
        _count.intValue++
    }
}
