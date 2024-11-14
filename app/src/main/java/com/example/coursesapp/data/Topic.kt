package com.example.coursesapp.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic(
    @StringRes val name: Int,
    val num: Int,
    @DrawableRes val image: Int
)
