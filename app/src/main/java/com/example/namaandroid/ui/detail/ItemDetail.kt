package com.example.namaandroid.ui.detail

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.namaandroid.R

@Composable
fun  ItemDetail(name: String,deskripsi:String, image :Int,image2 :Int){
    Column(
        modifier = Modifier
            .padding(5.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = image),
            contentDescription = "items des",
            modifier = Modifier.size(135.dp),
            contentScale = ContentScale.Crop
        )
        Text(
            color = Color.Black,
            fontSize = 24.sp,
            style = MaterialTheme.typography.h4,
            text = name
        )

        Text(
            color = Color.Black,
            text = deskripsi,
            modifier = Modifier.padding(3.dp)
        )

        Text(
            color = Color.Black,
            text = "Tampilan $name",
            fontSize = 24.sp,
            style = TextStyle(
                color = Color.Black,
                fontWeight = FontWeight.Bold),
            modifier = Modifier.padding(10.dp)
        )
        Image(
            painter = painterResource(id = image2),
            contentDescription = "items banner",
            modifier = Modifier .width(250.dp)
                .height(350.dp),
            contentScale = ContentScale.Crop
        )
    }
}