package com.example.petfruits

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.*
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.gestures.detectTransformGestures
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.petfruits.ui.theme.PetFruitsTheme
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.unit.IntOffset
import androidx.core.content.ContextCompat.startActivity
import kotlin.math.roundToInt


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PetFruitsTheme {
                DefaultPreview2()
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
        TransformGestures()
    }
}

@Composable
fun BackgroundMap(){
    // Load image from resource
    /*Column(modifier = Modifier.fillMaxSize()){
        Image(
            painter = painterResource(id = R.drawable.worldwide),
            contentDescription = "worldwide map"
        )
    }*/
    /*val imageModifier = Modifier
        .size(500.dp)
        .border(BorderStroke(1.dp, Color.Black))
        .background(Color.Black)*/
    Image(
        painter = painterResource(id = R.drawable.worldwide2),
        contentDescription = "worldwide map",
        contentScale = ContentScale.FillHeight,
        modifier = Modifier.fillMaxSize(),
    )

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
            Text(text = "Game", color = Color.Black)
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

@Composable
private fun TransformGestures() {
    var angle by remember { mutableStateOf(0f) }
    var zoom by remember { mutableStateOf(1f) }
    var offsetX by remember { mutableStateOf(0f) }
    var offsetY by remember { mutableStateOf(0f) }
    Box(
        Modifier
            .offset { IntOffset(offsetX.roundToInt(), offsetY.roundToInt()) }
            .graphicsLayer(
                scaleX = zoom,
                scaleY = zoom,
                rotationZ = angle
            )
            .background(Color.Cyan)
            .pointerInput(Unit) {
                detectTransformGestures(
                    onGesture = { _, pan, gestureZoom, gestureRotate ->
                        angle += gestureRotate
                        zoom *= gestureZoom
                        offsetX += pan.x
                        offsetY += pan.y
                    }
                )
            }
            .fillMaxSize()
    ){

        Image(
            painter = painterResource(id = R.drawable.worldwide2),
            contentDescription = "worldwide map",
            contentScale = ContentScale.FillHeight,
            modifier = Modifier.fillMaxSize(),
        )
    }
}