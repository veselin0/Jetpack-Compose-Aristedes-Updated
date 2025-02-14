package com.example.myupgradedapplication.layout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun MyComplexLayout(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Box(modifier = Modifier.weight(1f).fillMaxWidth().background(Color.Red)) {}
        Box(modifier = Modifier.weight(1f).fillMaxWidth().background(Color.Yellow)) {
            Row(modifier = Modifier) {
                Box(modifier = Modifier
                    .weight(1f)
                    .height(125.dp)
                    .background(Color.LightGray),
                    contentAlignment = Alignment.Center){
                    Text(text = "Hola")
                }
                Box(modifier = Modifier
                    .weight(1f)
                    .height(170.dp)
                    .background(Color.Cyan),
                    contentAlignment = Alignment.Center){
                    Text(text = "Hola")
                }
            }

        }
        Box(modifier = Modifier.weight(1f).fillMaxWidth().background(Color.Green)) {}
    }
}