package uacj.practica.interfaz_octavopasajero.ui.moleculas

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import uacj.practica.interfaz_octavopasajero.ui.theme.ColoresAlien

@Composable
fun RenglonDoble(
    izquierda: String,
    derecha: String,
    modificador: Modifier = Modifier
) {
    Row(
        modifier = modificador
            .fillMaxWidth()
            .border(1.dp, ColoresAlien.Borde)
            .padding(12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = izquierda,
            color = ColoresAlien.Texto,
            modifier = Modifier.width(100.dp)
        )
        Text(
            text = derecha,
            color = ColoresAlien.Texto,
            modifier = Modifier.weight(1f)
        )
    }
}