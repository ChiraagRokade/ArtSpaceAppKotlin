    package com.example.artspace

import android.os.Bundle
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.artspace.ui.theme.ArtSpaceTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ArtSpaceTheme {
                Surface(
                    modifier = Modifier
                        .fillMaxSize()
                ) {
                    ArtSpace()
                }
            }
        }
    }

    @Composable
    private fun ArtSpace() {
        Column(
            modifier = Modifier
                .padding(10.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                modifier = Modifier
                    .padding(10.dp)
                    .background(Color.LightGray),
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.Top
            ) {
                Image(
                    painterResource(R.drawable.ic_launcher_foreground),
                    contentDescription = null
                )
            }
            Column(
                modifier = Modifier
                    .padding(10.dp)
                    .background(Color.LightGray),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Artwork Title",
                    fontSize = 28.sp
                )
                Text(
                    text = "Artwork Artist(Year)",
                    fontSize = 18.sp
                )
            }
            Row(
                modifier = Modifier
                    .padding(10.dp)
                    .background(Color.LightGray)
            ) {
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .padding(10.dp)
                ) {
                    Text(
                        text = "Previous"
                    )
                }
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .padding(10.dp)
                ) {
                    Text(
                        text = "Next"
                    )
                }
            }
        }
    }
}

