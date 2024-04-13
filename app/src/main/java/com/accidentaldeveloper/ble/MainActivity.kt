package com.accidentaldeveloper.ble

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.accidentaldeveloper.ble.presentation.Navigation
import com.accidentaldeveloper.ble.ui.theme.BLETheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BLETheme {
                Navigation()
            }
        }
    }
}

