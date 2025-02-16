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
        val (boxRed, boxBlue, boxGreen, boxYellow, boxCyan, boxMagenta, boxLightGray, boxGray, boxBlack) = createRefs()
        Box(modifier = Modifier
            .size(175.dp)
            .background(Color.Blue)
            .constrainAs(boxBlue) {
                top.linkTo(boxYellow.bottom)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
            })

        Box(modifier = Modifier
            .size(175.dp)
            .background(Color.Gray)
            .constrainAs(boxGray) {
                start.linkTo(boxBlack.end)
                bottom.linkTo(boxGreen.top)
            })

        Box(modifier = Modifier
            .size(75.dp)
            .background(Color.Black)
            .constrainAs(boxBlack) {
                start.linkTo(boxCyan.end)
                top.linkTo(boxCyan.top)
                bottom.linkTo(boxCyan.bottom)
            })

        Box(modifier = Modifier
            .size(175.dp)
            .background(Color.Cyan)
            .constrainAs(boxCyan) {
                bottom.linkTo(boxMagenta.top)
                end.linkTo(boxMagenta.end)
            })

        Box(modifier = Modifier
            .size(75.dp)
            .background(Color.Red)
            .constrainAs(boxRed) {
                top.linkTo(boxYellow.bottom)
                start.linkTo(boxYellow.end)
            })

        Box(modifier = Modifier
            .size(75.dp)
            .background(Color.LightGray)
            .constrainAs(boxLightGray) {
                top.linkTo(boxYellow.bottom)
                end.linkTo(boxYellow.start)
            })

        Box(modifier = Modifier
            .size(75.dp)
            .background(Color.Green)
            .constrainAs(boxGreen) {
                bottom.linkTo(boxYellow.top)
                start.linkTo(boxYellow.end)
            })

        Box(modifier = Modifier
            .size(75.dp)
            .background(Color.Magenta)
            .constrainAs(boxMagenta) {
                bottom.linkTo(boxYellow.top)
                end.linkTo(boxYellow.start)
            })

        Box(modifier = Modifier
            .size(75.dp)
            .background(Color.Yellow)
            .constrainAs(boxYellow) {
                bottom.linkTo(parent.bottom)
                top.linkTo(parent.top)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
            })
    }
}

@Composable
fun ConstraintExampleGuide(modifier: Modifier) {
    ConstraintLayout(modifier = Modifier.fillMaxSize()) {

        val boxRed = createRef()

        //val topGuide = createGuidelineFromTop(25.dp)

        val topGuide = createGuidelineFromTop(0.1f)

        Box(modifier = Modifier
            .size(175.dp)
            .background(Color.Red)
            .constrainAs(boxRed) {
                top.linkTo(topGuide)
            })
    }
}
