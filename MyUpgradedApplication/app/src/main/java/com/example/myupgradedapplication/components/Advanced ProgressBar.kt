package com.example.myupgradedapplication.components

import androidx.collection.mutableFloatSetOf
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.ProgressIndicatorDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun MyAdvancedProgressBar(modifier: Modifier = Modifier) {
    var progressStatus by rememberSaveable { mutableFloatStateOf(0f) }
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        CircularProgressIndicator(
            modifier = modifier.size(150.dp),
            progress = { progressStatus },
            trackColor = ProgressIndicatorDefaults.circularIndeterminateTrackColor,
        )

        Spacer(modifier = modifier.height(20.dp))

        LinearProgressIndicator(
            //modifier = modifier.size(150.dp),
            progress = { progressStatus },
            trackColor = ProgressIndicatorDefaults.circularIndeterminateTrackColor,
        )

        Row(modifier = modifier.fillMaxSize(), horizontalArrangement = Arrangement.Center) {

            Button(
                modifier = modifier.weight(1f),
                onClick = { progressStatus += 0.1f }) { Text(text = "Increase") }
            Button(
                modifier = modifier.weight(1f),
                onClick = { progressStatus -= 0.1f }) { Text(text = "Decrease") }
        }
    }
}


