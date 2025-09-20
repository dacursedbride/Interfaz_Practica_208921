package uacj.practica.interfaz_octavopasajero.ui.pantallas

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import uacj.practica.interfaz_octavopasajero.ui.moleculas.CuadroTextoAlien
import uacj.practica.interfaz_octavopasajero.ui.theme.ColoresAlien


@Composable
fun PantallaLogin(
    nombre: String,
    id: String,
    modificador: Modifier = Modifier
) {
    Column(
        modifier = modificador
            .fillMaxSize()
            .padding(32.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "TRIPULACIÓN NOSTROMO",
            color = ColoresAlien.Texto,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 32.dp)
        )

        CuadroTextoAlien(etiqueta = "Nombre", valor = nombre)
        CuadroTextoAlien(etiqueta = "ID", valor = id)
    }
}