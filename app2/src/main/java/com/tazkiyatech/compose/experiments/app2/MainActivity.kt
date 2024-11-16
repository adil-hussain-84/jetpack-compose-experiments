package com.tazkiyatech.compose.experiments.app2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.calculateEndPadding
import androidx.compose.foundation.layout.calculateStartPadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.max
import com.tazkiyatech.compose.experiments.app2.theme.AppTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MainView(
                        modifier = Modifier
                            .padding(calculatePadding(innerPadding))
                            .fillMaxSize()
                    )
                }
            }
        }
    }
}

@Composable
private fun calculatePadding(innerPadding: PaddingValues): PaddingValues {
    val layoutDirection = LocalLayoutDirection.current

    val innerStartPadding = innerPadding.calculateStartPadding(layoutDirection)
    val innerEndPadding = innerPadding.calculateEndPadding(layoutDirection)
    val innerTopPadding = innerPadding.calculateTopPadding()
    val innerBottomPadding = innerPadding.calculateBottomPadding()

    val minimumPadding = 16.dp

    return PaddingValues(
        start = max(innerStartPadding, minimumPadding),
        top = max(innerTopPadding, minimumPadding),
        end = max(innerEndPadding, minimumPadding),
        bottom = max(innerBottomPadding, minimumPadding)
    )
}
