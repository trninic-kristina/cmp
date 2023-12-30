package authorization.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CustomElevatedButton(buttonLabel: String, onButtonClick: () -> Unit) {

    val background: Brush = Brush.verticalGradient(
        colors = listOf(
            Color(0xFF4A7DDF),
            Color(0xFF4A4ADF),
        )
    )
    Box(contentAlignment = Alignment.Center) {
        Surface(
            shape = RoundedCornerShape(20.dp),
        ) {
            ElevatedButton(
                colors = ButtonDefaults.elevatedButtonColors(containerColor = Color.Transparent),
                onClick = onButtonClick,
                modifier = Modifier.height(46.dp).fillMaxWidth(0.6f).background(background)
            ) {
                Text(text = buttonLabel, color = Color.White, fontSize = 19.sp)
            }
        }
    }
}