package com.example.applicationcurriculumvitae.Education

import androidx.annotation.DrawableRes

const val PICTURE = "PICTURE"
const val NAME = "NAME"
const val ADRESS = "ADRESS"
const val DATE = "DATE"
const val DAY = "DAY"

data class Education(

    @DrawableRes
    val PICTURE: Int,

    val NAME: String,

    val DATE: String,

    val DAY: String,

    val ADRESS: String
)