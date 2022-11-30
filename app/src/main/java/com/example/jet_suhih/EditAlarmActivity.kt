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
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jet_suhih.ui.theme.Alarm
import com.example.jet_suhih.ui.theme.Back
import com.example.jet_suhih.ui.theme.Jet_SuhihTheme
import com.example.jet_suhih.ui.theme.Orangeviy

class EditAlarmActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Jet_SuhihTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Back
                ) {
                    Greeting8("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting8(name: String) {
    Box(contentAlignment = Alignment.TopStart )
    {

        Text(text = "Добавить будильник", fontSize = 24.sp,color= Color.White, fontWeight = FontWeight.Bold, modifier = Modifier.padding(27.dp,23.dp,0.dp,0.dp))

    }
    Box(contentAlignment = Alignment.TopEnd )
    {
        val context = LocalContext.current
        IconButton(onClick = {context.startActivity(Intent(context,AlarmActivity::class.java))}) {
            Image(painter= painterResource(R.drawable.backbutton),
                contentDescription="Avatar",
                modifier = Modifier
                    .padding(0.dp, 14.dp, 13.dp, 0.dp)
                    .size(56.dp)
                    .clip(CircleShape))
        }

    }

    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Spacer(modifier = Modifier.height(104.dp))
        Row(){


            Box(modifier = Modifier
                .background(Back)
                .clip(RoundedCornerShape(15.dp))){
                OutlinedTextField(
                    value ="16:30", onValueChange = { },
                    Modifier
                        .size(160.dp, 54.dp)
                        .background(Color.White)
                        .clip(RoundedCornerShape(15)),
                    leadingIcon = {
                        Icon(painter = painterResource(R.drawable.maskgroup), contentDescription = "clock", modifier = Modifier.size(16.dp))
                    }
                )
            }
            Spacer(modifier = Modifier.width(16.dp))
            Box(modifier = Modifier
                .background(Back)
                .clip(RoundedCornerShape(15.dp))) {
                OutlinedTextField(
                    value = "14.01.2021", onValueChange = { },
                    Modifier
                        .size(160.dp, 54.dp)
                        .background(Color.White)
                        .clip(RoundedCornerShape(15)),
                    leadingIcon = {
                        Icon(
                            painter = painterResource(R.drawable.maskgroup_sec),
                            contentDescription = "clock",
                            modifier = Modifier.size(16.dp)
                        )
                    }
                )
            }
        }
        Spacer(modifier = Modifier.height(16.dp))


        Box(modifier = Modifier.fillMaxWidth()){
            Column() {
                Text(text = "Повторять каждый день", fontSize = 16.sp, color = Color.White, modifier = Modifier.padding(16.dp,0.dp,0.dp,0.dp))
                Spacer(modifier = Modifier.height(16.dp))
                val checkedState = remember { mutableStateOf(false) }
                Row(modifier = Modifier.padding(23.dp, 16.dp, 0.dp,0.dp)) {
                    Box(modifier = Modifier.background(Color.White).size(17.dp))
                    {


                        Checkbox(
                            checked = checkedState.value,
                            onCheckedChange = { checkedState.value = it },
                            colors = CheckboxDefaults.colors(
                                uncheckedColor = Orangeviy
                            )
                        )
                    }
                    Text(
                        "Понедельник",
                        fontSize = 16.sp,
                        color = Color.White,
                        modifier = Modifier.padding(8.dp, 0.dp, 0.dp, 0.dp)
                    )

                }
                Row(modifier = Modifier.padding(23.dp, 16.dp, 0.dp,0.dp)) {
                    Box(modifier = Modifier.background(Color.White).size(17.dp))
                    {
                        Checkbox(
                            checked = checkedState.value,
                            onCheckedChange = { checkedState.value = it },
                            colors = CheckboxDefaults.colors(
                                uncheckedColor = Color.Yellow
                            )
                        )
                    }
                    Text(
                        "Вторник",
                        fontSize = 16.sp,
                        color = Color.White,
                        modifier = Modifier.padding(8.dp, 0.dp, 0.dp, 0.dp)
                    )

                }
                Row(modifier = Modifier.padding(23.dp, 16.dp, 0.dp,0.dp))
                {

                    Box(modifier = Modifier.background(Color.White).size(17.dp))
                    {
                        Checkbox(
                            checked = checkedState.value,
                            onCheckedChange = { checkedState.value = it },
                            colors = CheckboxDefaults.colors(
                                uncheckedColor = Orangeviy
                            )
                        )
                    }
                    Text(
                        "Среда",
                        fontSize = 16.sp,
                        color = Color.White,
                        modifier = Modifier.padding(8.dp, 0.dp, 0.dp, 0.dp)
                    )

                }
                Row(modifier = Modifier.padding(23.dp, 16.dp, 0.dp,0.dp))
                {

                    Box(modifier = Modifier.background(Color.White).size(17.dp))
                    {
                        Checkbox(
                            checked = checkedState.value,
                            onCheckedChange = { checkedState.value = it },
                            colors = CheckboxDefaults.colors(
                                uncheckedColor = Orangeviy
                            )
                        )
                    }
                    Text(
                        "Четверг",
                        fontSize = 16.sp,
                        color = Color.White,
                        modifier = Modifier.padding(8.dp, 0.dp, 0.dp, 0.dp)
                    )

                }
                Row(modifier = Modifier.padding(23.dp, 16.dp, 0.dp,0.dp))
                {
                    Box(modifier = Modifier.background(Color.White).size(17.dp))
                    {
                        Checkbox(
                            checked = checkedState.value,
                            onCheckedChange = { checkedState.value = it },
                            colors = CheckboxDefaults.colors(
                                uncheckedColor = Orangeviy
                            )
                        )
                    }
                    Text(
                        "Пятница",
                        fontSize = 16.sp,
                        color = Color.White,
                        modifier = Modifier.padding(8.dp, 0.dp, 0.dp, 0.dp)
                    )

                }
                Row(modifier = Modifier.padding(23.dp, 16.dp, 0.dp,0.dp)) {

                    Box(modifier = Modifier.background(Color.White).size(17.dp))
                    {
                        Checkbox(
                            checked = checkedState.value,
                            onCheckedChange = { checkedState.value = it },
                            colors = CheckboxDefaults.colors(
                                uncheckedColor = Orangeviy
                            )
                        )
                    }
                    Text(
                        "Суббота",
                        fontSize = 16.sp,
                        color = Color.White,
                        modifier = Modifier.padding(8.dp, 0.dp, 0.dp, 0.dp)
                    )

                }
                Row(modifier = Modifier.padding(23.dp, 16.dp, 0.dp,0.dp)){
                    Box(modifier = Modifier.background(Color.White).size(17.dp))
                    {
                        Checkbox(
                            checked = checkedState.value,
                            onCheckedChange = { checkedState.value = it },
                            colors = CheckboxDefaults.colors(
                                uncheckedColor = Orangeviy
                            )
                        )
                    }
                    Text(
                        "Воскресенье",
                        fontSize = 16.sp,
                        color = Color.White,
                        modifier = Modifier.padding(8.dp, 0.dp, 0.dp, 0.dp)
                    )

                }
            }
            Column(verticalArrangement = Arrangement.Bottom, horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.fillMaxSize()){
                val context = LocalContext.current
                Button(onClick = {
                },
                    Modifier
                        .size(340.dp, 54.dp)
                        .clip(RoundedCornerShape(15)),
                    colors = ButtonDefaults.buttonColors(Alarm)) {
                    Text(text = "Удалить будильник", fontSize = 24.sp, color = Color.White)
                }
                Spacer(modifier = Modifier.height(16.dp))
                Button(onClick = {
                },
                    Modifier
                        .size(340.dp, 54.dp)
                        .clip(RoundedCornerShape(15)),
                    colors = ButtonDefaults.buttonColors(com.example.jet_suhih.ui.theme.Button)) {
                    Text(text = "Сохранить будильник", fontSize = 24.sp, color = Color.White)
                }
                Spacer(modifier = Modifier.height(16.dp))
            }
        }

    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview8() {
    Jet_SuhihTheme {
        Greeting8("Android")
    }
}