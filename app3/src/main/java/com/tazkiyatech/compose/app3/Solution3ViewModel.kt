package com.tazkiyatech.compose.app3

import androidx.compose.runtime.MutableIntState
import androidx.compose.runtime.mutableIntStateOf
import androidx.lifecycle.ViewModel

class Solution3ViewModel : ViewModel() {

    var count: MutableIntState = mutableIntStateOf(0)
        private set

    fun incrementCount() {
        count.intValue++
    }
}
