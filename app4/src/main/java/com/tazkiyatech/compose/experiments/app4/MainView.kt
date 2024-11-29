package com.tazkiyatech.compose.experiments.app4

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.LocalRippleConfiguration
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.RippleConfiguration
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.tazkiyatech.compose.experiments.app4.theme.AppTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainView(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = "Jetpack Compose Buttons' Experiment",
            style = MaterialTheme.typography.titleMedium,
        )
        Button(
            onClick = {},
            modifier = Modifier.fillMaxWidth(),
        ) {
            Text(text = "Tap me. I'm a Button which has the default container colour, default content colour and default ripple configuration.")
        }
        OutlinedButton(
            onClick = {},
            modifier = Modifier.fillMaxWidth(),
        ) {
            Text(text = "Tap me. I'm an OutlinedButton which has the default container colour, default content colour and default ripple configuration.")
        }
        CompositionLocalProvider(LocalRippleConfiguration provides RippleConfiguration(MaterialTheme.colorScheme.secondary)) {
            Button(
                onClick = {},
                modifier = Modifier.fillMaxWidth(),
            ) {
                Text(text = "Tap me. I'm a Button which has the default container colour, default content colour and a custom ripple configuration.")
            }
        }
        CompositionLocalProvider(LocalRippleConfiguration provides RippleConfiguration(MaterialTheme.colorScheme.secondary)) {
            OutlinedButton(
                onClick = {},
                modifier = Modifier.fillMaxWidth(),
            ) {
                Text(text = "Tap me. I'm an OutlinedButton which has the default container colour, default content colour and a custom ripple configuration.")
            }
        }
        Button(
            onClick = {},
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(
                containerColor = MaterialTheme.colorScheme.secondaryContainer,
                contentColor = MaterialTheme.colorScheme.onSecondaryContainer
            )
        ) {
            Text(text = "Tap me. I'm an Button which has a custom container colour, custom content colour and default ripple configuration.")
        }
        OutlinedButton(
            onClick = {},
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.outlinedButtonColors(
                containerColor = MaterialTheme.colorScheme.onSecondaryContainer,
                contentColor = MaterialTheme.colorScheme.secondaryContainer
            ),
            border = BorderStroke(1.5.dp, MaterialTheme.colorScheme.secondaryContainer),
        ) {
            Text(
                text = "Tap me. I'm an OutlinedButton which has a custom container colour, custom content colour and default ripple configuration.",
            )
        }
    }
}

@Preview(name = "Phone", device = Devices.PIXEL, showSystemUi = true)
@Composable
fun MainViewPreview() {
    AppTheme {
        MainView()
    }
}
