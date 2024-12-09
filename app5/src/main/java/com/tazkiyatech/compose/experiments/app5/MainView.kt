package com.tazkiyatech.compose.experiments.app5

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.HorizontalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.tazkiyatech.compose.experiments.app5.theme.AppTheme

@Composable
fun MainView(modifier: Modifier = Modifier) {
    val scrollState = rememberScrollState()

    Column(
        modifier = modifier.verticalScroll(scrollState),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        Demo1View()
        HorizontalDivider(thickness = 1.dp)
        Spacer(modifier = Modifier.height(4.dp))
        Demo2View()
        HorizontalDivider(thickness = 1.dp)
        Spacer(modifier = Modifier.height(4.dp))
        Demo3View()
        HorizontalDivider(thickness = 1.dp)
        Spacer(modifier = Modifier.height(4.dp))
        Demo4View()
    }
}

@Preview(showBackground = true)
@Composable
fun MainViewPreview() {
    AppTheme {
        MainView()
    }
}
