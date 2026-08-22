package com.example.aplikasipertama

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.aplikasipertama.ui.hitung.Keyb
import com.example.aplikasipertama.ui.hitung.Pad
import com.example.aplikasipertama.ui.hitung.StatusTombol
import com.example.aplikasipertama.ui.hitung.Tombol
import com.example.aplikasipertama.ui.theme.AplikasiPertamaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AplikasiPertamaTheme {
                Scaffold(
                    contentColor = MaterialTheme.colorScheme.surfaceContainerLowest,
                    modifier = Modifier.fillMaxSize()
                ) { innerPadding ->
                    Keyb(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

