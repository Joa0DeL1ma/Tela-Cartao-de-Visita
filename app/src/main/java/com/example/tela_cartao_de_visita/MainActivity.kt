package com.example.tela_cartao_de_visita

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tela_cartao_de_visita.ui.theme.TelaCartaodeVisitaTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TelaCartaodeVisitaTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ComposeTela()
                }
            }
        }
    }
}

@Composable
fun ComposeTela() {
    Column(
        Modifier
            .background(Color(0xFF073042))
            .fillMaxSize()
    ) {
        ComposableRow1(
            mainImage = painterResource(id = R.drawable.kotlin_icon_svg),
            name = stringResource(R.string.name),
            title = stringResource(R.string.title)
        )
        ComposableRow2(
            phoneIcon = Icons.Default.Phone,
            shareIcon = Icons.Default.Share,
            emailIcon = Icons.Default.Email,
            phone = stringResource(R.string.phone),
            email = stringResource(R.string.email),
            instagram = stringResource(R.string.instagram)
        )
    }
}

@Composable
fun ComposableRow1(
    mainImage: Painter,
    name: String,
    title: String,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = Modifier
            .padding(top = 180.dp, start = 16.dp, end = 16.dp)
            .fillMaxWidth()
    ) {
        Row(
            modifier = Modifier,
            horizontalArrangement = Arrangement.Center
        ) {
            Image(
                painter = mainImage,
                contentDescription = "Kotlin Logo",
                modifier.padding(start = 100.dp, end = 100.dp)
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                text = (name),
                color = Color.White,
                fontSize = 20.sp,
                modifier = Modifier.padding(top = 16.dp, start = 16.dp, end = 16.dp, bottom = 8.dp)
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                text = title,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                fontSize = 16.sp,
                style = TextStyle(
                    brush = Brush.horizontalGradient(
                        colors = listOf(
                            Color(0xFFC651BD),
                            Color(0xFFF1850B)
                        )
                    )
                )
            )
        }
    }

}

@Composable
fun ComposableRow2(
    phoneIcon: ImageVector,
    shareIcon: ImageVector,
    emailIcon: ImageVector,
    phone: String,
    email: String,
    instagram: String,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .padding(start = 94.dp, end = 50.dp, bottom = 64.dp)
            .fillMaxHeight(),
        verticalArrangement = Arrangement.Bottom
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Image(
                imageVector = phoneIcon,
                contentDescription = "ícone de telefone",
                modifier = Modifier
                    .padding(end = 8.dp),
                colorFilter = ColorFilter.tint(Color.White)
            )
            Text(
                text = (phone),
                color = Color.White,
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Image(
                modifier = Modifier
                    .padding(end = 8.dp, top = 8.dp, bottom = 8.dp),
                imageVector = shareIcon,
                contentDescription = "ícone de share",
                colorFilter = ColorFilter.tint(Color.White)
            )
            Text(
                text = (instagram),
                color = Color.White,
                modifier = Modifier.padding(top = 8.dp, bottom = 8.dp)
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Image(
                modifier= Modifier
                    .padding(end = 8.dp),
                imageVector = emailIcon,
                contentDescription = "ícone de e-mail",
                colorFilter = ColorFilter.tint(Color.White)

            )
            Text(
                text = (email),
                color = Color.White
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TelaCartaodeVisitaTheme {
        ComposeTela()
    }
}