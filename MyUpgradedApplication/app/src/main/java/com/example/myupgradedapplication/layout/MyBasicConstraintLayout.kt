package com.example.myupgradedapplication.layout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout

@Composable
fun MyBasicConstraintLayout(modifier: Modifier = Modifier) {
    ConstraintLayout(modifier = modifier.fillMaxSize()) {
        val (boxRed, boxBlue, boxGreen, boxYellow, boxCyan) = createRefs()

        Box(modifier = Modifier.size(100.dp).background(Color.Red).constrainAs(boxRed){
            top.linkTo(boxCyan.bottom)
            start.linkTo(boxCyan.end)
        })

        Box(modifier = Modifier.size(100.dp).background(Color.Blue).constrainAs(boxBlue){
            top.linkTo(boxCyan.bottom)
            end.linkTo(boxCyan.start)
        })

        Box(modifier = Modifier.size(100.dp).background(Color.Green).constrainAs(boxGreen){
            bottom.linkTo(boxCyan.top)
            start.linkTo(boxCyan.end)
        })

        Box(modifier = Modifier.size(100.dp).background(Color.Yellow).constrainAs(boxYellow){
            bottom.linkTo(boxCyan.top)
            end.linkTo(boxCyan.start)
        })

        Box(modifier = Modifier.size(100.dp).background(Color.Cyan).constrainAs(boxCyan){
            bottom.linkTo(parent.bottom)
            top.linkTo(parent.top)
            start.linkTo(parent.start)
            end.linkTo(parent.end)
        })
    }
}


