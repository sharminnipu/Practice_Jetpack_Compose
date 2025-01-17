package com.datasoft.testingcompose1

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Title()
        }

    }
}

@Composable
fun Title(){
    val context= LocalContext.current
    Text(
        text = "Sharmin Alam Nipu",
        fontSize= 32.sp,
        fontFamily = FontFamily.Cursive,
        color= colorResource(id = R.color.purple_700),
        modifier = Modifier.clickable {
            Toast.makeText(context,"Title Clicked",Toast.LENGTH_SHORT).show()
        }
    )
}
@Preview(showBackground = true)
@Composable
fun DefaultPreview(){
    Surface (Modifier.fillMaxSize()){
        Title()
    }
}
