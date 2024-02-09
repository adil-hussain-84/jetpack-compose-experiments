package com.tazkiyatech.compose.experiments.app3

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.tazkiyatech.compose.experiments.app3.theme.AppTheme

@Composable
fun MainView(modifier: Modifier = Modifier) {
    Log.d("App3", "MainView() called")

    Column(
        modifier = modifier.verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Text(text = "Solution 1", style = MaterialTheme.typography.titleLarge)
        Solution1View()
        HorizontalDivider(thickness = 1.dp)
        Text(text = "Solution 2", style = MaterialTheme.typography.titleLarge)
        Solution2View()
        HorizontalDivider(thickness = 1.dp)
        Text(text = "Solution 3", style = MaterialTheme.typography.titleLarge)
        Solution3View()
        HorizontalDivider(thickness = 1.dp)
        Text(text = "Solution 4", style = MaterialTheme.typography.titleLarge)
        Solution4View()
        HorizontalDivider(thickness = 1.dp)
        Text(text = "Solution 5", style = MaterialTheme.typography.titleLarge)
        Solution5View()
        HorizontalDivider(thickness = 1.dp)
        Text(text = "Solution 6", style = MaterialTheme.typography.titleLarge)
        Solution6View()
    }
}

@Preview(showBackground = true)
@Composable
fun MainViewPreview() {
    AppTheme { MainView() }
}
