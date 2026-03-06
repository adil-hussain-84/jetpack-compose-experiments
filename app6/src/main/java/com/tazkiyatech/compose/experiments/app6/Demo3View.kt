package com.tazkiyatech.compose.experiments.app6

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.heading
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.intl.LocaleList
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.tazkiyatech.compose.experiments.app6.theme.AppTheme

@Composable
fun Demo3View(modifier: Modifier = Modifier) {

    val arabicText = buildAnnotatedString {
        withStyle(style = SpanStyle(localeList = LocaleList("ar"))) {
            append("أهلاً وسهلاً")
        }
    }

    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(0.dp),
        horizontalAlignment = Alignment.Start,
    ) {
        Text(
            text = "Experiment 3",
            modifier = Modifier.semantics { heading() },
            style = MaterialTheme.typography.titleLarge,
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = arabicText)
        Text(
            text = "The Arabic text above declares Arabic locale via a SpanStyle.",
            style = MaterialTheme.typography.bodyLarge,
        )
    }
}

@Preview(showBackground = true)
@Composable
fun Demo3ViewPreview() {
    AppTheme {
        Demo3View()
    }
}
