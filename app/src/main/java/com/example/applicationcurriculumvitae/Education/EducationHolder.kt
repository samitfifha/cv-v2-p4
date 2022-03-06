package com.example.applicationcurriculumvitae.Education

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.applicationcurriculumvitae.R



class EducationHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val PICTURE: ImageView
    val NAME: TextView
    val ADRS: TextView
    val DATE: TextView
    val DAY: TextView

    init {
        PICTURE = itemView.findViewById<ImageView>(R.id.PICTUREE)
        NAME = itemView.findViewById<TextView>(R.id.Name)
        ADRS = itemView.findViewById<TextView>(R.id.Adress)
        DATE = itemView.findViewById<TextView>(R.id.date1)
        DAY = itemView.findViewById<TextView>(R.id.day)
    }

}