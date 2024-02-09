package com.tazkiyatech.compose.app3

import androidx.lifecycle.LiveData
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel

class Solution5ViewModel(savedStateHandle: SavedStateHandle) : ViewModel() {

    private val _countLiveData = savedStateHandle.getLiveData("count", 0)
    val countLiveData: LiveData<Int> = _countLiveData

    fun incrementCount() {
        _countLiveData.value = _countLiveData.value!! + 1
    }
}
