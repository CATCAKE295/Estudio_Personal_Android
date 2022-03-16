package com.example.recyclerview2.data

import com.example.recyclerview2.R
import com.example.recyclerview2.model.Superhero

class DataSource {
    fun CargarInfo(): List<Superhero>{
        return listOf<Superhero>(

            Superhero("Spider Man","Peter Paker", "Marvel",R.drawable.spiderman),
            Superhero("Iron Man","Tony Stark","Marvel",R.drawable.ironman),
            Superhero("The Batman","Bruce Wayne","DC",R.drawable.batman),
            Superhero("Rorschach","Walter Kovacs","DC",R.drawable.rorschach),
            Superhero("OverSeer","David Dunn","M. Night Shaymalan",R.drawable.overseer)

        )

    }
}