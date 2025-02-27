package com.example.myupgradedapplication.components


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.DefaultAlpha
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.myupgradedapplication.R

@Composable
fun MyImage(modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(id = R.drawable.img_0017),
        contentDescription = "Example",
        modifier = Modifier.padding(50.dp),
        alignment = Alignment.Center,
        contentScale = ContentScale.Fit,
        alpha = DefaultAlpha,
        colorFilter = null
    )
}