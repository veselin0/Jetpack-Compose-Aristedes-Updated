package com.example.myupgradedapplication.ui.theme

data class CheckInfo(
    val title: String,
    var selected: Boolean = false,
    var onCheckedChanged: (Boolean) -> Unit
)
