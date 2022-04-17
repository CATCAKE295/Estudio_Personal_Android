package edu.uca.ni.pelicula.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import edu.uca.ni.pelicula.databinding.FragmentIdiomaBinding
import edu.uca.ni.pelicula.databinding.ItemIdiomaBinding
import edu.uca.ni.pelicula.models.Idiomaitem

class IdiomaAdapter(val idiomaitem: List<Idiomaitem>): RecyclerView.Adapter<IdiomaAdapter.IdiomaHolder>() {

    inner class IdiomaHolder(val binding: ItemIdiomaBinding): RecyclerView.ViewHolder(binding.root) {

        fun bind(idioma : Idiomaitem){
             with(binding){
                 txtId.text = idioma.idIdioma.toString()
                 txtNombre.text = idioma.nombre
             }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IdiomaHolder {
        val binding = ItemIdiomaBinding.inflate(LayoutInflater.from(parent.context),parent,false)

        return IdiomaHolder(binding)
    }

    override fun onBindViewHolder(holder: IdiomaHolder, position: Int) {
        holder.bind(idiomaitem[position])
    }

    override fun getItemCount(): Int = idiomaitem.size
}