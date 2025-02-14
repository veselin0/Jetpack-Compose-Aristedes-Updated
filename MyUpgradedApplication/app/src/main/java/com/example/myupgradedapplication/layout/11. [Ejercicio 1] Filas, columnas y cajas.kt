package com.example.myupgradedapplication.layout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun My11Ejercicio1FilasColumnasYCajas(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Box(modifier = Modifier.weight(1f)
            .fillMaxWidth()
            .background(Color.Cyan),
            contentAlignment = Alignment.Center) {
            Text(text = "Ejemplo1")
        }
        Box(modifier = Modifier.weight(1f)
            .fillMaxWidth()) {
            Row(modifier = Modifier) {
                Box(modifier = Modifier
                    .weight(1f)
                    .fillMaxSize()
                    .background(Color.Red),
                    contentAlignment = Alignment.Center){
                    Text(text = "Ejemplo2")
                }
                Box(modifier = Modifier
                    .weight(1f)
                    .fillMaxSize()
                    .background(Color.Green),
                    contentAlignment = Alignment.Center){
                    Text(text = "Ejemplo3")
                }
            }

        }
        Box(modifier = Modifier.weight(1f)
            .fillMaxWidth()
            .background(Color.Magenta),
            contentAlignment = Alignment.BottomCenter
        ) {
            Text(text = "Ejemplo4")
        }
    }

}