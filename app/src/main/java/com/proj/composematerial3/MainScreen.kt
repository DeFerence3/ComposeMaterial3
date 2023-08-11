package com.proj.composematerial3

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.proj.composematerial3.navigationpages.ColorSchemes
import com.proj.composematerial3.navigationpages.Components
import com.proj.composematerial3.navigationpages.Typographys

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen() {

    val navItems = listOf(
        BottomNavs(
            title = "ColorSchemes",
            selectedIcon = R.drawable.baseline_palette_24,
            unselectedIcon = R.drawable.outline_palette_24,
            route = "colorschemes",
            hasBadge = true
        ),
        BottomNavs(
            title = "Components",
            selectedIcon = R.drawable.baseline_style_24,
            unselectedIcon = R.drawable.outline_style_24,
            route = "components",
            hasBadge = true
        ),
        BottomNavs(
            title = "Typographys",
            selectedIcon = R.drawable.baseline_text_fields_24,
            unselectedIcon = R.drawable.outline_text_fields_24,
            route = "typographys",
            hasBadge = true
        ),
    )

    val navController = rememberNavController()

    val selectedItemIndex by rememberSaveable {
       mutableStateOf(0)
    }
    
    Scaffold(
        bottomBar = {
            NavigationBar {

                val navBackStackEntry by navController.currentBackStackEntryAsState()
                val currentDestination = navBackStackEntry?.destination

                navItems.forEachIndexed { index, bottomNavs -> 
                    NavigationBarItem(
                        selected = currentDestination?.hierarchy?.any { it.route == bottomNavs.route } == true,
                        onClick = {
                            navController.navigate(bottomNavs.route) {
                                popUpTo(navController.graph.findStartDestination().id) {
                                    saveState = true
                                }
                                launchSingleTop = true
                                restoreState = true
                            }
                        },
                        label = { Text(text = bottomNavs.title) },
                        icon = {
                            Icon(
                                painter = painterResource(
                                    id = if(index == selectedItemIndex){
                                        bottomNavs.selectedIcon
                                    } else {
                                        bottomNavs.unselectedIcon
                                    }),
                                contentDescription = bottomNavs.title
                            )
                        }
                    )
                }
            }
        },
    ) {
        NavController(navController,it)
    }
}

@Composable
fun NavController(navController: NavHostController, paddingValues: PaddingValues) {
    NavHost(
        navController = navController,
        startDestination = "colorschemes",
        Modifier.padding(paddingValues)
    ) {
        composable("colorschemes") {
            ColorSchemes()
        }
        composable("typographys") {
            Typographys()
        }
        composable("components") {
            Components()
        }
    }
}
