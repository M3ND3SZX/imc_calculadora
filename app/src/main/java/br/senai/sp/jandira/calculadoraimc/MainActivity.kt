package br.senai.sp.jandira.calculadoraimc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.AbsoluteAlignment
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextMeasurer
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import androidx.core.text.buildSpannedString
import br.senai.sp.jandira.calculadoraimc.ui.theme.CalculadoraIMCTheme
import java.nio.file.WatchEvent

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalculadoraIMCTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Calculadora()
                }
            }
        }
    }
}

@Composable
fun Calculadora() {
    Surface (modifier = Modifier.fillMaxSize()) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally

        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .background(color = Color(0xFFED145B))
                    .padding(0.dp, 0.dp),
                verticalArrangement = Arrangement.SpaceEvenly,
                horizontalAlignment = Alignment.CenterHorizontally

            ) {

                Image(
                    painter = painterResource(
                        id = R.drawable.medidor
                    ),
                    contentDescription = "LOgotipo",
                    modifier = Modifier
                        .size(65.dp, 65.dp)
                )
                Text(
                    text = "Calculadora IMC",
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    fontSize = 24.sp
                )
            }

            Card(
                colors = CardDefaults
                    .cardColors(containerColor = Color(0xFFF9F5F5)),
                modifier = Modifier
                    .size(270.dp, 340.dp)
                    .offset(y = -20.dp),
                elevation = CardDefaults
                    .cardElevation(defaultElevation = 12.dp)

            )
            {
                Column(
                    modifier = Modifier.padding(20.dp)
                )
                {


                    Text(
                        text = "Seus dados",
                        color = Color(0xffED145B),
                        fontWeight = FontWeight.Bold,
                        fontSize = 24.sp,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.padding(top = 10.dp, start = 50.dp)

                    )
                    Text(
                        text = "Seu peso: ",
                        color = Color(0xffED145B),
                        fontSize = 15.sp
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    OutlinedTextField(
                        value = "",
                        onValueChange = {},
                        shape = RoundedCornerShape(8.dp),
                        modifier = Modifier
                            .height(48.dp)
                            .border(1.dp, Color(0xffED145B), shape = RoundedCornerShape(8.dp)),
                        placeholder = {
                            Text(
                                text = "Seu peso em kg",
                                color = Color(0xffAFA9A9),
                                fontSize = 12.sp
                            )
                        }
                        )

                    Spacer(modifier = Modifier.height(15.dp))

                    Text(
                        text = "Sua altura: ",
                        color = Color(0xffED145B),
                        fontSize = 15.sp
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    OutlinedTextField(
                        value = "",
                        onValueChange = {},
                        shape = RoundedCornerShape(8.dp),
                        modifier = Modifier
                            .height(48.dp)
                            .border(1.dp, Color(0xffED145B), shape = RoundedCornerShape(8.dp)),
                        placeholder = {
                            Text(
                                text = "Sua altura em cm",
                                color = Color(0xffAFA9A9),
                                fontSize = 12.sp,

                                )
                        }
                    )
                    Spacer(modifier = Modifier.padding(top = 30.dp))
                    Button(
                        onClick = { /*TODO*/ },
                        colors = ButtonDefaults.buttonColors
                            (containerColor = Color(0xff0ED145B)),
                        shape = RoundedCornerShape(8.dp),
                        modifier = Modifier
                            .size(218.dp, 45.dp)
                            .padding(start = 10.dp)


                    )
                    {
                        Text(
                            text = "CALCULAR",
                            fontWeight = FontWeight.ExtraBold
                        )
                    }

                }


            }
            Spacer(modifier = Modifier.padding(top = 40.dp))

            Card (
                modifier = Modifier
                    .size(268.dp, 130.dp),
                colors =  CardDefaults
                    .cardColors(containerColor = Color(0xff329F6B)),
                elevation = CardDefaults
                    .cardElevation(defaultElevation = 10.dp),
                border = BorderStroke(1.dp, Color(0xffED145B))

            ){
                Row (
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .padding(start = 35.dp, top = 40.dp)
                        .width(200.dp)
                        ,


                ){
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                    ) {

                        Text(
                            text = "Resultado",
                            color = Color.White
                        )

                        Text(
                            text = "Peso ideal",
                            color = Color.White,
                            fontSize = 20.sp
                        )
                    }
                    Text(
                        text = "21.3",
                        color = Color.White,
                        fontSize = 36.sp,
                        fontWeight = FontWeight.ExtraBold)
                }

            }

            }


        }
    }



@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    CalculadoraIMCTheme {
        Calculadora()
    }
}