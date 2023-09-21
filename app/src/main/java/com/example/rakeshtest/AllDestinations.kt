package com.example.rakeshtest

import androidx.navigation.NavHostController
import com.example.rakeshtest.AllDestinations.HOME
import com.example.rakeshtest.AllDestinations.SETTINGS
import com.example.rakeshtest.AllDestinations.LOGOUT

object AllDestinations {
    const val HOME = "Home"
    const val SETTINGS = "Settings"
    const val LOGOUT ="Logout"
}

class AppNavigationActions(private val navController: NavHostController) {

    fun navigateToHome() {
        navController.navigate(HOME) {
            popUpTo(HOME)
        }
    }

    fun navigateToSettings() {
        navController.navigate(SETTINGS) {
            launchSingleTop = true
            restoreState = true
        }
    }

    fun navigateToLogout() {
        navController.navigate(LOGOUT) {
            launchSingleTop = true
            restoreState = true
        }
    }
}
