package com.masabi.jetpackcompose.experiments.app2

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.masabi.jetpackcompose.experiments.app2.ui.theme.AppTheme

@Composable
fun BulletedList2(modifier: Modifier = Modifier) {
    Column(verticalArrangement = Arrangement.spacedBy(3.dp)) {
        BulletedText(text = "This is a long piece of text which will span over to a second line and will indent to the right of the bullet point.")
        BulletedText(text = "This is another long piece of text which will span over to a second line and will indent to the right of the bullet point.")
    }
}

@Preview(showBackground = true)
@Composable
fun BulletedList2Preview() {
    AppTheme {
        BulletedList2()
    }
}

@Composable
private fun BulletedText(text: String) {
    Row() {
        Text(
            text = "• ",
            style = MaterialTheme.typography.bodyLarge
        )
        Text(
            text = text,
            style = MaterialTheme.typography.bodyLarge
        )
    }
}
