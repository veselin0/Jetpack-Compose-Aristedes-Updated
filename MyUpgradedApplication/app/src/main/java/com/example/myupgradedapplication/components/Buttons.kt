package com.example.myupgradedapplication.components

import android.util.Log
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun MyButtons(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Button(
            onClick = { Log.i("Gocho", "Button pressed!") },
            enabled = true,
            shape = RoundedCornerShape(50),
            border = BorderStroke(3.dp, Color.Magenta),
            colors = ButtonDefaults.buttonColors(
                contentColor = Color.Green,
                containerColor = Color.Yellow,
                disabledContentColor = Color.Red,
                disabledContainerColor = Color.DarkGray
            )
        ) {
            Text(text = "Press me!")
        }
        OutlinedButton(
            onClick = {},
            colors = ButtonDefaults.outlinedButtonColors(containerColor = Color.Green)
        ) {
            Text(text = "Outlined")
        }
    }
}