package com.tazkiyatech.compose.app3

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.tazkiyatech.compose.app3.theme.AppTheme
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

@Composable
fun Solution6View(
    countStateFlow: StateFlow<Int>,
    incrementCountCallback: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Log.d("App3", "Solution6View() called")

    val countState = countStateFlow.collectAsStateWithLifecycle(initialValue = 0)

    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        Text(text = "Count is ${countState.value}", style = MaterialTheme.typography.bodyLarge)
        Button(onClick = { incrementCountCallback() }) {
            Text(text = "Increment Count")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Solution6ViewPreview() {
    AppTheme {
        val countStateFlow = MutableStateFlow(0)
        val incrementCountCallback = { countStateFlow.value += 1 }

        Solution6View(countStateFlow, incrementCountCallback)
    }
}
