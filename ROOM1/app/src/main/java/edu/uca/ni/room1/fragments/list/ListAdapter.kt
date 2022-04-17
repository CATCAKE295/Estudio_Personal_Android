package edu.uca.ni.room1.fragments.list

import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import edu.uca.ni.room1.R
import edu.uca.ni.room1.data.User
import edu.uca.ni.room1.databinding.ItemListBinding

class ListAdapter: RecyclerView.Adapter<ListAdapter.ListViewHolder>() {


    private var userList = emptyList<User>()

    class ListViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        val binding = ItemListBinding.bind(itemView)

        val id = binding.txtId
        val nombre = binding.name
        val apellido = binding.lastName
        val edad = binding.age

        fun bind(users: User){

            id.text = users.id.toString()
            nombre.text = users.firstName
            apellido.text = users.lastName
            edad.text = users.age.toString()

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListAdapter.ListViewHolder {
        return ListViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent , false))
    }

    override fun onBindViewHolder(holder: ListAdapter.ListViewHolder, position: Int) {
        val item = userList[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    fun setData(user: List<User>){
        this.userList = user
        notifyDataSetChanged()

    }
}