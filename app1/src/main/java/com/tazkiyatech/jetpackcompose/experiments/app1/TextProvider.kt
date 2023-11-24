package com.tazkiyatech.jetpackcompose.experiments.app1

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.ExperimentalTextApi
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withAnnotation
import androidx.compose.ui.text.withStyle

@OptIn(ExperimentalTextApi::class)
fun getText(pressedCharacterPosition: Int?): AnnotatedString {

    val pressedLinkSpanStyle = SpanStyle(color = Color.Gray, textDecoration = TextDecoration.Underline)
    val defaultLinkSpanStyle = SpanStyle(color = Color.Blue, textDecoration = TextDecoration.Underline)

    return buildAnnotatedString {
        append("You can tap")

        withAnnotation("Link", "Link 1") {
            val linkSpanStyle =
                if (pressedCharacterPosition != null && (pressedCharacterPosition - 1) in length..(length + 5)) {
                    pressedLinkSpanStyle
                } else {
                    defaultLinkSpanStyle
                }

            append(" ")
            withStyle(linkSpanStyle) { append("here") }
            append(" ")
        }

        append("or")

        withAnnotation("Link", "Link 2") {
            val linkSpanStyle =
                if (pressedCharacterPosition != null && (pressedCharacterPosition - 1) in length..(length + 5)) {
                    pressedLinkSpanStyle
                } else {
                    defaultLinkSpanStyle
                }

            append(" ")
            withStyle(linkSpanStyle) { append("here") }
            append(" ")
        }

        append("and you'll see a different popup depending on where you tap.")
    }
}
