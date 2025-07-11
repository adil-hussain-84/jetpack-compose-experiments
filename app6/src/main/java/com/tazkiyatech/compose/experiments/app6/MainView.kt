package com.tazkiyatech.compose.experiments.app6

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.tazkiyatech.compose.experiments.app6.theme.AppTheme

@Composable
fun MainView(modifier: Modifier = Modifier) {
    val introductoryMessage =
        "Run this app with TalkBack enabled on your device. If your device has its primary language set to a language that is not Arabic, you will notice that TalkBack does not read out the Arabic text."

    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = introductoryMessage,
            style = MaterialTheme.typography.bodyLarge,
        )
        Demo1View()
        Demo2View()
    }
}

@Preview(showBackground = true)
@Composable
fun MainViewPreview() {
    AppTheme {
        MainView()
    }
}
