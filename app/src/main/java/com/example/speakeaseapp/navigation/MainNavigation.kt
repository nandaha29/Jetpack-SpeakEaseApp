package com.example.speakeaseapp.navigation

import androidx.compose.runtime.Composable
import androidx.core.splashscreen.SplashScreen
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.speakeaseapp.presentation.splash.SplashScreen
import com.example.speakeaseapp.presentation.bicara.BicaraScreen

@Composable
fun MainNavigation(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "splash") {
        composable("splash") {
            SplashScreen(navController)
        }
        composable("home") {
            BicaraScreen(navController)
        }
        // Tambahkan screen lain di sini
    }
}