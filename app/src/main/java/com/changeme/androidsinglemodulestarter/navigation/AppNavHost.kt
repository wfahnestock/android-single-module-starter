package com.changeme.androidsinglemodulestarter.navigation

import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.changeme.androidsinglemodulestarter.presentation.view.FirstDestination
import com.changeme.androidsinglemodulestarter.presentation.view.SecondDestination

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
) {
    NavHost(
        navController = navController,
        startDestination = FirstDestination,
        enterTransition = {
            fadeIn(animationSpec = tween(400))
        },
        exitTransition = {
            fadeOut(animationSpec = tween(400))
        }
    ) {
        composable<FirstDestination> {
            FirstDestination(
                onNavigateToSecondDestination = {
                    navController.navigate(SecondDestination)
                }
            )
        }

        composable<SecondDestination> {
            SecondDestination(
                onAppBarBackPressed = { navController.navigateUp() }
            )
        }
    }
}