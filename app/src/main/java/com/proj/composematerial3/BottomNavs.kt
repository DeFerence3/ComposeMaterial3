package com.proj.composematerial3

data class BottomNavs(
    val title: String,
    val selectedIcon: Int,
    val unselectedIcon: Int,
    val route: String,
    val hasBadge: Boolean
)