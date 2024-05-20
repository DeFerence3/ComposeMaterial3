package com.proj.composematerial3

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

data class ColorSchemesItems(
    val colorCat: String,
    val schemes: List<ColorSchemes>
)
data class ColorSchemes(
    val name: String,
    val color: Color,
    val textColorName: String,
    val textColor: Color
)

@Composable
fun getColorSchemes(): List<ColorSchemesItems> {
    val colorScheme = MaterialTheme.colorScheme
    return listOf(
        ColorSchemesItems("Primary",
            listOf(
                ColorSchemes(
                    name = "primary",
                    color = MaterialTheme.colorScheme.primary,
                    "onPrimary",
                    textColor = MaterialTheme.colorScheme.onPrimary
                ),
                ColorSchemes(
                    name = "onPrimary",
                    color = MaterialTheme.colorScheme.onPrimary,
                    "primary",
                    textColor = colorScheme.primary
                ),
                ColorSchemes(
                    name = "onPrimaryContainer",
                    color = MaterialTheme.colorScheme.onPrimaryContainer,
                    "primaryContainer",
                    textColor = colorScheme.primaryContainer
                ),
                ColorSchemes(
                    name = "primaryContainer",
                    color = MaterialTheme.colorScheme.primaryContainer,
                    "onPrimaryContainer",
                    textColor = colorScheme.onPrimaryContainer
                ),
                ColorSchemes(
                    name = "inversePrimary",
                    color = MaterialTheme.colorScheme.inversePrimary,
                    "primary",
                    textColor = colorScheme.primary
                ),
            )
        ),
        ColorSchemesItems("Secondary",
            listOf(
                ColorSchemes(
                    name = "secondary",
                    color = MaterialTheme.colorScheme.secondary,
                    "onSecondary",
                    textColor = colorScheme.onSecondary
                ),
                ColorSchemes(
                    name = "onSecondary",
                    color = MaterialTheme.colorScheme.onSecondary,
                    "secondary",
                    textColor = colorScheme.secondary
                ),
                ColorSchemes(
                    name = "secondaryContainer",
                    color = MaterialTheme.colorScheme.secondaryContainer,
                    "onSecondaryContainer",
                    textColor = colorScheme.onSecondaryContainer
                ),
                ColorSchemes(
                    name = "onSecondaryContainer",
                    color = MaterialTheme.colorScheme.onSecondaryContainer,
                    "secondaryContainer",
                    textColor = colorScheme.secondaryContainer
                ),
            )
        ),
        ColorSchemesItems("Tertiary",
            listOf(
                ColorSchemes(
                    name = "tertiary",
                    color = MaterialTheme.colorScheme.tertiary,
                    "onTertiary",
                    textColor = colorScheme.onTertiary
                ),
                ColorSchemes(
                    name = "onTertiary",
                    color = MaterialTheme.colorScheme.onTertiary,
                    "tertiary",
                    textColor = colorScheme.tertiary
                ),
                ColorSchemes(
                    name = "tertiaryContainer",
                    color = MaterialTheme.colorScheme.tertiaryContainer,
                    "onTertiaryContainer",
                    textColor = colorScheme.onTertiaryContainer
                ),
                ColorSchemes(
                    name = "onTertiaryContainer",
                    color = MaterialTheme.colorScheme.onTertiaryContainer,
                    "tertiaryContainer",
                    textColor = colorScheme.tertiaryContainer
                ),
            )
        ),
        ColorSchemesItems("Error",
            listOf(
                ColorSchemes(
                    name = "error",
                    color = MaterialTheme.colorScheme.error,
                    "onError",
                    textColor = colorScheme.onError
                ),
                ColorSchemes(
                    name = "onError",
                    color = MaterialTheme.colorScheme.onError,
                    "error",
                    textColor = colorScheme.error
                ),
                ColorSchemes(
                    name = "errorContainer",
                    color = MaterialTheme.colorScheme.errorContainer,
                    "onErrorContainer",
                    textColor = colorScheme.onErrorContainer
                ),
                ColorSchemes(
                    name = "onErrorContainer",
                    color = MaterialTheme.colorScheme.onErrorContainer,
                    "errorContainer",
                    textColor = colorScheme.errorContainer
                ),
            )
        ),
        ColorSchemesItems("Background and Surface",
            listOf(
                ColorSchemes(
                    name = "background",
                    color = MaterialTheme.colorScheme.background,
                    "onBackground",
                    textColor = colorScheme.onBackground
                ),
                ColorSchemes(
                    name = "onBackground",
                    color = MaterialTheme.colorScheme.onBackground,
                    "background",
                    textColor = colorScheme.background
                ),
                ColorSchemes(
                    name = "surface",
                    color = MaterialTheme.colorScheme.surface,
                    "onSurface",
                    textColor = colorScheme.onSurface
                ),
                ColorSchemes(
                    name = "onSurface",
                    color = MaterialTheme.colorScheme.onSurface,
                    "surface",
                    textColor = colorScheme.surface
                ),
                ColorSchemes(
                    name = "inverseSurface",
                    color = MaterialTheme.colorScheme.inverseSurface,
                    "inverseOnSurface",
                    textColor = colorScheme.inverseOnSurface
                ),
                ColorSchemes(
                    name = "inverseOnSurface",
                    color = MaterialTheme.colorScheme.inverseOnSurface,
                    "inverseSurface",
                    textColor = colorScheme.inverseSurface
                ),
                ColorSchemes(
                    name = "surfaceVariant",
                    color = MaterialTheme.colorScheme.surfaceVariant,
                    "onSurfaceVariant",
                    textColor = colorScheme.onSurfaceVariant
                ),
                ColorSchemes(
                    name = "onSurfaceVariant",
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                    "surfaceVariant",
                    textColor = colorScheme.surfaceVariant
                ),
                ColorSchemes(
                    name = "surfaceTint",
                    color = MaterialTheme.colorScheme.surfaceTint,
                    "scrim",
                    textColor = colorScheme.scrim
                ),
                ColorSchemes(
                    name = "scrim",
                    color = MaterialTheme.colorScheme.scrim,
                    "primary",
                    textColor = colorScheme.primary
                ),
            )
        ),
    )
}
