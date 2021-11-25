package com.cookandroid.edit

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class list_item_adapter (val list_item: ArrayList<list_item>) : RecyclerView.Adapter<list_item_adapter.CustomViewHolder>() {

    override fun onCreateViewHolder( parent: ViewGroup, viewType: Int
    ): list_item_adapter.CustomViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return CustomViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list_item.size
    }

    override fun onBindViewHolder(holder: list_item_adapter.CustomViewHolder, position: Int) {
        holder.title.text = list_item.get(position).title
        holder.num.text = list_item.get(position).num
        holder.date.text = list_item.get(position).date

    }

    class CustomViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val title = itemView.findViewById<TextView>(R.id.title)
        val num = itemView.findViewById<TextView>(R.id.num)
        val date = itemView.findViewById<TextView>(R.id.date)
    }
}

