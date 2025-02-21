package com.example.myupgradedapplication.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MyTexts(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Text(text = "Gocho")
        Text(text = "Red Gocho", color = Color.Red)
        Text(text = "Gocho", fontSize = 25.sp)
        Text(text = "FontStyle", fontStyle = FontStyle.Italic, fontSize = 25.sp)
        Text(text = "FontStyle", fontStyle = FontStyle.Normal, fontSize = 25.sp)
        Text(
            text = "FontWeight",
            fontWeight = FontWeight.ExtraBold,
            fontStyle = FontStyle.Italic,
            fontSize = 25.sp
        )
        Text(text = "Letter Spacing", letterSpacing = 10.sp)
        Text(
            text = "Text Decoration",
            textDecoration = TextDecoration.Underline,
            color = Color.Blue,
            modifier = Modifier.clickable { })
        Text(text = "Text Decoration", textDecoration = TextDecoration.LineThrough)
        Text(
            text = "Text Decoration",
            textDecoration = TextDecoration.Underline + TextDecoration.LineThrough
        )
        Text(
            text = "Align",
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Cyan)
        )
        Text(
            text = "Align, Align, Align, Align, Align, Align, Align, Align, Align, Align, Gocho",
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.LightGray),
            maxLines = 1,
            overflow = TextOverflow.Ellipsis
        )
    }

}