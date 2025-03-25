package com.example.myinstagramapp

import android.app.Activity
import android.preference.PreferenceActivity
import androidx.activity.compose.LocalActivity
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun LoginScreen(modifier: Modifier = Modifier) {
    Box(modifier = modifier.fillMaxSize()) {
        Header()
    }
}

@Composable
fun Header(modifier: Modifier = Modifier) {
    val activity = LocalActivity.current as Activity
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(300.dp)
//            .background(color = Color.Cyan)
    ) {
        Box(
            modifier = modifier.clickable { activity.finish() }
                .size(50.dp)
//                .background(color = Color.Yellow)
                .align(Alignment.TopEnd),
            contentAlignment = Alignment.Center

        ) {
            Icon(imageVector = Icons.Default.Close, contentDescription = "Account icon")
        }
    }
}
        