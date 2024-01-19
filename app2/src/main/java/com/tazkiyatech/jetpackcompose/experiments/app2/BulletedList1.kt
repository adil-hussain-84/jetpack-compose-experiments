package com.tazkiyatech.jetpackcompose.experiments.app2

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.ParagraphStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.rememberTextMeasurer
import androidx.compose.ui.text.style.TextIndent
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tazkiyatech.jetpackcompose.experiments.app2.theme.AppTheme

@Composable
fun BulletedList1(modifier: Modifier = Modifier) {
    Column(verticalArrangement = Arrangement.spacedBy(3.dp)) {
        BulletedText(text = "This is a long piece of text which will span over to a second line and will indent to the right of the bullet point.")
        BulletedText(text = "This is another long piece of text which will span over to a second line and will indent to the right of the bullet point.")
    }
}

@Preview(showBackground = true)
@Composable
fun BulletedList1Preview() {
    AppTheme {
        BulletedList1()
    }
}

/**
 * The logic in this function for measuring the width of the bullet character
 * is inspired by [this Stack Overflow answer](https://stackoverflow.com/a/77614718/1071320).
 */
@Composable
private fun BulletedText(text: String) {
    val bulletString = "\u2022 "
    val textStyle = MaterialTheme.typography.bodyLarge

    val textMeasurer = rememberTextMeasurer()

    val bulletStringWidth = remember(textStyle, textMeasurer) {
        textMeasurer.measure(text = bulletString, style = textStyle).size.width
    }

    val restLine = with(LocalDensity.current) { bulletStringWidth.toSp() }

    val textIndent = TextIndent(firstLine = 0.sp, restLine = restLine)
    val paragraphStyle = ParagraphStyle(textIndent = textIndent)

    val annotatedString = buildAnnotatedString {
        withStyle(style = paragraphStyle) {
            append(bulletString)
            append(text)
        }
    }

    Text(text = annotatedString, style = textStyle)
}
