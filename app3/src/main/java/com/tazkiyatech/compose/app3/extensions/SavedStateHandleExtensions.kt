package com.tazkiyatech.compose.app3.extensions

import androidx.lifecycle.SavedStateHandle

fun <T> SavedStateHandle.getOrDefault(key: String, default: T): T {
    return get<T>(key) ?: default
}
