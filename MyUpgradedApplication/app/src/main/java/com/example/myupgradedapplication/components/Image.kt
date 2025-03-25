package com.example.myupgradedapplication.components


import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Favorite
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.myupgradedapplication.R

@Composable
fun MyImagesAndIcons(innerPadding: PaddingValues = PaddingValues()) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(
            painter = painterResource(id = R.drawable.img_0017),
            contentDescription = "Example",
            modifier = Modifier.size(200.dp)
        )

        Spacer(modifier = Modifier.height(5.dp))

        Image(
            painter = painterResource(id = R.drawable.img_0017),
            contentDescription = "Example",
            modifier = Modifier
                .size(200.dp)
                .clip(CircleShape)
                .border(5.dp, Color.Black, CircleShape)
        )

        Spacer(modifier = Modifier.height(5.dp))

        Icon(
            imageVector = Icons.Rounded.Favorite,
            contentDescription = "Favorite",
            modifier = Modifier.size(50.dp),
            tint = Color.Red
        )

    }

}

