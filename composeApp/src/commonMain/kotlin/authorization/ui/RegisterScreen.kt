package authorization.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import authorization.ui.components.CustomElevatedButton
import authorization.ui.components.CustomTextField
import dev.icerock.moko.resources.compose.painterResource
import org.example.project.MR

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RegisterScreen(){

    val background: Brush = Brush.verticalGradient(
        colors = listOf(
            Color(0xFF4A7DDF),
            Color(0xFF4A4ADF),
        )
    )
    Scaffold(
        containerColor = Color.Transparent,
        modifier = Modifier.background(background),
        topBar = {
            CenterAlignedTopAppBar(
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(Color.Transparent),
                title = { Text(text = "Welcome", color = Color.White, fontSize = 35.sp) }
            )
        },

        ) { innerPadding ->
        Column(
            modifier = Modifier.padding(innerPadding),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(MR.images.login),
                contentDescription = null,
                modifier = Modifier.fillMaxHeight(0.4f).fillMaxWidth(0.9f),
                alignment = Alignment.BottomCenter
            )
            RegisterForm()
        }
    }
}

@Composable
private fun RegisterForm(){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .clip(RoundedCornerShape(20.dp, 20.dp))
            .background(Color.White)
    ) {
        CustomTextField(label = "First Name", onTextInput = {})
        CustomTextField(label = "Last Name", onTextInput = {})
        CustomTextField(label = "Email", onTextInput = {})
        CustomTextField(label = "Password", onTextInput = {})
        Spacer(modifier = Modifier.fillMaxHeight(0.3f))
        CustomElevatedButton(onButtonClick = {}, buttonLabel = "Log In")
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = "Already have an account?", color = Color.Black, fontSize = 19.sp)
            TextButton(onClick = {}) {
                Text(text = "Sign In", color = Color.Blue, fontSize = 19.sp)
            }
        }
    }
}

















