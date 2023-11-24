package com.tazkiyatech.jetpackcompose.experiments.app1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.unit.dp
import com.tazkiyatech.jetpackcompose.experiments.app1.ui.theme.AppTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            AppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column(modifier = Modifier.padding(16.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {
                        Text("Solution 1", style = MaterialTheme.typography.titleLarge)
                        ClickableText1()
                        Text("However, the tapped text will not change in appearance whilst it is pressed down.")
                        Divider(thickness = 1.dp)
                        Text("Solution 2", style = MaterialTheme.typography.titleLarge)
                        ClickableText2()
                        Text("Here the tapped text will change in appearance whilst it is pressed down.")
                    }
                }
            }
        }
    }
}