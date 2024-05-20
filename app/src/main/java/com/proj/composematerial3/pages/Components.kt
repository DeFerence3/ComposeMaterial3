package com.proj.composematerial3.pages

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.proj.composematerial3.ComponentItems
import com.proj.composematerial3.getComponents
import com.proj.composematerial3.screen.CompScreen

@Composable
fun Components() {

    val navController = rememberNavController()
    val components = getComponents()
    CompNavController(navController,components)
}

@Composable
fun ComponentsListScreen(navController: NavHostController, components: List<ComponentItems>) {

    LazyColumn(
        modifier = Modifier
            .padding(10.dp)
            .fillMaxWidth()
    ) {
        itemsIndexed(components) { index,component ->
            TextButton(onClick = {
                component.comp
            }) {
                Text(text = "${index+1}) ${component.comp}")
            }
        }
    }

}

@Composable
fun CompNavController(navController: NavHostController, components: List<ComponentItems>) {
    NavHost(
        navController = navController,
        startDestination = "components-list",
    ) {
        composable("components-list") {
            ComponentsListScreen(navController,components)
        }
        components.forEach { comp ->
            composable(comp.comp) {
                comp.route
            }
        }
        /*composable("component-screen") {
            CompScreen()
        }*/
    }
}