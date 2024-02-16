package com.tazkiyatech.compose.experiments.app3

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import com.tazkiyatech.compose.experiments.app3.theme.AppTheme

@Composable
fun Solution6View(
    modifier: Modifier = Modifier,
    viewModel: Solution6ViewModel = viewModel(),
) {
    Log.d("App3", "Solution6View() called")

    val countState = viewModel.countStateFlow.collectAsStateWithLifecycle(initialValue = 0)

    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        Text(
            text = stringResource(id = R.string.solution_6_description),
            textAlign = TextAlign.Justify,
            style = MaterialTheme.typography.bodyMedium
        )
        Text(
            text = "Count is ${countState.value}",
            style = MaterialTheme.typography.bodyLarge
        )
        Button(onClick = { viewModel.incrementCount() }) {
            Text(text = "Increment Count")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Solution6ViewPreview() {
    AppTheme { Solution6View() }
}

class Solution6ViewModel(private val savedStateHandle: SavedStateHandle) : ViewModel() {

    val countStateFlow = savedStateHandle.getStateFlow("count", 0)

    fun incrementCount() {
        savedStateHandle["count"] = countStateFlow.value + 1
    }
}
