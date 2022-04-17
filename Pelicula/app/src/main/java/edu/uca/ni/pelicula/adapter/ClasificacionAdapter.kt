package edu.uca.ni.pelicula.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import edu.uca.ni.pelicula.databinding.ItemClasificacionBinding
import edu.uca.ni.pelicula.models.Clasificacionitem

class ClasificacionAdapter(val clasificacionitem: List<Clasificacionitem>):RecyclerView.Adapter<ClasificacionAdapter.ClasificacionHolder>(){


    inner class ClasificacionHolder(val binding: ItemClasificacionBinding): RecyclerView.ViewHolder(binding.root) {

        fun bind(clasificacion: Clasificacionitem){
            with(binding){

                txtId.text = clasificacion.idClasificacion.toString()
                txtAbreviacion.text = clasificacion.abreviacion
                txtNombre.text = clasificacion.nombre

            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ClasificacionHolder {
        val binding = ItemClasificacionBinding.inflate(LayoutInflater.from(parent.context),parent,false)

        return ClasificacionHolder(binding)
    }

    override fun onBindViewHolder(holder: ClasificacionHolder, position: Int) {
        holder.bind(clasificacionitem[position])
    }

    override fun getItemCount(): Int = clasificacionitem.size
}