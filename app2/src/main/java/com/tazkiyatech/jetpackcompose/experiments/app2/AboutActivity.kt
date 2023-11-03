package com.tazkiyatech.jetpackcompose.experiments.app2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.tazkiyatech.jetpackcompose.experiments.app2.ui.theme.AppTheme

class AboutActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            AppTheme {
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    AboutView()
                }
            }
        }
    }
}

@Composable
private fun AboutView(modifier: Modifier = Modifier) {
    Text(
        text = "Hello from the About screen!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun AboutViewPreview() {
    AppTheme {
        AboutView()
    }
}