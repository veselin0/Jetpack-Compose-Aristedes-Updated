package com.example.myupgradedapplication.state

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

@Composable
fun MyState(modifier: Modifier = Modifier) {
    var number by rememberSaveable { mutableIntStateOf(0) }
    Column {
        Text(text = "Press me: $number", modifier = modifier.clickable { number += 1 })
        Text(text = "Press me: $number", modifier = modifier.clickable { number += 1 })
    }

}