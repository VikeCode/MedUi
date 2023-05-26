package com.vikecode.medui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.vikecode.medui.ui.theme.HomeScreen
import com.vikecode.medui.ui.theme.MedUiTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MedUiTheme {
               HomeScreen()
            }
        }
    }
}