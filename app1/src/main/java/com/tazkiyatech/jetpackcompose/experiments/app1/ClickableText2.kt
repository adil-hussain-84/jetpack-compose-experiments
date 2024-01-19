package com.tazkiyatech.jetpackcompose.experiments.app1

import android.content.Context
import android.util.Log
import android.widget.Toast
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextLayoutResult
import androidx.compose.ui.tooling.preview.Preview
import com.tazkiyatech.jetpackcompose.experiments.app1.theme.AppTheme

@Composable
fun ClickableText2() {

    val context = LocalContext.current

    var pressedCharacterPosition by remember { mutableStateOf<Int?>(null) }

    var layoutResult by remember { mutableStateOf<TextLayoutResult?>(null) }

    val pointerInputModifier = Modifier.pointerInput(Unit) {
        detectTapGestures(
            onPress = { offset ->
                val unwrappedLayoutResult = layoutResult ?: return@detectTapGestures

                pressedCharacterPosition = unwrappedLayoutResult.getOffsetForPosition(offset)
                Log.d("ClickableText2", "onPress(characterPosition = $pressedCharacterPosition)")

                val pressWasReleased = tryAwaitRelease()

                Log.d("ClickableText2", "pressWasReleased = $pressWasReleased")

                pressedCharacterPosition = null
            },
            onTap = { offset ->
                val unwrappedLayoutResult = layoutResult ?: return@detectTapGestures

                val characterPosition = unwrappedLayoutResult.getOffsetForPosition(offset)
                Log.d("ClickableText2", "onTap(characterPosition = $characterPosition)")
                onClick(context, characterPosition)
            }
        )
    }

    Text(
        text = getText(pressedCharacterPosition),
        modifier = Modifier.then(pointerInputModifier),
        style = MaterialTheme.typography.bodyLarge,
        onTextLayout = { layoutResult = it }
    )
}

private fun onClick(context: Context, characterPosition: Int) {
    Log.d("ClickableText2", "onClick(offset = $characterPosition)")

    val annotations = getText(pressedCharacterPosition = null).getStringAnnotations(
        tag = "Link",
        start = characterPosition - 1,
        end = characterPosition - 1
    )

    val annotation = annotations.firstOrNull() ?: return

    Toast.makeText(context, annotation.item, Toast.LENGTH_SHORT).show()
}

@Preview(showBackground = true)
@Composable
fun ClickableText2Preview() {
    AppTheme {
        ClickableText2()
    }
}
