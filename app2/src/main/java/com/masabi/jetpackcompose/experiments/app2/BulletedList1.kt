package com.masabi.jetpackcompose.experiments.app2

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.masabi.jetpackcompose.experiments.app2.ui.theme.AppTheme

@Composable
fun BulletedList1(modifier: Modifier = Modifier) {
    Column(verticalArrangement = Arrangement.spacedBy(3.dp)) {
        BulletedText(text = "This is a long piece of text which will span over to a second line but won't indent to the right of the bullet point.")
        BulletedText(text = "This is another long piece of text which will span over to a second line and won't indent to the right of the bullet point.")
    }
}

@Preview(showBackground = true)
@Composable
fun BulletedList1Preview() {
    AppTheme {
        BulletedList1()
    }
}

@Composable
private fun BulletedText(text: String) {
    Text(
        text = "• $text",
        style = MaterialTheme.typography.bodyLarge
    )
}
