package com.tazkiyatech.compose.app3

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun Solution3View(
    modifier: Modifier = Modifier,
    viewModel: Solution3ViewModel
) {
    val count = viewModel.count.observeAsState()

    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        Text(text = "Count is ${count.value}", style = MaterialTheme.typography.bodyLarge)
        Button(onClick = { viewModel.incrementCount() }) {
            Text(text = "Increment Count")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Solution3ViewPreview() {
    AppTheme {
        Solution3View(viewModel = Solution3ViewModel())
    }
}
