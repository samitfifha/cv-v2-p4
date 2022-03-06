package com.example.applicationcurriculumvitae.Experience

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.applicationcurriculumvitae.R

class ExperienceAdapter(val experienceList: MutableList<experience>) : RecyclerView.Adapter<ExperienceHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExperienceHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.activity_recycle_exper,parent, false)
        return ExperienceHolder(view)
    }

    override fun onBindViewHolder(holder: ExperienceHolder, position: Int) {

            val NAME = experienceList[position].ENAME
            val ADRS = experienceList[position].EADRES
            val SDATE = experienceList[position].ESDATE
            val EDATE = experienceList[position].EEDATE
            val DESC = experienceList[position].EDESC

            holder.PICTURE.setImageResource(experienceList[position].EPICTURE)
            holder.NAME.text = NAME
            holder.ADRS.text = ADRS
            holder.SDATE.text = SDATE
            holder.EDATE.text = EDATE

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

    override fun getItemCount() = experienceList.size

}