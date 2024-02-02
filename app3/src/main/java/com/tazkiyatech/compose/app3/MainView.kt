package com.tazkiyatech.compose.app3

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.tazkiyatech.compose.app3.ui.theme.AppTheme

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
