package com.example.myupgradedapplication.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.traceEventEnd
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun MyTextFieldParent(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        var user: String by remember { mutableStateOf("Gocho") }
        var value: String by remember { mutableStateOf("") }
        MyTextField(user = user) { user = it }
        MySecondTextField(value = value) { value = it }
    }
}

@Composable
fun MyTextField(user: String, onUserChange: (String) -> Unit) {
    TextField(value = user, onValueChange = { onUserChange(it) }, readOnly = user.isEmpty())
}

@Composable
fun MySecondTextField(value: String, onUserChange: (String) -> Unit) {
    TextField(value = value, onValueChange = { onUserChange(it) }, placeholder = {
        Box(modifier = Modifier
            .size(40.dp)
            .background(Color.Cyan))
    }, label = { Text(text = "Enter your email, please") })
}
