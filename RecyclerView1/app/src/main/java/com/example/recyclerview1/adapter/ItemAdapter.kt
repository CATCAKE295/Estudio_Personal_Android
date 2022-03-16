package com.example.recyclerview1.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview1.R
import com.example.recyclerview1.databinding.ListItemBinding
import com.example.recyclerview1.model.Afirmacion

class ItemAdapter(
    private val context: Context, private val dataset: List<Afirmacion>
    ) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {

        val binding = ListItemBinding.bind(view)

        fun bind(afi: String){
            binding.itemTitle.text = afi
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent,false)

        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.bind(context.resources.getString(item.stringResourceId))
    }

    override fun getItemCount(): Int {
        return dataset.size
    }

}