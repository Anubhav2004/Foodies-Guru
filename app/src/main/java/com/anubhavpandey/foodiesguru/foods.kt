package com.anubhavpandey.foodiesguru

import androidx.annotation.DrawableRes

data class Food(
    @DrawableRes val imgResource: Int,
    val title: String,
    val desc: String
)

val foodList = listOf(
    Food(R.drawable.burger, "Veg burger", "Burger starting from rs 80."),
    Food(R.drawable.pizza, "Veg pizza", "pizza starting from rs 100."),
    Food(R.drawable.icecream, "icecream", "get all variety of ice-cream."),
    Food(R.drawable.momos, "momos", "get 10%off."),
    Food(R.drawable.donut, "donut", "get 5%off."),
    Food(R.drawable.noodles, "noodles", "noodles starting from rs 40."),
    Food(R.drawable.sandwitch, "sandwitch", "buy 2 get 1 free."),
    Food(R.drawable.pancake, "pancake", "pancake starting from rs 120."),

)
