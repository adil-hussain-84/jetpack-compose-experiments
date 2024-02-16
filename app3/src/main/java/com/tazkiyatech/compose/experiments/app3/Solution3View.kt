package com.tazkiyatech.compose.experiments.app3

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.IntState
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import com.tazkiyatech.compose.experiments.app3.theme.AppTheme

@Composable
fun Solution3View(
    modifier: Modifier = Modifier,
    viewModel: Solution3ViewModel = viewModel(),
) {
    Log.d("App3", "Solution3View() called")

    val count = viewModel.countState.intValue

    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        Text(
            text = stringResource(id = R.string.solution_3_description),
            textAlign = TextAlign.Justify,
            style = MaterialTheme.typography.bodyMedium
        )
        Text(
            text = "Count is $count",
            style = MaterialTheme.typography.bodyLarge
        )
        Button(onClick = { viewModel.incrementCount() }) {
            Text(text = "Increment Count")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Solution3ViewPreview() {
    AppTheme { Solution3View() }
}

class Solution3ViewModel : ViewModel() {

    private val _countState = mutableIntStateOf(0)
    val countState: IntState = _countState

    fun incrementCount() {
        _countState.intValue++
    }
}
