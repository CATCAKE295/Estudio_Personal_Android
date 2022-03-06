package com.example.viewbinding2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.viewbinding2.databinding.ItemFeelListBinding

class Recycler_Adapter(private val list: List<String>) : RecyclerView.Adapter<Recycler_Adapter.ViewHolder>(){

    class ViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val binding = ItemFeelListBinding.bind(view)

        fun bind(feel: String){
            binding.txtFeel.text = feel
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)

        return ViewHolder(layoutInflater.inflate(R.layout.item_feel_list,parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item: String = list[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int {
        return list.size
    }
}