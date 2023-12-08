package com.tazkiyatech.jetpackcompose.experiments.app3

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.tazkiyatech.jetpackcompose.experiments.app3.ui.theme.AppTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            AppTheme {
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    MainView()
                }
            }
        }
    }
}

@Composable
private fun MainView(modifier: Modifier = Modifier) {
    val context = LocalContext.current

    Column {
        Text(
            text = "Hello from the Main screen!",
            modifier = modifier
        )
        Button(onClick = {
            context.startActivity(Intent(context, AboutActivity::class.java))
        }) {
            Text(text = "Show About screen")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainViewPreview() {
    AppTheme {
        MainView()
    }
}