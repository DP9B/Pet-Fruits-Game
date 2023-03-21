package com.example.petfruits

import android.os.Bundle
import android.util.DisplayMetrics
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.petfruits.ui.theme.PetFruitsTheme
import com.google.android.material.shape.TriangleEdgeTreatment

class GameActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PetFruitsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                }
            }
        }
    }
}

@Composable
fun GameView() {
    // Load image from resource
    Box(
        modifier = Modifier.fillMaxSize()
    ){
        Image(
            painter = painterResource(id = R.drawable.taiwan),
            contentDescription = "worldwide map",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxWidth().fillMaxHeight()
        )
        Row(
            modifier = Modifier.background(Color.Transparent)
                .fillMaxSize(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceAround
        ){
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
                modifier = Modifier.fillMaxHeight()
            ){
                Text(text = "<",
                    color = Color.Gray,
                    fontSize = 150.sp,
                    fontWeight = FontWeight.Bold)
            }
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
                modifier = Modifier.fillMaxHeight()
            ){
                Text(text = ">",
                    color = Color.Gray,
                    fontSize = 150.sp,
                    fontWeight = FontWeight.Bold)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview3() {
    PetFruitsTheme {
        GameView()
    }
}