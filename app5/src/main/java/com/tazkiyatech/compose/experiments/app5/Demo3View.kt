package com.tazkiyatech.compose.experiments.app5

import android.util.Log
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
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.clearAndSetSemantics
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.heading
import androidx.compose.ui.semantics.role
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.tazkiyatech.compose.experiments.app5.theme.AppTheme

@Composable
fun Demo3View(modifier: Modifier = Modifier) {
    val labelText = "Date completed"
    val buttonText = "November 2024"

    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.spacedBy(4.dp),
    ) {
        Text(
            text = "Demo 3",
            modifier = Modifier.semantics { heading() },
            style = MaterialTheme.typography.titleLarge,
        )
        Text(
            text = "We're calling \"clearAndSetSemantics\" on the Row below and giving it a \"contentDescription\" value of \"Date completed November 2024\". TalkBack will read \"Date completed November 2024\" when you focus on the Row and it won't find the Button as an individually focusable item."
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .clearAndSetSemantics {
                    contentDescription = "$labelText $buttonText"
                    role = Role.Button
                },
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Text(labelText)
            Spacer(modifier = Modifier.width(4.dp))
            Button(onClick = { Log.d("App5", "Date completed button clicked.") }) {
                Text(buttonText)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Demo3ViewPreview() {
    AppTheme {
        Demo3View()
    }
}
