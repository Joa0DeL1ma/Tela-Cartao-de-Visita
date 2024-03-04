package com.example.tela_cartao_de_visita

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
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
    Column (
        Modifier
            .background(Color(0xFFA4C639))
            .fillMaxSize()){
        ComposableRow1(
            mainImage = painterResource(id = R.drawable.kotlin_icon_svg),
            name = stringResource(R.string.name),
            titulo = stringResource(R.string.title)
        )
    }
}

@Composable
fun ComposableRow1(
    mainImage: Painter,
    name: String,
    titulo: String,
    modifier: Modifier = Modifier) {
}

@Composable
fun ComposableRow2(
    name: String,
    modifier: Modifier = Modifier) {
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TelaCartaodeVisitaTheme {
        ComposeTela()
    }
}