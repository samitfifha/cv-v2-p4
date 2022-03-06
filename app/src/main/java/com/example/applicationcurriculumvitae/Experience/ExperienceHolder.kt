package com.example.applicationcurriculumvitae.Experience

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.applicationcurriculumvitae.R


class ExperienceHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val PICTURE : ImageView
    val NAME : TextView
    val ADRS : TextView
    val SDATE : TextView
    val EDATE : TextView

    init {
        PICTURE = itemView.findViewById<ImageView>(R.id.PICTURE2)
        NAME = itemView.findViewById<TextView>(R.id.company1)
        ADRS = itemView.findViewById<TextView>(R.id.adress)
        SDATE = itemView.findViewById<TextView>(R.id.date2)
        EDATE = itemView.findViewById<TextView>(R.id.date3)
    }

}