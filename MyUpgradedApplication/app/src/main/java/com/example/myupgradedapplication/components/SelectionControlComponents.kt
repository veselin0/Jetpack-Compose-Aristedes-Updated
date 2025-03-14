package com.example.myupgradedapplication.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonDefaults
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TriStateCheckbox
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.state.ToggleableState
import androidx.compose.ui.unit.dp
import com.example.myupgradedapplication.getOptions
import com.example.myupgradedapplication.ui.theme.CheckInfo


@Composable
fun MySelectionControlComponents(innerPadding: PaddingValues) {
    var switchState by rememberSaveable { mutableStateOf(false) }
    var checkboxState by rememberSaveable { mutableStateOf(false) }
    val myOptions = getOptions(
                listOf(
                    "Press here to check 1",
                    "Press here to check 2",
                    "Press here to check 3"
                )
            )

        var selected by rememberSaveable { mutableStateOf("RB 1") }


    MyRadioButtonsList(selected) { selected = it }
    MyRadioButton()
    MyTriStateCheckbox()
    myOptions.forEach {
        MyMultipleCheckboxWithText(Modifier, it)
    }
    MySwitch()
    MyCheckbox()
}

@Composable
fun MyMultipleCheckboxWithText(modifier: Modifier = Modifier, checkInfo: CheckInfo) {

    Text(text = "My Checkbox With Text")
    Row(modifier = modifier.padding(8.dp)) {
        Checkbox(
            checked = checkInfo.selected,
            onCheckedChange = { checkInfo.onCheckedChanged(!checkInfo.selected) },
        )
        Text(text = checkInfo.title)
    }
}

@Composable
fun MyTriStateCheckbox(modifier: Modifier = Modifier) {
    var status by rememberSaveable { mutableStateOf(ToggleableState.Off) }
    Text(text = "My Tri State Checkbox")
    TriStateCheckbox(state = status, onClick = {
        status = when (status) {
            ToggleableState.On -> ToggleableState.Off
            ToggleableState.Off -> ToggleableState.Indeterminate
            ToggleableState.Indeterminate -> ToggleableState.On
        }
    })
}

@Composable
fun MyRadioButton() {
    Text(text = "My Radio Button")
    Row(modifier = Modifier.fillMaxWidth()) {
        RadioButton(
            onClick = {}, selected = true, enabled = true, colors = RadioButtonDefaults.colors(
                selectedColor = Color.Red,
                unselectedColor = Color.Green,
                disabledSelectedColor = Color.LightGray,
                disabledUnselectedColor = Color.LightGray
            )
        )
        Text(text = "RB 1")
    }
}

@Composable
fun MyRadioButtonsList(
    name: String,
    onItemSelected: (String) -> Unit
) {
//    var selected by rememberSaveable { mutableStateOf("RB 1") }
    Text(text = "My Radio Buttons List")
    Row {
        RadioButton(onClick = { onItemSelected("RB 1") }, selected = name == "RB 1")
        Text(text = "RB 1")
    }
    Row {
        RadioButton(onClick = { onItemSelected("RB 2") }, selected = name == "RB 2")
        Text(text = "RB 2")
    }
    Row {
        RadioButton(onClick = { onItemSelected("RB 3") }, selected = name == "RB 3")
        Text(text = "RB 3")
    }
    Row {
        RadioButton(onClick = { onItemSelected("RB 4") }, selected = name == "RB 4")
        Text(text = "RB 4")
    }
}


@Composable
fun MySwitch(modifier: Modifier = Modifier) {
    var switchState by rememberSaveable { mutableStateOf(false) }
    Column(
        // modifier.fillMaxSize(), Arrangement.SpaceEvenly, Alignment.CenterHorizontally
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
    }
}


@Composable
fun MyCheckbox(modifier: Modifier = Modifier) {
    var checkboxState by rememberSaveable { mutableStateOf(false) }
    Column(
        modifier.fillMaxSize(), Arrangement.SpaceEvenly, Alignment.CenterHorizontally
    ) {
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
    }
}


@Composable
fun MyCheckboxWithText(modifier: Modifier = Modifier) {
    var checkboxWithTextState by rememberSaveable { mutableStateOf(false) }

    Box {

        Row(modifier = modifier.padding(8.dp)) {
            Checkbox(
                checked = checkboxWithTextState,
                onCheckedChange = { checkboxWithTextState = !checkboxWithTextState },
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "Check the Box")
        }
    }
}



















































    




