package com.example.jet_suhih

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jet_suhih.ui.theme.Back
import com.example.jet_suhih.ui.theme.Jet_SuhihTheme
import com.example.jet_suhih.ui.theme.Orangeviy

class AlarmActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Jet_SuhihTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Back
                ) {
                    Greeting4("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting4(name: String) {
    val context = LocalContext.current
    Box(contentAlignment = Alignment.TopStart )
    {

        Text(text = "Будильник", fontSize = 24.sp,color= Color.White, fontWeight = FontWeight.Bold, modifier = Modifier.padding(27.dp,23.dp,0.dp,0.dp))

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

    Column(horizontalAlignment = Alignment.Start, verticalArrangement = Arrangement.Top,modifier = Modifier.padding(20.dp,0.dp,0.dp,0.dp))
    {
        Spacer(modifier = Modifier.height(96.dp))
        Row()
        {
            TextButton(onClick = {context.startActivity(Intent(context,EditAlarmActivity::class.java))}) {
                Text("07:30", fontSize = 48.sp, color = Color.White)
            }
            Spacer(modifier = Modifier.width(132.dp))
            Box(modifier = Modifier.padding(0.dp,24.dp,0.dp,0.dp))
            {
                CustomSwitchButton(switchPadding = 8.dp,
                    buttonWidth = 80.dp,
                    buttonHeight = 40.dp,
                    value = false)
            }
        }
        Row()
        {
            TextButton(onClick = {context.startActivity(Intent(context,EditAlarmActivity::class.java))}) {
                Text("08:30", fontSize = 48.sp, color = Color.White)
            }
            Spacer(modifier = Modifier.width(132.dp))
            Box(modifier = Modifier.padding(0.dp,24.dp,0.dp,0.dp))
            {
                CustomSwitchButton(
                    switchPadding = 8.dp,
                    buttonWidth = 80.dp,
                    buttonHeight = 40.dp,
                    value = true
                )
            }
        }

    }



    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Bottom
    ) {
        Button(
            onClick = {context.startActivity(Intent(context,CreateAlarmActivity::class.java))}, modifier = Modifier
                .width(324.dp)
                .height(48.dp)
                .clip(RoundedCornerShape(10.dp)), colors = ButtonDefaults.buttonColors(
                com.example.jet_suhih.ui.theme.Button
            )
        )
        {
            Text("Добавить будильник", fontSize = 18.sp, color = Color.White)
        }
        Spacer(modifier = Modifier.height(16.dp));
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .height(72.dp)
                .width(300.dp)
                .clip(
                    RoundedCornerShape(25.dp, 25.dp, 0.dp, 0.dp)
                )
                .background(com.example.jet_suhih.ui.theme.Button)

        )
        {

            Row()
            {

                IconButton(onClick = {context.startActivity(Intent(context,MainActivity::class.java))})
                {
                    Image(
                        painter = painterResource(id = R.drawable.listbutton_red),
                        contentDescription = "list",
                        modifier = Modifier.size(50.dp)
                    )
                }
                Spacer(modifier = Modifier.width(16.dp))
                IconButton(onClick = {})
                {
                    Image(
                        painter = painterResource(id = R.drawable.alarmbutton_green),
                        contentDescription = "list",
                        modifier = Modifier.size(50.dp)
                    )
                }
                Spacer(modifier = Modifier.width(16.dp))
                IconButton(onClick = {context.startActivity(Intent(context,CalendarActivity::class.java))})
                {
                    Image(
                        painter = painterResource(id = R.drawable.calendarbutton_red),
                        contentDescription = "list",
                        modifier = Modifier.size(50.dp)
                    )
                }
                Spacer(modifier = Modifier.width(16.dp))
                IconButton(onClick = {context.startActivity(Intent(context,SettingAlarm::class.java))})
                {
                    Image(
                        painter = painterResource(id = R.drawable.settingsbutton_red),
                        contentDescription = "list",
                        modifier = Modifier.size(50.dp)
                    )
                }
            }
        }
    }
}
@Composable
fun CustomSwitchButton(
    switchPadding: Dp,
    buttonWidth: Dp,
    buttonHeight: Dp,
    value:Boolean

)
{
    val switchSize by remember {
        mutableStateOf(buttonHeight-switchPadding*2)
    }

    val interactionSource = remember {
        MutableInteractionSource()
    }
    var switchClicked by remember {
        mutableStateOf(value)
    }
    var padding by remember {
        mutableStateOf(0.dp)
    }
    padding = if (switchClicked) buttonWidth-switchSize-switchPadding*2 else 0.dp

    val animateSize by animateDpAsState(
        targetValue = if (switchClicked) padding else 0.dp,
        tween(
            durationMillis = 200,
            delayMillis = 0,
            easing = LinearOutSlowInEasing
        )
    )
    Box(
        modifier = Modifier
            .width(buttonWidth)
            .height(buttonHeight)
            .clip(CircleShape)
            .background(if (switchClicked) com.example.jet_suhih.ui.theme.Button else Orangeviy)
            .clickable(
                interactionSource = interactionSource,
                indication = null
            )
            {
                switchClicked = !switchClicked
            }
    )
    {
        Row(modifier = Modifier
            .fillMaxSize()
            .padding(switchPadding))
        {
            Box(modifier = Modifier
                .fillMaxHeight()
                .width(animateSize)
                .background(Color.Transparent))

            Box(modifier = Modifier
                .size(switchSize)
                .clip(CircleShape)
                .background(Color.White)

            )

        }
    }
}
@Preview(showBackground = true)
@Composable
fun DefaultPreview4() {
    Jet_SuhihTheme {
        Greeting4("Android")
    }
}