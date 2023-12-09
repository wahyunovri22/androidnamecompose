package com.example.namaandroid.ui.navigation

sealed class Screen(val route: String) {
    object Detail : Screen("detail")
    object Profile : Screen("profile")
    object Home : Screen("home")

    fun witArgs(vararg args:String):String {
        return buildString {
            append(route)
            args.forEach { arg ->
                append("/$arg")
            }
        }
    }
}