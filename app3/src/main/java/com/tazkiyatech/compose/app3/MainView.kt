package com.tazkiyatech.compose.app3

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.IntState
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun MainView(
    solution3CountState: IntState,
    solution3IncrementCountCallback: () -> Unit,
    solution4CountState: IntState,
    solution4IncrementCountCallback: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Text(text = "Solution 1", style = MaterialTheme.typography.titleLarge)
        Solution1View()
        Divider(thickness = 1.dp)
        Text(text = "Solution 2", style = MaterialTheme.typography.titleLarge)
        Solution2View()
        Divider(thickness = 1.dp)
        Text(text = "Solution 3", style = MaterialTheme.typography.titleLarge)
        Solution3View(solution3CountState, solution3IncrementCountCallback)
        Divider(thickness = 1.dp)
        Text(text = "Solution 4", style = MaterialTheme.typography.titleLarge)
        Solution4View(solution4CountState, solution4IncrementCountCallback)
    }
}

@Preview(showBackground = true)
@Composable
fun MainViewPreview() {
    AppTheme {
        val solution3CountState = remember { mutableIntStateOf(0) }
        val solution4CountState = remember { mutableIntStateOf(0) }

        MainView(
            solution3CountState = solution3CountState,
            solution3IncrementCountCallback = { solution3CountState.intValue++ },
            solution4CountState = solution4CountState,
            solution4IncrementCountCallback = { solution4CountState.intValue++ },
        )
    }
}
