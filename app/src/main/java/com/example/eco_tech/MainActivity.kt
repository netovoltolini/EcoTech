package com.example.eco_tech

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.eco_tech.ui.theme.Eco_TechTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Eco_TechTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize()
                            .background(Color(0xFFE9F5E8)))
                {
                    MainPage()
                }
            }
        }
    }
}

@Composable
fun MainPage() {
        var isDropdownExpanded by remember { mutableStateOf(false) }
        var isDropdownExpanded1 by remember { mutableStateOf(false) }
        var isDropdownExpanded2 by remember { mutableStateOf(false) }
        var isDropdownExpanded3 by remember { mutableStateOf(false) }


    Column ( modifier = Modifier.padding(8.dp)
                .background(Color(0xFFE9F5E8))){
        Row(
            modifier = Modifier
                .background(Color(0xFF3dd7b7))
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {

            Button(
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(Color.Transparent),
                border = BorderStroke(0.5.dp, Color.White),
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier.padding(5.dp).width(75.dp)
            ) {
                Column(
                    verticalArrangement = Arrangement.SpaceEvenly,
                    horizontalAlignment = Alignment.Start,
                    modifier = Modifier.height(50.dp).padding(0.dp)
                ) {
                    Row(
                        modifier = Modifier.height(4.dp)
                            .width(40.dp)
                            .background(Color.White)
                    ) {}
                    Row(
                        modifier = Modifier.height(4.dp)
                            .width(40.dp)
                            .background(Color.White)
                    ) {}
                    Row(
                        modifier = Modifier.height(4.dp)
                            .width(40.dp)
                            .background(Color.White)
                    ) {}
                }
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = { isDropdownExpanded = !isDropdownExpanded },
            modifier = Modifier.padding(8.dp)
        ) {
            Text(
                text = if (isDropdownExpanded) "Ver Menos" else "Ver Mais"
            )
        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(animateDpAsState(if (isDropdownExpanded) 150.dp else 50.dp).value)
        ) {
                Column(
                    modifier = Modifier
                        .padding(16.dp)
                        .fillMaxSize()
                ) {
                    Text("Pré Content")

                    if (isDropdownExpanded) {
                        Text("Dropdown Content")
                    }
                }
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = { isDropdownExpanded1 = !isDropdownExpanded1 },
            modifier = Modifier.padding(8.dp)
        ) {
            Text(
                text = if (isDropdownExpanded1) "Ver Menos" else "Ver Mais"
            )
        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(animateDpAsState(if (isDropdownExpanded1) 150.dp else 50.dp).value)
        ) {
            Column(
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxSize()
            ) {
                Text("Pré Content")

                if (isDropdownExpanded1) {
                    Text("Dropdown Content")
                }
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = { isDropdownExpanded2 = !isDropdownExpanded2 },
            modifier = Modifier.padding(8.dp)
        ) {
            Text(
                text = if (isDropdownExpanded2) "Ver Menos" else "Ver Mais"
            )
        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(animateDpAsState(if (isDropdownExpanded2) 150.dp else 50.dp).value)
        ) {
            Column(
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxSize()
            ) {
                Text("Pré Content")

                if (isDropdownExpanded2) {
                    Text("Dropdown Content")
                }
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = { isDropdownExpanded3 = !isDropdownExpanded3 },
            modifier = Modifier.padding(8.dp)
        ) {
            Text(
                text = if (isDropdownExpanded3) "Ver Menos" else "Ver Mais"
            )
        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(animateDpAsState(if (isDropdownExpanded3) 150.dp else 50.dp).value)
        ) {
            Column(
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxSize()
            ) {
                Text("Pré Content")

                if (isDropdownExpanded3) {
                    Text("Dropdown Content")
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MainPagePreview() {
    Eco_TechTheme {
        MainPage()
    }
}
