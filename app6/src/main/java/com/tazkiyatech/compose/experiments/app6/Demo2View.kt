package com.tazkiyatech.compose.experiments.app6

import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.semantics.heading
import androidx.compose.ui.semantics.semantics
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
        verticalArrangement = Arrangement.spacedBy(0.dp),
        horizontalAlignment = Alignment.Start,
    ) {
        Text(
            text = "Experiment 2",
            modifier = Modifier.semantics { heading() },
            style = MaterialTheme.typography.titleLarge,
        )
        Spacer(modifier = Modifier.height(8.dp))
        CompositionLocalProvider(LocalConfiguration provides arabicConfig) {
            Text(text = "أهلاً وسهلاً")
        }
        Text(
            text = "The Arabic text above declares Arabic locale via CompositionLocalProvider.",
            style = MaterialTheme.typography.bodyLarge,
        )
    }
}

@Preview(showBackground = true)
@Composable
fun Demo2ViewPreview() {
    AppTheme {
        Demo2View()
    }
}
