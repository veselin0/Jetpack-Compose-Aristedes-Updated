package com.example.myupgradedapplication.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.SecondaryTabRow
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

@Composable
fun MyProgressBar(modifier: Modifier = Modifier) {
    var showLoading by rememberSaveable { mutableStateOf(false) }
    Column(
        modifier = modifier
            .padding(24.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        if (showLoading){
            CircularProgressIndicator(
                modifier = modifier.size(150.dp),
                color = Color.Red,
                strokeWidth = 10.dp,
                trackColor = Color.DarkGray
            )
            LinearProgressIndicator(
                modifier = modifier.height(50.dp).padding(top = 32.dp),
                color = Color.Magenta,
                trackColor = Color.Cyan
            )
        }
            Spacer(modifier = modifier.height(20.dp))

            Button(onClick = {showLoading = !showLoading}) {
                Text(text = "Show Loading Toggle")
            }


    }
}