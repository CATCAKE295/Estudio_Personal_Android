package com.example.recyclerview2.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.recyclerview2.R
import com.example.recyclerview2.databinding.ItemSuperheroBinding
import com.example.recyclerview2.model.Superhero


class SuperAdapter(private val context: Context,
                   private val dataset: List<Superhero>
): RecyclerView.Adapter<SuperAdapter.SuperViewHolder>() {

    class SuperViewHolder(private val view: View): RecyclerView.ViewHolder(view){

        val binding = ItemSuperheroBinding.bind(view)

        val SN = binding.txtSuperName
        val RN = binding.txtRealName
        val P = binding.txtPublisher
        val IS = binding.ivImgSuperhero


        fun bind(SuperModel: Superhero ){

                SN.text = SuperModel.superHeroName
                RN.text = SuperModel.superHeroRealName
                P.text = SuperModel.superHeroPublisher
                Glide.with(IS.context).load(SuperModel.superHeroImg).into(IS)


        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.item_superhero,parent,false)
        return SuperViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: SuperViewHolder, position: Int) {
        val item = dataset[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int {
        return dataset.size
    }
}


