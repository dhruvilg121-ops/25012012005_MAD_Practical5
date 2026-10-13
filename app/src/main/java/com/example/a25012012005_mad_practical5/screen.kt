package com.example.a25012012005_mad_practical5

sealed class Screen(val route: String) {
    object Login : Screen("login")
    object Registration : Screen("registration")
    object CheckBoxLevel : Screen("checkbox_level") }