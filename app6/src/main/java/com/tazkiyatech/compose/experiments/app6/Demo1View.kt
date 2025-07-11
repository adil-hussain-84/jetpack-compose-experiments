package com.tazkiyatech.compose.experiments.app6

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.heading
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.style.TextDirection
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.tazkiyatech.compose.experiments.app6.theme.AppTheme

@Composable
fun Demo1View(modifier: Modifier = Modifier) {

    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = "Experiment 1 (no locale override)",
            modifier = Modifier.semantics { heading() },
            style = MaterialTheme.typography.titleLarge,
        )
        Column(
            verticalArrangement = Arrangement.spacedBy(0.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Text(
                text = "Hello in Arabic is",
                style = MaterialTheme.typography.bodyLarge,
            )
            Text(
                text = "أهلاً وسهلاً",
                style = MaterialTheme.typography.bodyLarge.copy(textDirection = TextDirection.Rtl),
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Demo1ViewPreview() {
    AppTheme {
        Demo1View()
    }
}
