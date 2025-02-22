package com.example.myupgradedapplication.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp

@Composable
fun MyTextFieldParent(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        var user: String by remember { mutableStateOf("Gocho") }
        var value: String by remember { mutableStateOf("") }
        MyTextField(user = user) { user = it }
        MySecondTextField(value = value) { value = it }
        MyAdvancedTextField(value = value) { value = it }
        MyLoginTextField(value = value) { value = it }
        Spacer(modifier = Modifier.height(20.dp))
        MyOutlinedTextField(value = value) { value = it }
    }
}

@Composable
fun MyTextField(user: String, onUserChange: (String) -> Unit) {
    TextField(value = user, onValueChange = { onUserChange(it) }, readOnly = user.isEmpty())
}

@Composable
fun MySecondTextField(value: String, onUserChange: (String) -> Unit) {
    TextField(value = value, onValueChange = { onUserChange(it) }, placeholder = {
        Box(
            modifier = Modifier
                .size(40.dp)
                .background(Color.Cyan)
        )
    }, label = { Text(text = "Enter your email, please") })
}

@Composable
fun MyAdvancedTextField(value: String, onValueChange: (String) -> Unit) {
    TextField(value = value, onValueChange = {
        //if(it.contains("a")) {
        onValueChange(it.replace("a", ""))
        //} else {
        //onValueChange(it)
        //}
    })
}

@Composable
fun MyLoginTextField(value: String, onValueChange: (String) -> Unit) {

    var passwordHidden: Boolean by remember { mutableStateOf(false) }
    TextField(
        value = value,
        onValueChange = { onValueChange(it) },
        singleLine = true,
        label = { Text("Enter your password") },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
        visualTransformation = if (passwordHidden) PasswordVisualTransformation() else VisualTransformation.None,
        trailingIcon = {
            Text(
                text = if (passwordHidden) "Show" else "Hide",
                modifier = Modifier.clickable { passwordHidden = !passwordHidden })
        }
    )

}

@Composable
fun MyOutlinedTextField(value: String, onValueChange: (String) -> Unit) {
    OutlinedTextField(value = value, onValueChange = { onValueChange(it) })
    //BasicTextField(value = value, onValueChange = { onValueChange(it) })
}
