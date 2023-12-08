package com.masabi.jetpackcompose.experiments.app2

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.masabi.jetpackcompose.experiments.app2.ui.theme.AppTheme

@Composable
fun MainView(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun MainViewPreview() {
    AppTheme {
        MainView("Android")
    }
}