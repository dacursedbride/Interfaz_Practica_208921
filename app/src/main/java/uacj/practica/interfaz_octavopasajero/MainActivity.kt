package uacj.practica.interfaz_octavopasajero

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import uacj.practica.interfaz_octavopasajero.ui.theme.Interfaz_OctavoPasajeroTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Interfaz_OctavoPasajeroTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { padding_interno ->
                    PantallaNavegacion(
                        modificador = Modifier
                            .padding(padding_interno)
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Interfaz_OctavoPasajeroTheme {
        Scaffold(modifier = Modifier.fillMaxSize()){padding_interno ->
            PantallaNavegacion(
                modificador = Modifier.padding(padding_interno)
            )
        }
    }
}