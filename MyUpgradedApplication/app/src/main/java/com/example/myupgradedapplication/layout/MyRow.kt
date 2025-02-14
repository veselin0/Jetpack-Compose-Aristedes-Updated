package com.example.myupgradedapplication.layout

import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Preview(showBackground = true)
@Composable
fun MyRow(modifier: Modifier = Modifier) {
    Row(modifier = modifier.fillMaxSize()
        .horizontalScroll(rememberScrollState()) ) {
        Text(text = "Hola1", modifier = Modifier.background(Color.Red))
        Text(text = "Hola2", modifier = Modifier.background(Color.Cyan))
        Text(text = "Hola3", modifier = Modifier.background(Color.Green))
        Text(text = "Hola4", modifier = Modifier.background(Color.Yellow))
        Text(text = "Hola1", modifier = Modifier.background(Color.Red))
        Text(text = "Hola2", modifier = Modifier.background(Color.Cyan))
        Text(text = "Hola3", modifier = Modifier.background(Color.Green))
        Text(text = "Hola4", modifier = Modifier.background(Color.Yellow))
        Text(text = "Hola1", modifier = Modifier.background(Color.Red))
        Text(text = "Hola2", modifier = Modifier.background(Color.Cyan))
        Text(text = "Hola3", modifier = Modifier.background(Color.Green))
        Text(text = "Hola4", modifier = Modifier.background(Color.Yellow))
        Text(text = "Hola1", modifier = Modifier.background(Color.Red))
        Text(text = "Hola2", modifier = Modifier.background(Color.Cyan))
        Text(text = "Hola3", modifier = Modifier.background(Color.Green))
        Text(text = "Hola4", modifier = Modifier.background(Color.Yellow))
        Text(text = "Hola1", modifier = Modifier.background(Color.Red))
        Text(text = "Hola2", modifier = Modifier.background(Color.Cyan))
        Text(text = "Hola3", modifier = Modifier.background(Color.Green))
        Text(text = "Hola4", modifier = Modifier.background(Color.Yellow))
    }
}