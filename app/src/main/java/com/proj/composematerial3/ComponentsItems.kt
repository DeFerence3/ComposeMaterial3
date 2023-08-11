package com.proj.composematerial3

import androidx.compose.ui.graphics.Color

data class ComponentItems(val comp: String, val route: String)
data class Components(val name: String, val color: Color)

fun getComponents(): List<String> {
    return listOf(
        "Badges",
        "BottomAppBars",
        "BottomSheets",
        "Buttons",
        "Cards",
        "Carousel",
        "Checkboxes",
        "Dividers",
        "Chips",
        "DatePicker",
        "Dialogs",
        "FABS",
        "IconButtons",
        "Menu",
        "List",
        "Navigation Bars",
        "Navigation Drawer",
        "Navigation Rails",
        "Progress Indicators",
        "Radio Buttons",
        "Search",
        "Segmented Buttons",
        "Side Sheets",
        "Sliders",
        "Snack Bars",
        "Switch",
        "Tabs",
        "Text Fields",
        "Time Picker",
        "Tooltips",
        "Top app bars"
    )
}
