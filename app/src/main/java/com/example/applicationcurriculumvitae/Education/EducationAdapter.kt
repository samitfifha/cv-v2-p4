package com.example.applicationcurriculumvitae.Education

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.applicationcurriculumvitae.Experience.ExperienceHolder
import com.example.applicationcurriculumvitae.R
import java.nio.file.Files.size

class EducationAdapter (val educationList: MutableList<Education>) : RecyclerView.Adapter<EducationHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EducationHolder {
        val view= LayoutInflater.from(parent.context).inflate(R.layout.activity_recycle,parent, false)
        return EducationHolder(view)
    }

    override fun onBindViewHolder(holder: EducationHolder, position: Int) {

        val NAME = educationList[position].NAME
        val ADRS = educationList[position].ADRESS
        val DATE = educationList[position].DATE
        val DAY = educationList[position].DAY

        holder.PICTURE.setImageResource(educationList[position].PICTURE)
        holder.NAME.text = NAME
        holder.ADRS.text = ADRS
        holder.DATE.text = DATE
        holder.DAY.text = DAY

        /*    holder.itemView.setOnClickListener{
                val intent = Intent(holder.itemView.context, ExperienceFragment::class.java)
                intent.apply {
                    putExtra(PICTURE, experienceList[position].EPICTURE)
                    putExtra(NAME, NAME)
                    putExtra(ADRS, ADRS)
                    putExtra(SDATE, SDATE)
                    putExtra(EDATE, EDATE)
                    putExtra(DESC, DESC)
                }
                holder.itemView.context.startActivity(intent)
            }*/

    }

    override fun getItemCount()=educationList.size

}