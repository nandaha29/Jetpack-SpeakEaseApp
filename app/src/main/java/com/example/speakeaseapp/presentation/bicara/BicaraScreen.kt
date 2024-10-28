package com.example.speakeaseapp.presentation.bicara

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.speakeaseapp.components.BottomBar

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BicaraScreen(navController: NavController) {
    Scaffold(
        topBar = { TopAppBar(title = { Text("Home") }) },
        bottomBar = { BottomBar(navController) }
    ) { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
        ) {
            Text(text = "Welcome to Home Screen", style = MaterialTheme.typography.headlineLarge)
        }
    }
}


