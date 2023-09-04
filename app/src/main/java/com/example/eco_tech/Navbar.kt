package com.example.eco_tech

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.eco_tech.ui.theme.Eco_TechTheme


@Composable
fun Navbar(menuOpen: Boolean) {

    var openMenu by remember {
        mutableStateOf(menuOpen)
    }

    Column {
        Row(
            modifier = Modifier
                .background(Color(0xFF3DD7B7))
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
            Row {
                Box(modifier = Modifier.clickable {
                    openMenu = !openMenu
                }) {
                    BarsButton()
                }
                Spacer(modifier = Modifier.width(20.dp))
            }
        }
        if (openMenu) {
            SubMenu()
        }
    }
}


@Composable
fun BarsButton() {

    Column(
        modifier = Modifier
            .width(55.dp)
            .height(40.dp)
            .border(width = 1.dp, color = Color(0xBFFFFFFF)),
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        repeat(3) {
            Box(
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .size(20.dp, 2.dp)
                    .background(Color(0xBFFFFFFF))
            )
        }
    }

}

@Composable
fun SubMenu() {

    val menuItems = listOf(
        "Início",
        "Receitas",
        "Aproveitamento Integral",
        "Agricultura Sustentável",
        "Consulta",
        "Busca"
    )

    Column(
        modifier = Modifier
            .background(Color(0xFF3dd7b7))
            .fillMaxWidth(),
        horizontalAlignment = Alignment.End
    ) {
        Column(
            modifier = Modifier.padding(end = 20.dp, top = 10.dp),
            horizontalAlignment = Alignment.End
        ) {
            menuItems.forEach { item ->
                Text(
                    text = item,
                    color = Color.White,
                    fontSize = 18.sp,
                    modifier = Modifier
                        .padding(bottom = 25.dp)
                        .clickable {

                        }
                )
            }
        }
    }
}

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun NavbarPreview() {
    Eco_TechTheme {
        Navbar(false)
    }
}
