package com.tazkiyatech.jetpackcompose.experiments.app1

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.tazkiyatech.jetpackcompose.experiments.app1.ui.theme.AppTheme

@Composable
fun MainView(modifier: Modifier = Modifier) {
    Column(modifier = modifier, verticalArrangement = Arrangement.spacedBy(8.dp)) {
        Text("Solution 1", style = MaterialTheme.typography.titleLarge)
        ClickableText1()
        Text("The tapped text will not change in appearance whilst it is pressed down.")
        Divider(thickness = 1.dp)
        Text("Solution 2", style = MaterialTheme.typography.titleLarge)
        ClickableText2()
        Text("The tapped text will change in appearance whilst it is pressed down.")
    }
}

@Preview(showBackground = true)
@Composable
fun MainViewPreview() {
    AppTheme {
        MainView()
    }
}