package com.tazkiyatech.compose.app3

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.IntState
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun Solution4View(
    countState: IntState,
    incrementCountCallback: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Log.d("App3", "Solution4View() called")

    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        Text(text = "Count is ${countState.intValue}", style = MaterialTheme.typography.bodyLarge)
        Button(onClick = { incrementCountCallback() }) {
            Text(text = "Increment Count")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Solution4ViewPreview() {
    AppTheme {
        val countState = remember { mutableIntStateOf(0) }
        Solution4View(countState = countState, incrementCountCallback = { countState.intValue++ })
    }
}
