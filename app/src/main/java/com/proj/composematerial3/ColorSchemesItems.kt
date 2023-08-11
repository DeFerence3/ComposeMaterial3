package com.proj.composematerial3

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

data class ColorSchemesItems(val colorCat: String, val schemes: List<ColorSchemes>)
data class ColorSchemes(val name: String, val color: Color)

@Composable
fun getColorSchemes(): List<ColorSchemesItems> {
    return listOf(
        ColorSchemesItems("Primary",
            listOf(
                ColorSchemes("primary",MaterialTheme.colorScheme.primary),
                ColorSchemes("onPrimary",MaterialTheme.colorScheme.onPrimary),
                ColorSchemes("onPrimaryContainer",MaterialTheme.colorScheme.onPrimaryContainer),
                ColorSchemes("inversePrimary",MaterialTheme.colorScheme.inversePrimary),
                ColorSchemes("primaryContainer",MaterialTheme.colorScheme.primaryContainer),
            )
        ),
        ColorSchemesItems("Secondary",
            listOf(
                ColorSchemes("secondary",MaterialTheme.colorScheme.secondary),
                ColorSchemes("onSecondary",MaterialTheme.colorScheme.onSecondary),
                ColorSchemes("secondaryContainer",MaterialTheme.colorScheme.secondaryContainer),
                ColorSchemes("onSecondaryContainer",MaterialTheme.colorScheme.onSecondaryContainer),
            )
        ),
        ColorSchemesItems("Tertiary",
            listOf(
                ColorSchemes("tertiary",MaterialTheme.colorScheme.tertiary),
                ColorSchemes("onTertiary",MaterialTheme.colorScheme.onTertiary),
                ColorSchemes("tertiaryContainer",MaterialTheme.colorScheme.tertiaryContainer),
                ColorSchemes("onTertiaryContainer",MaterialTheme.colorScheme.onTertiaryContainer),
            )
        ),
        ColorSchemesItems("Error",
            listOf(
                ColorSchemes("error",MaterialTheme.colorScheme.error),
                ColorSchemes("onError",MaterialTheme.colorScheme.onError),
                ColorSchemes("errorContainer",MaterialTheme.colorScheme.errorContainer),
                ColorSchemes("onErrorContainer",MaterialTheme.colorScheme.onErrorContainer),
            )
        ),
        ColorSchemesItems("Background and Surface",
            listOf(
                ColorSchemes("background",MaterialTheme.colorScheme.background),
                ColorSchemes("onBackground",MaterialTheme.colorScheme.onBackground),
                ColorSchemes("surface",MaterialTheme.colorScheme.surface),
                ColorSchemes("onSurface",MaterialTheme.colorScheme.onSurface),
                ColorSchemes("inverseSurface",MaterialTheme.colorScheme.inverseSurface),
                ColorSchemes("inverseOnSurface",MaterialTheme.colorScheme.inverseOnSurface),
                ColorSchemes("surfaceVariant",MaterialTheme.colorScheme.surfaceVariant),
                ColorSchemes("onSurfaceVariant",MaterialTheme.colorScheme.onSurfaceVariant),
                ColorSchemes("surfaceTint",MaterialTheme.colorScheme.surfaceTint),
                ColorSchemes("scrim",MaterialTheme.colorScheme.scrim),
            )
        ),
    )
}
