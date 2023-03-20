package com.example.petfruits

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.petfruits.ui.theme.PetFruitsTheme

class LogInActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally){
                Button(
                    onClick = {
                        val navigate = Intent(this@LogInActivity, MainActivity::class.java)
                        startActivity(navigate)
                    },
                    colors = ButtonDefaults.buttonColors(containerColor = Color.White),
                    border = BorderStroke(0.5.dp, Color.Black)
                ) {
                    Text(text = "PLAY", color = Color.Black)
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    PetFruitsTheme {
        var clicked by remember {
            mutableStateOf(false)
        }

        Button(
            onClick = { clicked = !clicked },
            colors = ButtonDefaults.buttonColors(containerColor = Color.White),
            border = BorderStroke(0.5.dp, Color.Black)
        ) {
            Text(text = "PLAY", color = MaterialTheme.colorScheme.primary)
        }
    }
}
