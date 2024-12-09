# Demo: Two different ways of detecting which word in a text is tapped

This Jetpack Compose Android application demonstrates how to wire up a text element to perform different actions
depending on which part of its text is tapped.

You'll find two different solutions in this app, as follows:

* [ClickableText1][1] – This is the simpler of the two solutions but it has a shortcoming: It has does not change appearance when the clickable parts of the text are pressed down.
* [ClickableText2][2] – This is the more complicated of the two solutions but it has an advantage: It changes appearance to show which of the clickable parts of the text are pressed down.

Both solutions are built with [Text][3], [AnnotatedString][4], [pointerInput][5] and [detectTapGestures][6].
The difference between the two  is that
[ClickableText2][2] provides an `onPress` and `onTap` block into [detectTapGestures][6]
whilst [ClickableText1][1] provides an `onTap` block only.

When you run the app, you will see a user interface as follows:

<img src="Screenshot.png" alt="Screenshot of application" width=25%>

[1]: src/main/java/com/tazkiyatech/compose/experiments/app1/ClickableText1.kt
[2]: src/main/java/com/tazkiyatech/compose/experiments/app1/ClickableText2.kt
[3]: https://developer.android.com/reference/kotlin/androidx/compose/material/package-summary#Text(kotlin.String,androidx.compose.ui.Modifier,androidx.compose.ui.graphics.Color,androidx.compose.ui.unit.TextUnit,androidx.compose.ui.text.font.FontStyle,androidx.compose.ui.text.font.FontWeight,androidx.compose.ui.text.font.FontFamily,androidx.compose.ui.unit.TextUnit,androidx.compose.ui.text.style.TextDecoration,androidx.compose.ui.text.style.TextAlign,androidx.compose.ui.unit.TextUnit,androidx.compose.ui.text.style.TextOverflow,kotlin.Boolean,kotlin.Int,kotlin.Int,kotlin.Function1,androidx.compose.ui.text.TextStyle)
[4]: https://developer.android.com/reference/kotlin/androidx/compose/ui/text/AnnotatedString
[5]: https://developer.android.com/reference/kotlin/androidx/compose/ui/Modifier#(androidx.compose.ui.Modifier).pointerInput(kotlin.Any,androidx.compose.ui.input.pointer.PointerInputEventHandler)
[6]: https://developer.android.com/reference/kotlin/androidx/compose/foundation/gestures/package-summary#(androidx.compose.ui.input.pointer.PointerInputScope).detectTapGestures(kotlin.Function1,kotlin.Function1,kotlin.coroutines.SuspendFunction2,kotlin.Function1)
