# Demo: Two different ways of setting a Button's ripple colour

This Jetpack Compose Android application demonstrates
two different ways of setting a [Button][1]'s ripple colour.
One approach is to use [RippleConfiguration][3].
The other approach is to specify the [Button][1]'s content colour
by means of its `colors` parameter.

When you run the app, you will see a user interface as follows:

<img src="Screenshot.png" alt="Screenshot of application" width=25%>

## Further reading

1. [How do I set the ripple colour of my button to one of the colours in my theme now that "RippleTheme" is deprecated?][2]

[1]: https://developer.android.com/reference/kotlin/androidx/compose/material3/package-summary#Button(kotlin.Function0,androidx.compose.ui.Modifier,kotlin.Boolean,androidx.compose.ui.graphics.Shape,androidx.compose.material3.ButtonColors,androidx.compose.material3.ButtonElevation,androidx.compose.foundation.BorderStroke,androidx.compose.foundation.layout.PaddingValues,androidx.compose.foundation.interaction.MutableInteractionSource,kotlin.Function1)
[2]: https://stackoverflow.com/q/78952850/1071320
[3]: https://developer.android.com/reference/kotlin/androidx/compose/material3/RippleConfiguration
