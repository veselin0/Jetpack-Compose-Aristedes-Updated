package com.example.myupgradedapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import com.example.myupgradedapplication.components.MyMultipleCheckboxWithText
import com.example.myupgradedapplication.components.MyRadioButton
import com.example.myupgradedapplication.components.MyTriStateCheckbox
import com.example.myupgradedapplication.login.Greeting
import com.example.myupgradedapplication.ui.theme.CheckInfo
import com.example.myupgradedapplication.ui.theme.MyUpgradedApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val myOptions = getOptions(
                listOf(
                    "Press here to check 1",
                    "Press here to check 2",
                    "Press here to check 3"
                )
            )
            MyUpgradedApplicationTheme {
//                var state by rememberSavable { mutableStateOf(false) }
//                val checkInfo = CheckInfo(
//                    title = "Este es el bueno",
//                    selected = state,
//                    onCheckedChanged = {state = it}
//                )


                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        Arrangement.Center,
                        Alignment.CenterHorizontally
                    ) {
                        MyRadioButton()
                        MyTriStateCheckbox()
                        myOptions.forEach {
                            MyMultipleCheckboxWithText(
                                modifier = Modifier.padding(innerPadding),
                                it
                            )
                        }
                    }


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

@Composable
fun getOptions(titles: List<String>): List<CheckInfo> {
    return titles.map {
        var state by rememberSaveable { mutableStateOf(false) }
        CheckInfo(
            title = it,
            selected = state,
            onCheckedChanged = { myNewState -> state = myNewState }
        )
    }
}