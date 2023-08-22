package com.example.eco_tech

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.eco_tech.ui.theme.Eco_TechTheme


@Composable
fun Navbar() {
    Column {
        Row(
            modifier = Modifier
                .background(Color(0xFF3dd7b7))
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                modifier = Modifier
                    .height(75.dp)
                    .padding(10.dp),
                painter = painterResource(id = R.drawable.logo_ecotech),
                contentDescription = "Logo_EcoTech"
            )
            BarsButton()
        }
    }
}

@Composable
fun BarsButton() {
    Column(
        modifier = Modifier
            .width(66.dp)
            .height(40.dp)
            .padding(end = 20.dp)
            .border(width = 1.dp, color = Color(0xBFFFFFFF)),
        verticalArrangement = Arrangement.Center
    ) {
        Box(
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .size(20.dp, 2.dp)
                .background(Color(0xBFFFFFFF))
        )
        Spacer(modifier = Modifier.height(6.dp))
        Box(
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .size(20.dp, 2.dp)
                .background(Color(0xBFFFFFFF))
        )
        Spacer(modifier = Modifier.height(6.dp))
        Box(
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .size(20.dp, 2.dp)
                .background(Color(0xBFFFFFFF))
        )
    }
}

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun NavbarPreview() {
    Eco_TechTheme {
        Navbar()
    }
}
