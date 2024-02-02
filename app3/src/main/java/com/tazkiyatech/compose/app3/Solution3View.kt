package com.tazkiyatech.compose.app3

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

@Composable
fun Solution3View(
    countLiveData: LiveData<Int>,
    incrementCountCallback: () -> Unit,
    modifier: Modifier = Modifier,
) {
    val countState = countLiveData.observeAsState()

    Log.d("App3", "Solution3View")

    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        Text(text = "Count is ${countState.value}", style = MaterialTheme.typography.bodyLarge)
        Button(onClick = { incrementCountCallback() }) {
            Text(text = "Increment Count")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Solution3ViewPreview() {
    AppTheme {
        Solution3View(countLiveData = MutableLiveData(0), incrementCountCallback = { })
    }
}