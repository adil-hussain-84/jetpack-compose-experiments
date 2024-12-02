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
import androidx.compose.ui.semantics.heading
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.tazkiyatech.compose.experiments.app5.theme.AppTheme

@Composable
fun Demo1View(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.spacedBy(4.dp),
    ) {
        Text(
            text = "Demo 1",
            modifier = Modifier.semantics { heading() },
            style = MaterialTheme.typography.titleLarge,
        )
        Text(
            text = "We're giving the Row below a \"mergeDescendants\" value of \"true\" and we're not clearing or setting additional semantics on the Text or Button. TalkBack will read \"Date completed\" and not \"Date completed November 2024\" when you focus on the Row and it offers the Button as a focusable item."
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .semantics(mergeDescendants = true) {},
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Text("Date completed")
            Spacer(modifier = Modifier.width(4.dp))
            Button(onClick = { }) {
                Text("November 2024")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Demo1ViewPreview() {
    AppTheme {
        Demo1View()
    }
}
