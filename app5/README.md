# Demo: Three different ways of merging a Row's descendant Text and Button for TalkBack

This Jetpack Compose Android application demonstrates three different ways
of merging a [Row][1]'s descendant [Text][2] and [Button][3] for TalkBack.
This is important because, by default,
TalkBack does not merge the contents of a [Row][1] which contains a [Text][2] and [Button][3]
when you specify `mergeDescendants = true` on the [Row][1].
What it does is read the contents of the [Text][2] only when the [Row][1] is focused
and it still finds the [Button][3] as an individually focusable item.
See [this Stack Overflow question][4] for a more detailed explanation of the problem.

When you run the app, you will see a user interface as follows:

<img src="Screenshot.png" alt="Screenshot of application" width=25%>

[1]: https://developer.android.com/reference/kotlin/androidx/compose/foundation/layout/package-summary#Row(androidx.compose.ui.Modifier,androidx.compose.foundation.layout.Arrangement.Horizontal,androidx.compose.ui.Alignment.Vertical,kotlin.Function1)
[2]: https://developer.android.com/reference/kotlin/androidx/compose/material3/package-summary#Text(kotlin.String,androidx.compose.ui.Modifier,androidx.compose.ui.graphics.Color,androidx.compose.ui.unit.TextUnit,androidx.compose.ui.text.font.FontStyle,androidx.compose.ui.text.font.FontWeight,androidx.compose.ui.text.font.FontFamily,androidx.compose.ui.unit.TextUnit,androidx.compose.ui.text.style.TextDecoration,androidx.compose.ui.text.style.TextAlign,androidx.compose.ui.unit.TextUnit,androidx.compose.ui.text.style.TextOverflow,kotlin.Boolean,kotlin.Int,kotlin.Int,kotlin.Function1,androidx.compose.ui.text.TextStyle)
[3]: https://developer.android.com/reference/kotlin/androidx/compose/material3/package-summary#Button(kotlin.Function0,androidx.compose.ui.Modifier,kotlin.Boolean,androidx.compose.ui.graphics.Shape,androidx.compose.material3.ButtonColors,androidx.compose.material3.ButtonElevation,androidx.compose.foundation.BorderStroke,androidx.compose.foundation.layout.PaddingValues,androidx.compose.foundation.interaction.MutableInteractionSource,kotlin.Function1)
[4]: https://stackoverflow.com/q/79238107/1071320
