package com.example.petfruits

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.*
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.petfruits.ui.theme.PetFruitsTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PetFruitsTheme {
                BackgroundMap()
                ButtonLists()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview2() {
    PetFruitsTheme {
        BackgroundMap()
        ButtonLists()
    }
}

@Composable
fun BackgroundMap(){
    // Load image from resource
    Column(modifier = Modifier.fillMaxSize()){
        Image(
            painter = painterResource(id = R.drawable.worldwide),
            contentDescription = "worldwide map"
        )
    }
}

@Composable
fun ButtonLists(){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.End) {
        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(containerColor = Color.White),
            border = BorderStroke(0.5.dp, Color.Black),
            modifier = Modifier.width(120.dp)
        ) {
            Text(text = "Gift", color = Color.Black)
        }
        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(containerColor = Color.White),
            border = BorderStroke(0.5.dp, Color.Black),
            modifier = Modifier.width(120.dp)
        ) {
            Text(text = "Shop", color = Color.Black)
        }
        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(containerColor = Color.White),
            border = BorderStroke(0.5.dp, Color.Black),
            modifier = Modifier.width(120.dp)
        ) {
            Text(text = "Bag", color = Color.Black)
        }
        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(containerColor = Color.White),
            border = BorderStroke(0.5.dp, Color.Black),
            modifier = Modifier.width(120.dp)
        ) {
            Text(text = "Characters", color = Color.Black)
        }
        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(containerColor = Color.White),
            border = BorderStroke(0.5.dp, Color.Black),
            modifier = Modifier.width(120.dp)
        ) {
            Text(text = "Records", color = Color.Black)
        }
    }
}