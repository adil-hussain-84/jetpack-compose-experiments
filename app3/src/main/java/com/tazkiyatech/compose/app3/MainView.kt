package com.tazkiyatech.compose.app3

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

@Composable
fun MainView(
    solution3CountLiveData: LiveData<Int>,
    solution3IncrementCountCallback: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {

        Log.d("App3", "MainView")

        Text(text = "Solution 1", style = MaterialTheme.typography.titleLarge)
        Solution1View()
        Divider(thickness = 1.dp)
        Text(text = "Solution 2", style = MaterialTheme.typography.titleLarge)
        Solution2View()
        Divider(thickness = 1.dp)
        Text(text = "Solution 3", style = MaterialTheme.typography.titleLarge)
        Solution3View(solution3CountLiveData, solution3IncrementCountCallback)
    }
}

@Preview(showBackground = true)
@Composable
fun MainViewPreview() {
    AppTheme {
        MainView(solution3CountLiveData = MutableLiveData(0), solution3IncrementCountCallback = { })
    }
}
