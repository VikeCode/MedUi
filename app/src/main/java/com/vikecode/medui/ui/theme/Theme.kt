package com.vikecode.medui.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable


@Composable
fun MedUiTheme(
    isDarkTheme: Boolean = isSystemInDarkTheme(), content: @Composable() () -> Unit
){

    MaterialTheme(
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}