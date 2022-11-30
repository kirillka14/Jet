package com.example.jet_suhih

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import com.example.jet_suhih.ui.theme.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Jet_SuhihTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Back
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    val context = LocalContext.current
    Box(contentAlignment = Alignment.TopStart )
    {

        Text(text = "Список дел", fontSize = 24.sp,color=Color.White, fontWeight = FontWeight.Bold, modifier = Modifier.padding(27.dp,23.dp,0.dp,0.dp))

    }
    Box(contentAlignment = Alignment.TopEnd )
    {

        IconButton(onClick = {context.startActivity(Intent(context,ProfileActivity::class.java))}) {
            Image(painter= painterResource(R.drawable.avatar),
                contentDescription="Avatar",
                modifier = Modifier
                    .padding(0.dp, 14.dp, 13.dp, 0.dp)
                    .size(56.dp)
                    .clip(CircleShape))
        }

    }
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Spacer(modifier = Modifier.height(132.dp))
        Card(
            shape = Shapes.large,
            modifier = Modifier
                .size(380.dp, 90.dp)
                .clickable {context.startActivity(Intent(context,EditTaskActivity::class.java))},
            elevation = 10.dp,
            backgroundColor = Fon

        )
        {
            Column(horizontalAlignment = Alignment.Start, modifier = Modifier.padding(16.dp,12.dp,0.dp,0.dp)) {
                Text(text = "Вечерний поход в кино", fontSize = 16.sp,color=Color.White, fontWeight = FontWeight.Bold)
                Text(text = "Идем в кино с коллегами!", fontSize = 11.sp,color= BackGray)
            }
            Column(horizontalAlignment = Alignment.End, modifier = Modifier.padding(0.dp,17.dp,8.dp,0.dp)) {

                Column(horizontalAlignment = Alignment.Start) {
                    Text(text = "10.02.2021", fontSize = 11.sp,color= BackGray)
                    Text(text = "19:40", fontSize = 11.sp,color= BackGray)
                }

            }

        }
        Spacer(modifier = Modifier.height(16.dp))
        Card(
            shape = Shapes.large,
            modifier = Modifier
                .size(380.dp, 90.dp)
                .clickable {context.startActivity(Intent(context,EditTaskActivity::class.java))},
            elevation = 10.dp,
            backgroundColor = Fon

        )
        {
            Column(horizontalAlignment = Alignment.Start, modifier = Modifier.padding(16.dp,12.dp,0.dp,0.dp)) {
                Text(text = "Забрать заказ Ozon", fontSize = 16.sp,color=Color.White, fontWeight = FontWeight.Bold)
                Text(text = "Пункт выдачи на ул. Ленина, 103", fontSize = 11.sp,color= BackGray)
            }
            Column(horizontalAlignment = Alignment.End, modifier = Modifier.padding(0.dp,17.dp,8.dp,0.dp)) {

                Column(horizontalAlignment = Alignment.Start) {
                    Text(text = "10.02.2021", fontSize = 11.sp,color= BackGray)
                    Text(text = "19:40", fontSize = 11.sp,color= BackGray)
                }

            }
        }
        Spacer(modifier = Modifier.height(16.dp))
        Card(
            shape = Shapes.large,
            modifier = Modifier
                .size(380.dp, 90.dp)
                .clickable {context.startActivity(Intent(context,EditTaskActivity::class.java))},
            elevation = 10.dp,
            backgroundColor = Fon

        )
        {
            Column(horizontalAlignment = Alignment.Start, modifier = Modifier.padding(16.dp,12.dp,0.dp,0.dp)) {
                Text( text = "Запись в автосервис", fontSize = 16.sp,color=Color.White, fontWeight = FontWeight.Bold)
                Text(modifier = Modifier.width(248.dp),text = "Сдать автомобиль в автосервис на ул.Бисертская, д. 14. Замена масла", maxLines = 2, fontSize = 11.sp,color= BackGray)
            }
            Column(horizontalAlignment = Alignment.End, modifier = Modifier.padding(0.dp,17.dp,8.dp,0.dp)) {

                Column(horizontalAlignment = Alignment.Start) {
                    Text(text = "10.02.2021", fontSize = 11.sp,color=BackGray)
                    Text(text = "19:40", fontSize = 11.sp,color= BackGray)
                }

            }
        }
        Column(modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Bottom
        ) {
            Button(onClick = {context.startActivity(Intent(context,AddTaskActivity::class.java))},modifier = Modifier
                .width(324.dp)
                .height(48.dp)
                .clip(RoundedCornerShape(10.dp)),colors = ButtonDefaults.buttonColors(Button)
            )
            {
                Text("Добавить задачу", fontSize = 18.sp, color =  Color.White)
            }
            Spacer(modifier = Modifier.height(16.dp));
            Box(contentAlignment = Alignment.Center,
                modifier = Modifier
                    .height(72.dp)
                    .width(300.dp)
                    .clip(
                        RoundedCornerShape(25.dp, 25.dp, 0.dp, 0.dp)
                    )
                    .background(Button)

            )
            {

                Row()
                {

                    IconButton(onClick = {})
                    {
                        Image(painter = painterResource(id = R.drawable.listbutton_green),contentDescription = "list", modifier = Modifier.size(50.dp))
                    }
                    Spacer(modifier = Modifier.width(16.dp))
                    IconButton(onClick = {context.startActivity(Intent(context,AlarmActivity::class.java))})
                    {
                        Image(painter = painterResource(id = R.drawable.alarmbutton_red),contentDescription = "list", modifier = Modifier.size(50.dp))
                    }
                    Spacer(modifier = Modifier.width(16.dp))
                    IconButton(onClick = {context.startActivity(Intent(context,CalendarActivity::class.java))})
                    {
                        Image(painter = painterResource(id = R.drawable.calendarbutton_red),contentDescription = "list", modifier = Modifier.size(50.dp))
                    }
                    Spacer(modifier = Modifier.width(16.dp))
                    IconButton(onClick = {context.startActivity(Intent(context,SettingAlarm::class.java))})
                    {
                        Image(painter = painterResource(id = R.drawable.settingsbutton_red),contentDescription = "list", modifier = Modifier.size(50.dp))
                    }
                }
            }
        }

    }


}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Jet_SuhihTheme {
        Greeting("Android")
    }
}