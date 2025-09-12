package com.tazkiyatech.compose.experiments.app7

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.calculateEndPadding
import androidx.compose.foundation.layout.calculateStartPadding
import androidx.compose.foundation.layout.displayCutout
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.NavigationDrawerItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.tazkiyatech.compose.experiments.app7.theme.AppTheme
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppTheme {
                MainScreen()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen() {
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val scope = rememberCoroutineScope()
    var selectedItemTitle by remember { mutableStateOf("Home") }

    ModalNavigationDrawer(
        drawerState = drawerState,
        drawerContent = {
            ModalDrawerSheet {
                DrawerContent(selectedItemTitle) { newItemTitle ->
                    selectedItemTitle = newItemTitle
                    scope.launch {
                        drawerState.close()
                    }
                }
            }
        }
    ) {
        Scaffold(
            modifier = Modifier.fillMaxSize(),
            topBar = {
                TopAppBar(
                    title = { Text(selectedItemTitle) },
                    navigationIcon = {
                        IconButton(onClick = {
                            scope.launch {
                                if (drawerState.isClosed) drawerState.open() else drawerState.close()
                            }
                        }) {
                            Icon(
                                imageVector = Icons.Filled.Menu,
                                contentDescription = "Open navigation drawer"
                            )
                        }
                    }
                )
            }
        ) { innerPadding ->
            Greeting(
                name = "Content for $selectedItemTitle",
                modifier = Modifier.padding(innerPadding)
            )
        }
    }
}

@Composable
fun DrawerContent(currentItemTitle: String, onItemClick: (String) -> Unit) {
    val drawerItems = listOf(
        "Home" to Icons.Filled.Home,
        "Settings" to Icons.Filled.Settings,
        "Info" to Icons.Filled.Info,
    )
    val scrollState = rememberScrollState()

    Column(
        modifier = Modifier
            .padding(NavigationDrawerItemDefaults.ItemPadding)
            .verticalScroll(scrollState)
    ) {
        Spacer(Modifier.height(12.dp))
        drawerItems.forEach { (title, icon) ->
            NavigationDrawerItem(
                icon = { Icon(icon, contentDescription = title) },
                label = { Text(title) },
                selected = title == currentItemTitle,
                onClick = { onItemClick(title) },
                modifier = Modifier.padding(NavigationDrawerItemDefaults.ItemPadding)
            )
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    val displayCutoutPaddingValues = WindowInsets.displayCutout.asPaddingValues()

    val displayCutoutStartPaddingDp = displayCutoutPaddingValues
        .calculateStartPadding(LocalLayoutDirection.current)

    val displayCutoutEndPaddingDp = displayCutoutPaddingValues
        .calculateEndPadding(LocalLayoutDirection.current)

    Text(
        text = "Hello $name!",
        modifier = modifier
            .padding(16.dp)
            .padding(
                start = displayCutoutStartPaddingDp,
                end = displayCutoutEndPaddingDp,
            )
    )
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    AppTheme {
        MainScreen()
    }
}
