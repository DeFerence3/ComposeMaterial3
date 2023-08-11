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
import com.proj.composematerial3.getComponents

@Composable
fun Components() {

    val components = getComponents()

    LazyColumn(
        modifier = Modifier
            .padding(10.dp)
            .fillMaxWidth()
    ) {
        itemsIndexed(components) { index,component ->
            TextButton(onClick = { /*TODO*/ }) {
                Text(text = "${index+1}) $component")
            }
        }
    }
}