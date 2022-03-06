package com.example.applicationcurriculumvitae.Education

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.applicationcurriculumvitae.Experience.ExperienceAdapter
import com.example.applicationcurriculumvitae.Experience.experience
import com.example.applicationcurriculumvitae.R


class EducationFragment : Fragment() {

    lateinit var recylcerEducation: RecyclerView
    lateinit var recylcerEducationAdapter: EducationAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
    {

        val view=inflater.inflate(R.layout.fragment_education,container,false)

        recylcerEducation = view.findViewById(R.id.recylcerEducation)

        var educationList: MutableList<Education> = ArrayList()

        educationList.add(Education(PICTURE = R.drawable.ic_logo_massachusetts,  NAME= "Massachusetts", ADRESS = "Tunis", DATE = "12/10/2021", DAY = "TODAY" ))
        educationList.add(Education(PICTURE = R.drawable.ic_logo_harvard,  NAME= "Harvard", ADRESS = "Tunis", DATE = "12/10/2021", DAY = "TODAY" ))
        educationList.add(Education(PICTURE = R.drawable.ic_logo_microsoft,  NAME= "Microsoft", ADRESS = "Tunis",DATE = "12/10/2021", DAY = "TODAY" ))
        educationList.add(Education(PICTURE = R.drawable.ic_logo_oxford,  NAME= "Oxford", ADRESS = "Tunis", DATE = "12/10/2021", DAY = "TODAY" ))
        educationList.add(Education(PICTURE = R.drawable.ic_logo_stanford,  NAME= "Stanford", ADRESS = "Tunis", DATE = "12/10/2021", DAY = "TODAY" ))



        recylcerEducationAdapter = EducationAdapter(educationList)

        recylcerEducation.adapter = recylcerEducationAdapter

        recylcerEducation.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        return view

    }

}