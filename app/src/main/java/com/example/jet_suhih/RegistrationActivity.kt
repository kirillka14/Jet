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
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jet_suhih.ui.theme.Back
import com.example.jet_suhih.ui.theme.Jet_SuhihTheme
import androidx.compose.ui.graphics.Shape as Shape1

class RegistrationActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Jet_SuhihTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Back
                ) {
                    Greeting6("Android")
                }
            }
        }
    }
}
@Composable
fun TextInputView() {
    var amountInput by remember { mutableStateOf("") }
   TextField(
        value = amountInput,
        onValueChange = { amountInput = it },
        label = { Text(text = "Имя пользователя") },
        modifier = Modifier
            .size(390.dp, 84.dp)
            ,
        singleLine = true,
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Ascii),
        keyboardActions = KeyboardActions(
            onDone = { amountInput = "" }
        ), colors =TextFieldDefaults.textFieldColors(backgroundColor = Color.White)


        )
}
@Composable
fun TextInputView1() {
    var amountInput by remember { mutableStateOf("") }
    TextField(
        value = amountInput,
        onValueChange = { amountInput = it },
        label = { Text(text = "Адрес электронной почты") },
        modifier = Modifier
            .size(380.dp, 78.dp)
            ,
        singleLine = true,
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Ascii),
        keyboardActions = KeyboardActions(
            onDone = { amountInput = "" }
        ),colors =TextFieldDefaults.textFieldColors(backgroundColor = Color.White)


        )
}
@Composable
fun PasswordTextField()
{
    var password by rememberSaveable{mutableStateOf("")}
    var passwordVisibility by remember{ mutableStateOf(false)}
    val icon =if(passwordVisibility)
        painterResource(id = R.drawable.design_ic_visibility)
    else
        painterResource(id = R.drawable.design_ic_visibility_off)
    TextField(

        value = password,
        onValueChange ={password = it},
        placeholder = { Text(text = "Пароль")},
        label = { Text(text = "Пароль")},

        trailingIcon =
        {
            IconButton(onClick = { passwordVisibility =!passwordVisibility })
            {
                Icon(painter = icon, contentDescription = "Visibility Icon")
            }
        }
        ,colors =TextFieldDefaults.textFieldColors(backgroundColor = Color.White)
        , visualTransformation =
        if (passwordVisibility) VisualTransformation.None
        else PasswordVisualTransformation()
        , modifier = Modifier
            .size(380.dp, 68.dp)
            .background(Color.Transparent)
    )

}
@Composable
fun Greeting6(name: String) {
    var login by rememberSaveable { mutableStateOf("") }
    var password by rememberSaveable { mutableStateOf("") }
    var email by rememberSaveable { mutableStateOf("") }
    val context = LocalContext.current
    Box(contentAlignment = Alignment.TopStart )
    {

        Text(text = "Регистрация", fontSize = 24.sp,color= Color.White, fontWeight = FontWeight.Bold, modifier = Modifier.padding(27.dp,23.dp,0.dp,0.dp))

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
    Box(contentAlignment = Alignment.Center, modifier = Modifier
        .fillMaxWidth()
        .background(Back).clip(RoundedCornerShape(25))) {
        Column {
            Box(modifier = Modifier
                .background(Color.Transparent)
                .size(380.dp, 64.dp)
                .clip(shape = RoundedCornerShape(15.dp))

                )
            {
               TextInputView()
            }
            Spacer(modifier = Modifier.height(16.dp))
            Box(modifier = Modifier
                .background(Color.Transparent)
                .size(380.dp, 66.dp)
                .clip(shape = RoundedCornerShape(15.dp))

                ) {

                TextInputView1()
            }
            Spacer(modifier = Modifier.height(16.dp))

            Card( modifier = Modifier
                .background(Color.Transparent)
                .size(380.dp, 66.dp).clip(shape = RoundedCornerShape(15.dp))

                ){

              PasswordTextField()
            }
            Spacer(modifier = Modifier.height(16.dp))
            val context = LocalContext.current
            Button(onClick = {
            },
                Modifier
                    .size(340.dp, 54.dp)
                    .clip(RoundedCornerShape(15))
                    .padding(56.dp, 0.dp, 0.dp, 0.dp),
                colors = ButtonDefaults.buttonColors(com.example.jet_suhih.ui.theme.Button)) {
                Text(text = "Регистрация", fontSize = 24.sp, color = Color.White)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview6() {
    Jet_SuhihTheme {
        Greeting6("Android")
    }
}