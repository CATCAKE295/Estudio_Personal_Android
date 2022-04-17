package edu.uca.ni.pelicula.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import edu.uca.ni.pelicula.databinding.ItemPeliculaBinding
import edu.uca.ni.pelicula.models.Peliculaitem

class PeliculaAdapter(val peliculaitem: List<Peliculaitem>):RecyclerView.Adapter<PeliculaAdapter.PeliculaHolder>() {


    inner class PeliculaHolder(val binding: ItemPeliculaBinding):RecyclerView.ViewHolder(binding.root) {

        fun bind(pelicula: Peliculaitem){
            with(binding){
                txtId.text = pelicula.idPelicula.toString()
                txtTitulo.text = pelicula.titulo
                txtTmetraje.text = pelicula.tipoMetraje
                txtClasificaccion.text = pelicula.clasificacion.toString()
                txtNacionalidad.text = pelicula.nacionalidad.toString()
                txtDuracion.text = pelicula.duracion
                txtDuracion.text = pelicula.sinopsis
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PeliculaHolder {
        val binding = ItemPeliculaBinding.inflate(LayoutInflater.from(parent.context),parent,false)

        return PeliculaHolder(binding)
    }

    override fun onBindViewHolder(holder: PeliculaHolder, position: Int) {
        holder.bind(peliculaitem[position])
    }

    override fun getItemCount(): Int = peliculaitem.size
}