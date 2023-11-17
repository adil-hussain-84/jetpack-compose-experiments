package com.tazkiyatech.jetpackcompose.experiments.app1

import android.content.Context
import android.util.Log
import android.widget.Toast
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.ExperimentalTextApi
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withAnnotation
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.content.res.TypedArrayUtils.getText
import com.tazkiyatech.jetpackcompose.experiments.app1.ui.theme.AppTheme

@Composable
fun ClickableText1() {
    val context = LocalContext.current

    ClickableText(
        text = getText(),
        style = MaterialTheme.typography.bodyLarge,
        onClick = { onClick(context, it) }
    )
}

@OptIn(ExperimentalTextApi::class)
private fun getText(): AnnotatedString {
    return buildAnnotatedString {
        append("You can tap")

        withAnnotation("Link", "Link 1") {
            append(" ")
            withStyle(SpanStyle(color = Color.Blue, textDecoration = TextDecoration.Underline)) {
                append("here")
            }
            append(" ")
        }

        append("or")

        withAnnotation("Link", "Link 2") {
            append(" ")
            withStyle(SpanStyle(color = Color.Blue, textDecoration = TextDecoration.Underline)) {
                append("here")
            }
            append(" ")
        }

        append("and you'll see a different popup depending on where you tap.")
    }
}

private fun onClick(context: Context, offset: Int) {
    Log.d("ClickableText1", "onClick(offset = $offset)")

    val annotations = getText().getStringAnnotations(
        tag = "Link",
        start = offset -1,
        end = offset - 1
    )

    val annotation = annotations.firstOrNull() ?: return

    Toast.makeText(context, annotation.item, Toast.LENGTH_SHORT).show()
}

@Preview(showBackground = true)
@Composable
fun ClickableText1Preview() {
    AppTheme {
        ClickableText1()
    }
}