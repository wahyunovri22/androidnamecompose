package com.example.namaandroid.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.namaandroid.model.androids
import com.example.namaandroid.ui.AllAndroid
import com.example.namaandroid.ui.CardProfile
import com.example.namaandroid.ui.detail.CardDetail

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.Home.route) {
        composable(route = Screen.Home.route) {
            AllAndroid(android = androids, navController = navController)
        }
        composable(
            route = Screen.Profile.route
        ) {
            CardProfile()
        }

        composable(
            route = Screen.Detail.route+"/{name}/{deskripsi}/{image}/{image2}",
            arguments = listOf(
                navArgument("name") {
                    defaultValue = ""
                    type = NavType.StringType
                },
                navArgument("deskripsi") {
                    defaultValue = ""
                    type = NavType.StringType
                },
                navArgument("image") {
                    defaultValue = 0
                    type = NavType.IntType
                },
                navArgument("image2") {
                    defaultValue = 0
                    type = NavType.IntType
                }
            )
        )
        { entry ->
            val name = entry.arguments?.getString("name")
            val deskripsi = entry.arguments?.getString("deskripsi")
            val image = entry.arguments?.getInt("image")
            val image2 = entry.arguments?.getInt("image2")
            CardDetail(name = name?:"", deskripsi = deskripsi?:"",
                image = image?:0, image2 = image2?:0)
        }
    }
}