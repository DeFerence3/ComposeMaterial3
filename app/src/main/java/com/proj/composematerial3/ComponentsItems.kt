package com.proj.composematerial3

import androidx.compose.runtime.Composable
import com.proj.composematerial3.pages.Badges
import com.proj.composematerial3.pages.TopAppBars


data class ComponentItems(val comp: String, val route: Unit?)
/* data class Components(val name: String, val color: Color) */

@Composable
fun getComponents(): List<ComponentItems> {
/*    return listOf(
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
        "List",
        "Menu",
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
    ) */

    return listOf(
        ComponentItems(" Badges ", Badges()),
        ComponentItems(" BottomAppBars ",null),
        ComponentItems(" BottomSheets ",null),
        ComponentItems(" Buttons ",null),
        ComponentItems(" Cards ",null),
        ComponentItems(" Carousel ",null),
        ComponentItems(" Checkboxes ",null),
        ComponentItems(" Dividers ",null),
        ComponentItems(" Chips ",null),
        ComponentItems(" DatePicker ",null),
        ComponentItems(" Dialogs ",null),
        ComponentItems(" FABS ",null),
        ComponentItems(" IconButtons ",null),
        ComponentItems(" List ",null),
        ComponentItems(" Menu ",null),
        ComponentItems(" Navigation Bars ",null),
        ComponentItems(" Navigation Drawer ",null),
        ComponentItems(" Navigation Rails ",null),
        ComponentItems(" Progress Indicators ",null),
        ComponentItems(" Radio Buttons ",null),
        ComponentItems(" Search ",null),
        ComponentItems(" Segmented Buttons ",null),
        ComponentItems(" Side Sheets ",null),
        ComponentItems(" Sliders ",null),
        ComponentItems(" Snack Bars ",null),
        ComponentItems(" Switch ",null),
        ComponentItems(" Tabs ",null),
        ComponentItems(" Text Fields ",null),
        ComponentItems(" Time Picker ",null),
        ComponentItems(" Tooltips ",null),
        ComponentItems(" Top app bars ", TopAppBars())
    )
}
