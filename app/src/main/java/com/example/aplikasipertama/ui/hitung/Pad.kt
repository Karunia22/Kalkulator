package com.example.aplikasipertama.ui.hitung

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun Pad(modifier: Modifier = Modifier) {
    val list = listOf<String>(
        "0",
        ",",
        "Hp",
        "=",
        "1",
        "2",
        "3",
        "+",
        "4",
        "5",
        "6",
        "-",
        "7",
        "8",
        "9",
        "X",
        "AC",
        "()",
        "%",
        "/"
    )
    val maxWidth = Modifier.fillMaxWidth()
    Box(
        modifier = modifier
            .fillMaxWidth()
    ) {
        Column() {
            LazyVerticalGrid(
                columns = GridCells.Fixed(4),
                reverseLayout = true
            ) {
                items(list) {
                    StatusTombol(icon = it)
                }
            }
        }
    }
}

@Preview(showBackground = true, backgroundColor = 0)
@Composable
private fun PadView() {
    Pad()
}