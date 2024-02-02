package com.tazkiyatech.compose.app3

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class Solution3ViewModel: ViewModel() {

    private val _count = MutableLiveData(0)
    val count: LiveData<Int> = _count

    fun incrementCount() {
        _count.value = _count.value!! + 1
    }
}
