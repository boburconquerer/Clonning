package com.example.telegram

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView



class Adapter(var context: Context, val list: ArrayList<User>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
       if (viewType == HEADER){
           var view = LayoutInflater.from(parent.context).inflate(R.layout.item3, parent, false)
           return HeaderViewHolder(view)
       }
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item2, parent, false)
        return footerViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        var user: User = list[position]
        if (holder is footerViewHolder){
            holder.image.setImageResource(user.image)
            holder.name.text =  user.name
            holder.text.text = user.text
        }
    }
    inner class HeaderViewHolder(view: View): RecyclerView.ViewHolder(view){}
    inner class footerViewHolder(view: View): RecyclerView.ViewHolder(view){
        var image: ShapeableImageView = view.findViewById(R.id.image)
        var name: TextView = view.findViewById(R.id.name)
        var text:TextView= view.findViewById(R.id.text)
    }
    companion object{
        var HEADER = 0
        var FOOTER = 1
    }

    override fun getItemViewType(position: Int): Int{
        if (isHeader(position)) return HEADER
        return FOOTER
    }

    private fun isHeader(position: Int): Boolean {
        return position==0
    }


}