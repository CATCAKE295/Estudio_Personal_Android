package com.example.recyclerview1.data

import com.example.recyclerview1.R
import com.example.recyclerview1.model.Afirmacion

class Datasource {
    fun CargarInformacion() : List<Afirmacion>{
        return  listOf<Afirmacion>(

            Afirmacion(R.string.Affirmation1),
            Afirmacion(R.string.Affirmation2),
            Afirmacion(R.string.Affirmation3),
            Afirmacion(R.string.Affirmation4),
            Afirmacion(R.string.Affirmation5),
            Afirmacion(R.string.Affirmation6),
            Afirmacion(R.string.Affirmation7),
            Afirmacion(R.string.Affirmation8),
            Afirmacion(R.string.Affirmation9),
            Afirmacion(R.string.Affirmation10)


        )
    }
}