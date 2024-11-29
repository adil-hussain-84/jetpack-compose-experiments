package com.tazkiyatech.compose.experiments.app5

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.clearAndSetSemantics
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.heading
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.tazkiyatech.compose.experiments.app5.theme.AppTheme

@Composable
fun Demo2View(modifier: Modifier = Modifier) {
    val labelText = "Date completed"
    val buttonText = "November 2024"

    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.spacedBy(4.dp),
    ) {
        Text(
            text = "Demo 2",
            modifier = Modifier.semantics { heading() },
            style = MaterialTheme.typography.titleLarge,
        )
        Text(
            text = "We're giving the Row below a \"contentDescription\" value of \"Date completed November 2024\" and we're clearing the Text and Button's semantics. TalkBack will read \"Date completed November 2024\" when you select the Row."
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .semantics { contentDescription = "$labelText $buttonText" },
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Text(
                text = labelText,
                modifier = Modifier.clearAndSetSemantics { },
            )
            Spacer(modifier = Modifier.width(4.dp))
            Button(
                onClick = { },
                modifier = Modifier.clearAndSetSemantics { },
            ) {
                Text(buttonText)
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
