package com.example.myupgradedapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import com.example.myupgradedapplication.components.MyAdvancedProgressBar
import com.example.myupgradedapplication.components.MyCheckboxWithText
import com.example.myupgradedapplication.components.MyImagesAndIcons
import com.example.myupgradedapplication.components.MyProgressBar
import com.example.myupgradedapplication.components.MySelectionControlComponents
import com.example.myupgradedapplication.login.Greeting
import com.example.myupgradedapplication.ui.theme.MyUpgradedApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyUpgradedApplicationTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MyCheckboxWithText(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}



@Preview(
    showBackground = true,
    showSystemUi = true,
    device = Devices.PIXEL_4
)
@Composable
fun GreetingPreview() {
    MyUpgradedApplicationTheme {
        Greeting("Android")
    }
}