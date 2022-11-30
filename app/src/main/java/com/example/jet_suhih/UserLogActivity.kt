package com.example.jet_suhih

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jet_suhih.ui.theme.Back
import com.example.jet_suhih.ui.theme.Jet_SuhihTheme

class UserLogActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Jet_SuhihTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Back
                ) {
                    Greeting9("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting9(name: String) {
    val context = LocalContext.current
    var login by rememberSaveable { mutableStateOf("") }
    var password by rememberSaveable { mutableStateOf("") }
    Box(contentAlignment = Alignment.TopStart )
    {

        Text(text = "Войти", fontSize = 24.sp,color= Color.White, fontWeight = FontWeight.Bold, modifier = Modifier.padding(27.dp,23.dp,0.dp,0.dp))

    }
    Box(contentAlignment = Alignment.TopEnd )
    {

        IconButton(onClick = {context.startActivity(Intent(context,SettingAlarm::class.java))}) {
            Image(painter= painterResource(R.drawable.backbutton),
                contentDescription="Avatar",
                modifier = Modifier
                    .padding(0.dp, 14.dp, 13.dp, 0.dp)
                    .size(56.dp)
                    .clip(CircleShape))
        }

    }
    Spacer(modifier = Modifier.height(200.dp))
    Box(contentAlignment = Alignment.Center, modifier = Modifier.fillMaxSize(),) {
        Column {
            Box(modifier = Modifier){
                TextField(
                    value = login, onValueChange = {login = it},
                    Modifier
                        .size(380.dp, 68.dp)
                        .background(Color.Transparent)
                        .clip(shape = RoundedCornerShape(15.dp))
                    ,colors =TextFieldDefaults.textFieldColors(backgroundColor = Color.White),
                    placeholder = { Text("Логин") }
                )
            }
            Spacer(modifier = Modifier.height(16.dp))

            Box(modifier = Modifier
                .background(Back)
                .clip(RoundedCornerShape(15.dp))){

              PasswordTextField()
            }
            Spacer(modifier = Modifier.height(16.dp))
            val context = LocalContext.current
            Button(onClick = {
            },
                Modifier
                    .size(340.dp, 54.dp)
                    .clip(RoundedCornerShape(15)),
                colors = ButtonDefaults.buttonColors(com.example.jet_suhih.ui.theme.Button)) {
                Text(text = "Войти", fontSize = 24.sp, color = Color.White)
            }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview9() {
    Jet_SuhihTheme {
        Greeting9("Android")
    }
}