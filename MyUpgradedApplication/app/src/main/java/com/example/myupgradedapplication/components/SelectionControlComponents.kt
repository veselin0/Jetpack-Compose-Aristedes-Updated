package com.example.myupgradedapplication.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.myupgradedapplication.ui.theme.CheckInfo


@Composable
fun MySelectionControlComponents(modifier: Modifier = Modifier) {
    var switchState by rememberSaveable { mutableStateOf(false) }
    var checkboxState by rememberSaveable { mutableStateOf(false) }

    Column(
        modifier.fillMaxSize(), Arrangement.SpaceEvenly, Alignment.CenterHorizontally
    ) {
        Box {
            Text(text = "My Switch")
            Switch(
                modifier = modifier.padding(vertical = 2.dp),
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
        }
        Box {
            Text(text = "My Checkbox")
            Checkbox(
                modifier = modifier.padding(vertical = 2.dp),
                checked = checkboxState,
                onCheckedChange = { checkboxState = !checkboxState },
                enabled = true,
                colors = CheckboxDefaults.colors(
                    checkedColor = Color.Green,
                    uncheckedColor = Color.Red,
                    checkmarkColor = Color.Magenta
                )
            )
        }

        //MyCheckboxWithText()


    }
}

@Composable
fun MyCheckboxWithText(modifier: Modifier = Modifier) {
    var checkboxWithTextState by rememberSaveable { mutableStateOf(false) }
    Box {
        Text(text = "My Checkbox With Text")
        //Spacer(modifier = modifier.height(8.dp))
        Row(modifier = modifier.padding(8.dp)) {
            Checkbox(
                modifier = modifier.padding(vertical = 2.dp),
                checked = checkboxWithTextState,
                onCheckedChange = { checkboxWithTextState = !checkboxWithTextState },
            )
            //Spacer(modifier = Modifier.width(8.dp))
            Text(text = "Check the Box")
        }
    }
}