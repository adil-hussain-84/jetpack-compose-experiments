package com.tazkiyatech.compose.experiments.app5

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.calculateEndPadding
import androidx.compose.foundation.layout.calculateStartPadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.heading
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.max
import com.tazkiyatech.compose.experiments.app5.theme.AppTheme

@OptIn(ExperimentalMaterial3Api::class)
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    topBar = {
                        TopAppBar(
                            title = {
                                Text(
                                    text = stringResource(R.string.app_name),
                                    modifier = Modifier.semantics { heading() },
                                )
                            },
                            colors = topAppBarColors(
                                containerColor = MaterialTheme.colorScheme.primaryContainer,
                                titleContentColor = MaterialTheme.colorScheme.primary,
                            ),
                        )
                    }
                ) { innerPadding ->
                    MainView(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(calculatePadding(innerPadding))
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
