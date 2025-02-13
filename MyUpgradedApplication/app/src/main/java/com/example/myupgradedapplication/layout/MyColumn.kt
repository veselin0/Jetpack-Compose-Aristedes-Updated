package com.example.myupgradedapplication.layout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Preview(showBackground = true)
@Composable
fun MyColumn(modifier: Modifier = Modifier){
    Column(modifier = Modifier.fillMaxSize().verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "Hola1", modifier = Modifier.background(color = Color.Red))
        Text(text = "Hola2", modifier = Modifier.background(color = Color.Cyan))
        Text(text = "Hola3", modifier = Modifier.background(color = Color.Yellow))
        Text(text = "Hola4", modifier = Modifier.background(color = Color.Blue))
        Text(text = "Hola1", modifier = Modifier.background(color = Color.Red))
        Text(text = "Hola2", modifier = Modifier.background(color = Color.Cyan))
        Text(text = "Hola3", modifier = Modifier.background(color = Color.Yellow))
        Text(text = "Hola4", modifier = Modifier.background(color = Color.Blue))
        Text(text = "Hola1", modifier = Modifier.background(color = Color.Red))
        Text(text = "Hola2", modifier = Modifier.background(color = Color.Cyan))
        Text(text = "Hola3", modifier = Modifier.background(color = Color.Yellow))
        Text(text = "Hola4", modifier = Modifier.background(color = Color.Blue))
        Text(text = "Hola1", modifier = Modifier.background(color = Color.Red))
        Text(text = "Hola2", modifier = Modifier.background(color = Color.Cyan))
        Text(text = "Hola3", modifier = Modifier.background(color = Color.Yellow))
        Text(text = "Hola4", modifier = Modifier.background(color = Color.Blue))
        Text(text = "Hola1", modifier = Modifier.background(color = Color.Red))
        Text(text = "Hola2", modifier = Modifier.background(color = Color.Cyan))
        Text(text = "Hola3", modifier = Modifier.background(color = Color.Yellow))
        Text(text = "Hola4", modifier = Modifier.background(color = Color.Blue))
        Text(text = "Hola1", modifier = Modifier.background(color = Color.Red))
        Text(text = "Hola2", modifier = Modifier.background(color = Color.Cyan))
        Text(text = "Hola3", modifier = Modifier.background(color = Color.Yellow))
        Text(text = "Hola4", modifier = Modifier.background(color = Color.Blue))
        Text(text = "Hola1", modifier = Modifier.background(color = Color.Red))
        Text(text = "Hola2", modifier = Modifier.background(color = Color.Cyan))
        Text(text = "Hola3", modifier = Modifier.background(color = Color.Yellow))
        Text(text = "Hola4", modifier = Modifier.background(color = Color.Blue))
        Text(text = "Hola1", modifier = Modifier.background(color = Color.Red))
        Text(text = "Hola2", modifier = Modifier.background(color = Color.Cyan))
        Text(text = "Hola3", modifier = Modifier.background(color = Color.Yellow))
        Text(text = "Hola4", modifier = Modifier.background(color = Color.Blue))
        Text(text = "Hola1", modifier = Modifier.background(color = Color.Red))
        Text(text = "Hola2", modifier = Modifier.background(color = Color.Cyan))
        Text(text = "Hola3", modifier = Modifier.background(color = Color.Yellow))
        Text(text = "Hola4", modifier = Modifier.background(color = Color.Blue))
        Text(text = "Hola1", modifier = Modifier.background(color = Color.Red))
        Text(text = "Hola2", modifier = Modifier.background(color = Color.Cyan))
        Text(text = "Hola3", modifier = Modifier.background(color = Color.Yellow))
        Text(text = "Hola4", modifier = Modifier.background(color = Color.Blue))
        Text(text = "Hola1", modifier = Modifier.background(color = Color.Red))
        Text(text = "Hola2", modifier = Modifier.background(color = Color.Cyan))
        Text(text = "Hola3", modifier = Modifier.background(color = Color.Yellow))
        Text(text = "Hola4", modifier = Modifier.background(color = Color.Blue))
        Text(text = "Hola1", modifier = Modifier.background(color = Color.Red))
        Text(text = "Hola2", modifier = Modifier.background(color = Color.Cyan))
        Text(text = "Hola3", modifier = Modifier.background(color = Color.Yellow))
        Text(text = "Hola4", modifier = Modifier.background(color = Color.Blue))
    }

}