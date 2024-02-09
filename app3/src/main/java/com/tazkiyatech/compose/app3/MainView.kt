package com.tazkiyatech.compose.app3

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.HorizontalDivider
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
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.tazkiyatech.compose.app3.theme.AppTheme

@Composable
fun MainView(
    solution3CountState: IntState,
    solution3IncrementCountCallback: () -> Unit,
    solution4CountState: IntState,
    solution4IncrementCountCallback: () -> Unit,
    solution5CountLiveData: LiveData<Int>,
    solution5IncrementCountCallback: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Log.d("App3", "MainView() called")

    Column(
        modifier = modifier,
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
        Solution3View(solution3CountState, solution3IncrementCountCallback)
        HorizontalDivider(thickness = 1.dp)
        Text(text = "Solution 4", style = MaterialTheme.typography.titleLarge)
        Solution4View(solution4CountState, solution4IncrementCountCallback)
        HorizontalDivider(thickness = 1.dp)
        Text(text = "Solution 5", style = MaterialTheme.typography.titleLarge)
        Solution5View(solution5CountLiveData, solution5IncrementCountCallback)
    }
}

@Preview(showBackground = true)
@Composable
fun MainViewPreview() {
    AppTheme {
        val solution3CountState = remember { mutableIntStateOf(0) }
        val solution4CountState = remember { mutableIntStateOf(0) }
        val solution5CountLiveData = MutableLiveData(0)

        val solution3IncrementCountCallback: () -> Unit = { solution3CountState.intValue++ }
        val solution4IncrementCountCallback: () -> Unit = { solution4CountState.intValue++ }
        val solution5IncrementCountCallback = { solution5CountLiveData.value = solution5CountLiveData.value!! + 1 }

        MainView(
            solution3CountState = solution3CountState,
            solution3IncrementCountCallback = solution3IncrementCountCallback,
            solution4CountState = solution4CountState,
            solution4IncrementCountCallback = solution4IncrementCountCallback,
            solution5CountLiveData = solution5CountLiveData,
            solution5IncrementCountCallback = solution5IncrementCountCallback,
        )
    }
}
