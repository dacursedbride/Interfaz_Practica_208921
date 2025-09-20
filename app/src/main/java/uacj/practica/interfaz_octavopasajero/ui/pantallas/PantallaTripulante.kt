package uacj.practica.interfaz_octavopasajero.ui.pantallas

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import uacj.practica.interfaz_octavopasajero.ui.moleculas.RenglonDoble
import uacj.practica.interfaz_octavopasajero.ui.theme.ColoresAlien


@Composable
fun PantallaTripulante(
    nombre: String,
    modificador: Modifier = Modifier
) {
    Column(
        modifier = modificador.padding(24.dp)
    ) {
        Text(
            text = "DATOS DEL TRIPULANTE",
            color = ColoresAlien.Texto,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.Top
        ) {
            Column(modifier = Modifier.weight(1f)) {
                RenglonDoble("Nombre", nombre)
                RenglonDoble("Edad", "34")
                RenglonDoble("Rango", "Teniente")
                RenglonDoble("Cargo", "Oficial de guardia / Warrant Officer")
                RenglonDoble("Nave", "USCSS Nostromo")
            }

        }

        Text(
            text = "INFORMACIÓN DEL TRIPULANTE:\nÚnica superviviente del USCSS Nostromo. Especialista en protocolos de emergencia, sistemas de soporte vital y toma de decisiones críticas bajo presión extrema.",
            color = ColoresAlien.Texto,
            modifier = Modifier.padding(top = 24.dp)
        )
    }
}