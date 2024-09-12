package com.tazkiyatech.compose.experiments.app4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.tazkiyatech.compose.experiments.app4.ui.theme.AppTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MainView(modifier = Modifier
                        .padding(innerPadding)
                        .fillMaxSize())
                }
            }
        }
    }
}

@Composable
fun MainView(modifier: Modifier = Modifier) {
    Column(modifier = modifier, horizontalAlignment = Alignment.CenterHorizontally) {
        Button(
            colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.primary),
            onClick = {}
        ) {
            Text(text = "Tap me")
        }
        OutlinedButton(
            border = BorderStroke(1.5.dp, MaterialTheme.colorScheme.onSurface),
            onClick = {},
        ) {
            Text(
                text = "Tap me",
                color = MaterialTheme.colorScheme.onSurface
            )
        }
    }
}

@Preview(name = "Phone", device = Devices.PHONE, showSystemUi = true)
@Composable
fun MainViewPreview() {
    AppTheme {
        MainView(modifier = Modifier.fillMaxSize())
    }
}
