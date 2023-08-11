package com.proj.composematerial3.navigationpages

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.proj.composematerial3.ColorSchemesItems
import com.proj.composematerial3.getColorSchemes

@Composable
fun ColorSchemes() {

    val colorSchemes = getColorSchemes()

    LazyColumn (
        modifier = Modifier
            .padding(10.dp)
    ){
        items(colorSchemes) { colorScheme ->
            EachBoxesOfColors(colorScheme)
        }
    }
}

@Composable
fun EachBoxesOfColors(colorScheme: ColorSchemesItems) {

    Column {
        Text(
            text = colorScheme.colorCat,
            style = MaterialTheme.typography.headlineMedium
        )
        Surface(
            modifier = Modifier
                .border(
                    shape = RoundedCornerShape(8.dp),
                    width = 2.dp,
                    color = Color.White
                ),
            shape = RoundedCornerShape(8.dp)
        ) {
            Column {
                for (color in colorScheme.schemes) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(45.dp)
                            .clipToBounds()
                            .background(color.color),

                    ) {
                        Text(
                            text = color.name,
                            modifier = Modifier
                                .align(
                                    alignment = Alignment.CenterStart
                                )
                                .padding(10.dp)
                        )
                    }
                }
            }
        }
    }
    Spacer(
        modifier = Modifier
            .height(20.dp)
    )
}

@Preview
@Composable
fun ColorSchemesPrev() {
    ColorSchemes()
}