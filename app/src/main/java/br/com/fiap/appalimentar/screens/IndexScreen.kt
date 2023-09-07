package br.com.fiap.appalimentar.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import br.com.fiap.appalimentar.R

@Composable
fun IndexScreen(navcControler: NavController) {

    Box() {
        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
                .fillMaxSize()
                .background(colorResource(id = R.color.verde)),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Bem-vindo à Plataforma de Conscientização Alimentar",
                fontSize = 26.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF333333),
                modifier = Modifier.padding(bottom = 20.dp),
                textAlign = TextAlign.Center

            )
            Text(
                text = "Explore nossas categorias de conteúdo:",
                fontSize = 18.sp,
                color = Color(0xFF333333),
                modifier = Modifier.padding(bottom = 20.dp)
            )
            Spacer(modifier = Modifier.height(8.dp))
            Card(
                //shape = MaterialTheme.shapes.medium,
                shape = RoundedCornerShape(8.dp),
                // modifier = Modifier.size(280.dp, 240.dp)
                modifier = Modifier
                    .padding(10.dp, 5.dp, 10.dp, 10.dp)
                    .size(300.dp, 200.dp),
                //set card elevation of the card
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 10.dp,
                ),
                colors = CardDefaults.cardColors(
                    containerColor = colorResource(id = R.color.theme),
                ),
            ) {
                Column(modifier = Modifier.clickable(onClick = { })) {

                    Image(
                        painter = painterResource(R.drawable.blog),
                        contentDescription = null, // decorative
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .height(150.dp)
                            .fillMaxWidth()
                    )

                    Column(modifier = Modifier.padding(16.dp)) {
                        Text(
                            text = "BLOG",
                            style = MaterialTheme.typography.titleMedium,
                            maxLines = 2,
                            overflow = TextOverflow.Ellipsis
                        )

                        Spacer(modifier = Modifier.height(5.dp))

                        Text(
                            text = "Sub title Example code for android + composes app developers.",
                            //maxLines = 1,
                            //overflow = TextOverflow.Ellipsis,
                            style = MaterialTheme.typography.titleSmall,
                        )
                    }
                }
            }
            Spacer(modifier = Modifier.height(12.dp))
            Card(
                //shape = MaterialTheme.shapes.medium,
                shape = RoundedCornerShape(8.dp),
                // modifier = Modifier.size(280.dp, 240.dp)
                modifier = Modifier
                    .padding(10.dp, 5.dp, 10.dp, 10.dp)
                    .size(300.dp, 200.dp),
                //set card elevation of the card
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 10.dp,
                ),
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFF8BC34A),
                ),
            ) {
                Column(modifier = Modifier.clickable(onClick = { })) {

                    Image(
                        painter = painterResource(R.drawable.chat),
                        contentDescription = null, // decorative
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .height(150.dp)
                            .fillMaxWidth()
                    )

                    Column(modifier = Modifier.padding(16.dp)) {
                        Text(
                            text = "CONSULTA",
                            style = MaterialTheme.typography.titleMedium,
                            maxLines = 2,
                            overflow = TextOverflow.Ellipsis
                        )

                        Spacer(modifier = Modifier.height(5.dp))

                        Text(
                            text = "Sub title Example code for android + composes app developers.",
                            //maxLines = 1,
                            //overflow = TextOverflow.Ellipsis,
                            style = MaterialTheme.typography.titleSmall,
                        )
                    }
                }
            }
            Spacer(modifier = Modifier.height(12.dp))
            Card(
                //shape = MaterialTheme.shapes.medium,
                shape = RoundedCornerShape(8.dp),
                // modifier = Modifier.size(280.dp, 240.dp)
                modifier = Modifier
                    .padding(10.dp, 5.dp, 10.dp, 10.dp)
                    .size(300.dp, 200.dp),
                //set card elevation of the card
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 10.dp,
                ),
                colors = CardDefaults.cardColors(
                    containerColor = colorResource(id = R.color.theme),
                ),
            ) {
                Column(modifier = Modifier.clickable(onClick = { })) {

                    Image(
                        painter = painterResource(R.drawable.search),
                        contentDescription = null, // decorative
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .height(150.dp)
                            .fillMaxWidth()
                    )

                    Column(modifier = Modifier.padding(16.dp)) {
                        Text(
                            text = "PESQUISA",
                            style = MaterialTheme.typography.titleMedium,
                            maxLines = 2,
                            overflow = TextOverflow.Ellipsis
                        )

                        Spacer(modifier = Modifier.height(5.dp))

                        Text(
                            text = "Sub title Example code for android + composes app developers.",
                            //maxLines = 1,
                            //overflow = TextOverflow.Ellipsis,
                            style = MaterialTheme.typography.titleSmall,
                        )
                    }
                }
            }
            Spacer(modifier = Modifier.height(12.dp))
            Button(
                onClick = {
                    navcControler.navigate("login")
                },
                modifier = Modifier

                    .height(48.dp),

                shape = RoundedCornerShape(16.dp),
                colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.theme))
            ) {
                Text(
                    text = "Voltar",
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    fontSize = 14.sp
                )
            }
        }
    }

}

@Preview(showSystemUi = true)
@Composable
fun IndexScreenPreview() {
    IndexScreen(rememberNavController())
}
