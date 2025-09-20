package uacj.practica.interfaz_octavopasajero.ui.pantallas

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import uacj.practica.interfaz_octavopasajero.R
import uacj.practica.interfaz_octavopasajero.ui.theme.ColoresAlien

data class ObjetoInventario(
    val nombre: String,
    val descripcion: String
)

@Composable
fun PantallaInventario(modificador: Modifier = Modifier) {
    val inventario = listOf(
        ObjetoInventario(
            "Motion Tracker",
            "Dispositivo que detecta movimiento en un radio de 20 metros."
        ),
        ObjetoInventario(
            "Traje de presión",
            "Protección contra atmósferas hostiles y contacto con fluidos biológicos peligrosos."
        ),
        ObjetoInventario(
            "Grabadora de voz",
            "Usada para dejar mensajes de audio. Contiene registros clave de la tripulación del Nostromo."
        )
    )

    Column(modifier = modificador.padding(24.dp)) {
        Text(
            text = "INVENTARIO",
            color = ColoresAlien.Texto,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        for (objeto in inventario) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp)
                    .border(1.dp, ColoresAlien.Texto)
                    .padding(12.dp)
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        text = objeto.nombre,
                        color = ColoresAlien.Texto,
                        modifier = Modifier.padding(start = 16.dp)
                    )
                }

                Text(
                    text = objeto.descripcion,
                    color = ColoresAlien.Texto,
                    modifier = Modifier.padding(top = 8.dp)
                )
            }
        }
    }
}