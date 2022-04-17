package edu.uca.ni.pelicula.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import edu.uca.ni.pelicula.databinding.ItemGeneroBinding
import edu.uca.ni.pelicula.models.Generoitem

class GeneroAdapter(val generoitem: List<Generoitem>):RecyclerView.Adapter<GeneroAdapter.GeneroHolder>() {

    inner class GeneroHolder(val binding: ItemGeneroBinding):RecyclerView.ViewHolder(binding.root) {

        fun bind(genero : Generoitem){
            with(binding){
                txtId.text = genero.idGenero.toString()
                txtNombre.text = genero.nombre
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GeneroHolder {
        val binding = ItemGeneroBinding.inflate(LayoutInflater.from(parent.context),parent,false)

        return GeneroHolder(binding)
    }

    override fun onBindViewHolder(holder: GeneroHolder, position: Int) {
        holder.bind(generoitem[position])
    }

    override fun getItemCount(): Int = generoitem.size


}