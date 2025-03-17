package com.example.myupgradedapplication.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ListItemDefaults.contentColor
import androidx.compose.material3.SnackbarDefaults.contentColor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color

@Composable
fun MyMoreComponents(innerPadding: PaddingValues) {
    MyCard()
}

@Composable
fun MyCard() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        elevation = CardDefaults.cardElevation(12.dp),
        shape = CardDefaults.shape,
        colors = CardDefaults.cardColors(containerColor = Color.Red, contentColor = Color.Yellow),
        border = BorderStroke(5.dp, Color.Green)
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {

            Text(text = "My Card 1")
            Text(text = "My Card 2")
            Text(text = "My Card 3")

        }
    }
}