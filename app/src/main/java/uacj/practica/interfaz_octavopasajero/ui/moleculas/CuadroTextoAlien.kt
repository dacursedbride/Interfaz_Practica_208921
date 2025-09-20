package uacj.practica.interfaz_octavopasajero.ui.moleculas

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import uacj.practica.interfaz_octavopasajero.ui.theme.ColoresAlien

@Composable
fun CuadroTextoAlien(
    etiqueta: String,
    valor: String = ""
) {
    Text(
        text = "$etiqueta: $valor",
        color = ColoresAlien.Texto,
        modifier = Modifier
            .padding(vertical = 5.dp)
            .border(
                width = 2.dp,
                color = ColoresAlien.Texto,
                shape = RoundedCornerShape(4.dp)
            )
            .fillMaxWidth(0.8f)
            .background(color = ColoresAlien.Fondo)
            .padding(12.dp)
    )
}