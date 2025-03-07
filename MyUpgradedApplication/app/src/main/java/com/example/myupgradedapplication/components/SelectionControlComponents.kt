package com.example.myupgradedapplication.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxColors
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchColors
import androidx.compose.material3.SwitchDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun MySelectionControlComponents(modifier: Modifier = Modifier) {
    var switchState by rememberSaveable { mutableStateOf(false) }
    var checkboxState by rememberSaveable { mutableStateOf(false) }
    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Switch(
            checked = switchState,
            onCheckedChange = { switchState = !switchState },
            enabled = true,
            colors = SwitchDefaults.colors(
                uncheckedThumbColor = Color.Red,
                checkedThumbColor = Color.Green,
                uncheckedTrackColor = Color.Yellow,
                checkedTrackColor = Color.Black
                // can be customised even more ...
            )
        )
        Spacer(modifier = modifier.height(20.dp))
        Checkbox(
            checked = checkboxState,
            onCheckedChange = { checkboxState = !checkboxState },
            enabled = true,
            colors = CheckboxDefaults.colors(
                checkedColor = Color.Green,
                uncheckedColor = Color.Red,
                checkmarkColor = Color.Magenta,

            )
        )
    }
}