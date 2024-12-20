package com.tazkiyatech.compose.experiments.app1

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.tazkiyatech.compose.experiments.app1.theme.AppTheme

// TODO: Think about accessibility and TalkBack in particular: Is it possible to offer the different links in a single Text element as separate TalkBack actions?
@Composable
fun MainView(modifier: Modifier = Modifier) {
    Column(modifier = modifier, verticalArrangement = Arrangement.spacedBy(8.dp)) {
        Text("Solution 1", style = MaterialTheme.typography.titleLarge)
        ClickableText1()
        Text("The clickable parts of the text above do not change in appearance whilst you press down on them.")
        HorizontalDivider(thickness = 1.dp)
        Text("Solution 2", style = MaterialTheme.typography.titleLarge)
        ClickableText2()
        Text("The clickable parts of the text above change in appearance whilst you press down on them.")
    }
}

@Preview(showBackground = true)
@Composable
fun MainViewPreview() {
    AppTheme {
        MainView()
    }
}
