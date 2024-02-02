package com.tazkiyatech.compose.app3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {

    private val solution3ViewModel: Solution3ViewModel by viewModels()
    private val solution4ViewModel: Solution4ViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            AppTheme {
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    MainView(
                        modifier = Modifier.padding(16.dp),
                        solution3CountState = solution3ViewModel.count,
                        solution3IncrementCountCallback = { solution3ViewModel.incrementCount() },
                        solution4CountState = solution4ViewModel.count,
                        solution4IncrementCountCallback = { solution4ViewModel.incrementCount() },
                    )
                }
            }
        }
    }
}
