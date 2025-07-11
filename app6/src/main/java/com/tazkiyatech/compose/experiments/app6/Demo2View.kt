package com.tazkiyatech.compose.experiments.app6

import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.semantics.heading
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.style.TextDirection
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.tazkiyatech.compose.experiments.app6.theme.AppTheme
import java.util.Locale

@Composable
fun Demo2View(modifier: Modifier = Modifier) {

    val currentConfig = LocalConfiguration.current
    val arabicConfig = Configuration(currentConfig).apply {
        setLocale(Locale.forLanguageTag("ar"))
    }

    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = "Experiment 2 (override locale)",
            modifier = Modifier.semantics { heading() },
            style = MaterialTheme.typography.titleLarge,
        )
        Column(
            verticalArrangement = Arrangement.spacedBy(0.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Text(
                text = "Hello in Arabic is",
                style = MaterialTheme.typography.bodyLarge,
            )
            CompositionLocalProvider(LocalConfiguration provides arabicConfig) {
                Text(
                    text = "أهلاً وسهلاً",
                    style = MaterialTheme.typography.bodyLarge.copy(textDirection = TextDirection.Rtl),
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Demo2ViewPreview() {
    AppTheme {
        Demo2View()
    }
}
