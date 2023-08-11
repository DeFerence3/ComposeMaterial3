package com.proj.composematerial3.navigationpages

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Typographys() {

    Column(modifier = Modifier
        .fillMaxSize()
        .padding(10.dp)
    ) {
        Text(
            text = "displayLarge",
            style = MaterialTheme.typography.displayLarge
        )
        Text(
            text = "displayMedium",
            style = MaterialTheme.typography.displayMedium
        )
        Text(
            text = "displaySmall",
            style = MaterialTheme.typography.displaySmall
        )
        Spacer(
            modifier = Modifier
                .height(10.dp)
        )
        Text(
            text = "headlineLarge",
            style = MaterialTheme.typography.headlineLarge
        )
        Text(
            text = "headlineMedium",
            style = MaterialTheme.typography.headlineMedium
        )
        Text(
            text = "headlineSmall",
            style = MaterialTheme.typography.headlineSmall
        )
        Spacer(
            modifier = Modifier
                .height(10.dp)
        )
        Text(
            text = "titleLarge",
            style = MaterialTheme.typography.titleLarge
        )
        Text(
            text = "titleMedium",
            style = MaterialTheme.typography.titleMedium
        )
        Text(
            text = "titleSmall",
            style = MaterialTheme.typography.titleSmall
        )
        Spacer(
            modifier = Modifier
                .height(10.dp)
        )
        Text(
            text = "bodyLarge",
            style = MaterialTheme.typography.bodyLarge
        )
        Text(
            text = "bodyMedium",
            style = MaterialTheme.typography.bodyMedium
        )
        Text(
            text = "bodySmall",
            style = MaterialTheme.typography.bodySmall
        )
        Spacer(
            modifier = Modifier
                .height(10.dp)
        )
        Text(
            text = "labelLarge",
            style = MaterialTheme.typography.labelLarge
        )
        Text(
            text = "labelMedium",
            style = MaterialTheme.typography.labelMedium
        )
        Text(
            text = "labelSmall",
            style = MaterialTheme.typography.labelSmall
        )
    }
}