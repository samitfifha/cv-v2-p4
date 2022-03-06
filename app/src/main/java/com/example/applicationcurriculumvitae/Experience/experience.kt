package com.example.applicationcurriculumvitae.Experience

import androidx.annotation.DrawableRes

const val PICTURE = "PICTURE"
const val NAME = "NAME"
const val EADRES = "EADRES"
const val SDATE = "SDATE"
const val EDATE = "EDATE"
const val DESC = "DESC"

 class experience(

    @DrawableRes
    val EPICTURE: Int,

    val ENAME: String,

    val EADRES: String,

    val ESDATE: String,

    val EEDATE: String,

    val EDESC: String
)