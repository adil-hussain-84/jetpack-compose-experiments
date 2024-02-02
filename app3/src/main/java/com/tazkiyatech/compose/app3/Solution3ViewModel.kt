package com.tazkiyatech.compose.app3

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class Solution3ViewModel: ViewModel() {

    private val _countLiveData = MutableLiveData(0)
    val countLiveData: LiveData<Int> = _countLiveData

    fun incrementCount() {
        _countLiveData.value = _countLiveData.value!! + 1
    }
}
