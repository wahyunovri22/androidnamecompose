package com.example.namaandroid.ui

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.namaandroid.model.AndroidModel
import com.example.namaandroid.ui.navigation.Screen

@Composable
fun AndroidCard(data: AndroidModel, navController: NavController) {
    Card(
        modifier = Modifier
            // The space between each card and the other
            .padding(10.dp)
            .fillMaxWidth()
            .wrapContentHeight()
            .clickable {
                navController.navigate(Screen.Detail.route+"/{name}".replace(
                    oldValue = "{name}",
                    newValue = "${data.nama}",
                )+"/{deskripsi}".replace(
                    oldValue = "{deskripsi}",
                    newValue = "${data.deskripsi2}",
                )+"/{image}".replace(
                    oldValue = "{image}",
                    newValue = "${data.image}",
                )+"/{image2}".replace(
                    oldValue = "{image2}",
                    newValue = "${data.image2}",
                ))
            },
        shape = MaterialTheme.shapes.medium,
        elevation = 5.dp,
        backgroundColor = Color.White
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Image(
                painter = painterResource(id = data.image),
                contentDescription = null,
                modifier = Modifier
                    .size(130.dp)
                    .padding(8.dp),
                contentScale = ContentScale.Fit,
            )
            Column(Modifier.padding(8.dp)) {
                Text(
                    text = data.nama,
                    style = MaterialTheme.typography.h4,
                    modifier = Modifier
                        .padding(bottom = 8.dp)
                        .fillMaxWidth(),
                    color = Color.Black,
                )
                Text(
                    color = Color.Black,
                    text = data.deskripsi,
                    style = MaterialTheme.typography.body2,
                    modifier = Modifier.padding(bottom = 4.dp)
                )
            }
        }
    }
}