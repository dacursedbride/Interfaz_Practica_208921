package uacj.practica.interfaz_octavopasajero

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.unit.dp
import uacj.practica.interfaz_octavopasajero.ui.pantallas.PantallaLogin
import uacj.practica.interfaz_octavopasajero.ui.pantallas.PantallaTripulante
import uacj.practica.interfaz_octavopasajero.ui.pantallas.PantallaInventario
import uacj.practica.interfaz_octavopasajero.ui.theme.ColoresAlien

enum class Pantallas {
    pantalla_1,
    pantalla_2,
    pantalla_3
}

@Composable
fun PantallaNavegacion(modificador: Modifier = Modifier) {
    var mostrar_pantalla by remember { mutableStateOf(Pantallas.pantalla_1) }

    val nombreGuardado = "Ellen Ripley"
    val idGuardado = "••••••"

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(ColoresAlien.Fondo)
            .padding(16.dp)
    ) {
        when (mostrar_pantalla) {
            Pantallas.pantalla_1 -> PantallaLogin(nombre = nombreGuardado, id = idGuardado)
            Pantallas.pantalla_2 -> PantallaTripulante(nombre = nombreGuardado)
            Pantallas.pantalla_3 -> PantallaInventario()
        }

        Button(
            onClick = {
                mostrar_pantalla = when (mostrar_pantalla) {
                    Pantallas.pantalla_1 -> Pantallas.pantalla_2
                    Pantallas.pantalla_2 -> Pantallas.pantalla_3
                    Pantallas.pantalla_3 -> Pantallas.pantalla_1
                }
            },
            modifier = Modifier.align(Alignment.BottomCenter).padding(bottom = 32.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = ColoresAlien.BotonFondo,
                contentColor = ColoresAlien.Texto
            ),
            shape = RectangleShape
        ) {
            Text(
                text = when (mostrar_pantalla) {
                    Pantallas.pantalla_1 -> "Ingresar"
                    Pantallas.pantalla_2 -> "Inventario"
                    Pantallas.pantalla_3 -> "Salir"
                }
            )
        }
    }
}