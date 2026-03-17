package com.example.mycoffeeapp_01.Screens.HomeScreen

import androidx.compose.material3.Icon
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mycoffeeapp_01.Screens.UiComponents.MyBottomNavBar
import androidx.compose.material3.Text
import androidx.compose.ui.unit.sp

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HomeScreen() {
    Scaffold(
        bottomBar = { MyBottomNavBar() }
    ) { innerPadding ->

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(fraction = 1f / 3f)
                .background(
                    brush = Brush.linearGradient(
                        colors = listOf(
                            Color(0xFF303030),
                            Color(0xFF1F1F1F),
                            Color(0xFF121212)
                        )
                    )
                )
        )

        Column(modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .padding(innerPadding)
        ) {
            Text(text = "Location",
                color = Color.Gray,
                fontSize = 16.sp,

                )

            Row() {
                Text(text = "hi",
                    color = Color.White)
                Icon(imageVector = Icons.Default.KeyboardArrowDown,
                    contentDescription = "Change Location",
                    tint = Color.White
                )
            }
        }
    }
}




















