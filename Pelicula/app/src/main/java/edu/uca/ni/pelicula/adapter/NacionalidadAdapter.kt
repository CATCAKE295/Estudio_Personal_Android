package edu.uca.ni.pelicula.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import edu.uca.ni.pelicula.databinding.ItemNacionalidadBinding
import edu.uca.ni.pelicula.models.Nacionalidaditem

class NacionalidadAdapter(val nacitem : List<Nacionalidaditem>): RecyclerView.Adapter<NacionalidadAdapter.NacionalidadHolder>() {

    inner class NacionalidadHolder(val binding: ItemNacionalidadBinding):RecyclerView.ViewHolder(binding.root) {

        fun bind(nac: Nacionalidaditem){
            with(binding){
                txtId.text = nac.idNacionalidad.toString()
                txtNombre.text = nac.nombre
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NacionalidadHolder {
        val binding = ItemNacionalidadBinding.inflate(LayoutInflater.from(parent.context),parent,false)

        return NacionalidadHolder(binding)
    }

    override fun onBindViewHolder(holder: NacionalidadHolder, position: Int) {
        holder.bind(nacitem[position])
    }

    override fun getItemCount(): Int = nacitem.size
}