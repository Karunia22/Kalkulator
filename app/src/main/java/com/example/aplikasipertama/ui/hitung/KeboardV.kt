package com.example.aplikasipertama.ui.hitung

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun Keyb(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
    ) {
        Pad()
    }
}

@Preview(showBackground = true, backgroundColor = 1)
@Composable
private fun KeybV() {
    Keyb()
}