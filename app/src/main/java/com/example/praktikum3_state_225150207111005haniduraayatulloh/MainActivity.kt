package com.example.praktikum3_state_225150207111005haniduraayatulloh

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.praktikum3_state_225150207111005haniduraayatulloh.ui.theme.Praktikum3_State_225150207111005HaniduraAyatullohTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Praktikum3_State_225150207111005HaniduraAyatullohTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    TugasPraktikumScreen(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}


@Composable
fun TugasPraktikumScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(32.dp, Alignment.CenterVertically)
    ) {
        CounterPlusMinusApp()
        ColorToggleButtonApp()
        InteractiveProfileApp()
    }
}


@Composable
fun CounterPlusMinusApp() {
    var count by remember { mutableStateOf(0) }

    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "Counter Plus-Minus: $count", fontSize = 20.sp, fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(8.dp))
        Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            Button(
                onClick = { if (count > 0) count-- }, // Pastikan nilai tidak di bawah nol
                enabled = count > 0 // Tombol nonaktif jika nilai 0
            ) {
                Text(text = "-")
            }
            Button(onClick = { count++ }) {
                Text(text = "+")
            }
        }
    }
}


@Composable
fun ColorToggleButtonApp() {
    var isRed by remember { mutableStateOf(true) }
    val boxColor = if (isRed) Color.Red else Color.Green

    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "Tombol Toggle Warna", fontSize = 20.sp, fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(16.dp))
        Box(
            modifier = Modifier
                .size(200.dp)
                .background(boxColor)
                .clip(MaterialTheme.shapes.small)
        )
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { isRed = !isRed }) {
            Text(text = "Ganti Warna")
        }
    }
}


@Composable
fun InteractiveProfileApp() {
    var isFollowed by remember { mutableStateOf(false) }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(16.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.profil),
            contentDescription = "Foto Profil",
            modifier = Modifier
                .size(120.dp)
                .clip(CircleShape)
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "Hanidura Ayatulloh",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )
        Text(text = "Mahasiswa Teknik Informatika")
        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = { isFollowed = !isFollowed }) {
            Text(if (isFollowed) "Unfollow" else "Follow")
        }
        Spacer(modifier = Modifier.height(8.dp))
        val indicatorText = if (isFollowed) {
            "Anda mengikuti akun ini"
        } else {
            "Anda belum mengikuti akun ini"
        }
        Text(text = indicatorText)
    }
}


@Preview(showBackground = true)
@Composable
fun TugasPraktikumPreview() {
    Praktikum3_State_225150207111005HaniduraAyatullohTheme {
        TugasPraktikumScreen()
    }
}