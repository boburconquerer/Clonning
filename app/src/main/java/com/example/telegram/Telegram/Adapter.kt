package com.example.telegram.Telegram

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.telegram.R
import com.google.android.material.imageview.ShapeableImageView

class Adapter(var context: Context, var list: ArrayList<Model>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item1, parent, false)
        return viewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        var model: Model = list[position]
        if(holder is viewHolder){
            holder.image.setImageResource(model.image)
            holder.name.text = model.name
            holder.text.text = model.text
            holder.time.text = model.time
        }

    }

    inner class viewHolder(view: View): RecyclerView.ViewHolder(view){
        var image: ShapeableImageView = view.findViewById(R.id.image)
        var name: TextView = view.findViewById(R.id.name)
        var text: TextView = view.findViewById(R.id.text)
        var time: TextView = view.findViewById(R.id.time)
    }
}