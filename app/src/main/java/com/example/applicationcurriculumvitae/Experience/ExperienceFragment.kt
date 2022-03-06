package com.example.applicationcurriculumvitae.Experience

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.applicationcurriculumvitae.R

class ExperienceFragment : Fragment() {


    lateinit var recylcerExperience: RecyclerView
    lateinit var recylcerExperienceAdapter: ExperienceAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
    {

        val view=inflater.inflate(R.layout.fragment_experience,container,false)

        recylcerExperience = view.findViewById(R.id.recylcerExperience)

        var experienceList: MutableList<experience> = ArrayList()

        experienceList.add(experience(EPICTURE = R.drawable.ic_logo_facebook,  ENAME= "Facebook", EADRES = "Tunis", EEDATE = "12/10/2021", ESDATE = "12/10/2021", EDESC = "lorem ipsum dolor sit amet consectetur adipiscing elit sed do eiusmod tempor invididunt ut labore et dolore magna aliqua ut enim  ad mimim veniam, quis nostrud exercitation utlamco labrois nisi ut aliquip ex ea commodo consequat" ))
        experienceList.add(experience(EPICTURE = R.drawable.ic_logo_esprit,  ENAME= "Esprit", EADRES = "Tunis", EEDATE = "12/10/2021", ESDATE = "12/10/2021", EDESC = "lorem ipsum dolor sit amet consectetur adipiscing elit sed do eiusmod tempor invididunt ut labore et dolore magna aliqua ut enim  ad mimim veniam, quis nostrud exercitation utlamco labrois nisi ut aliquip ex ea commodo consequat" ))
        experienceList.add(experience(EPICTURE = R.drawable.ic_logo_amazon,  ENAME= "Amazon", EADRES = "Tunis", EEDATE = "12/10/2021", ESDATE = "12/10/2021", EDESC = "lorem ipsum dolor sit amet consectetur adipiscing elit sed do eiusmod tempor invididunt ut labore et dolore magna aliqua ut enim  ad mimim veniam, quis nostrud exercitation utlamco labrois nisi ut aliquip ex ea commodo consequat" ))
        experienceList.add(experience(EPICTURE = R.drawable.ic_logo_linkedin,  ENAME= "Linkedin", EADRES = "Tunis", EEDATE = "12/10/2021", ESDATE = "12/10/2021", EDESC = "lorem ipsum dolor sit amet consectetur adipiscing elit sed do eiusmod tempor invididunt ut labore et dolore magna aliqua ut enim  ad mimim veniam, quis nostrud exercitation utlamco labrois nisi ut aliquip ex ea commodo consequat" ))
        experienceList.add(experience(EPICTURE = R.drawable.ic_logo_googles,  ENAME= "Google", EADRES = "Tunis", EEDATE = "12/10/2021", ESDATE = "12/10/2021", EDESC = "lorem ipsum dolor sit amet consectetur adipiscing elit sed do eiusmod tempor invididunt ut labore et dolore magna aliqua ut enim  ad mimim veniam, quis nostrud exercitation utlamco labrois nisi ut aliquip ex ea commodo consequat" ))



        recylcerExperienceAdapter = ExperienceAdapter(experienceList)

        recylcerExperience.adapter = recylcerExperienceAdapter

        recylcerExperience.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        return view

    }
}
