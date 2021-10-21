package com.example.lesson03.ui.home

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.lesson03.R
import java.security.AccessControlContext

class FeelingsRecylcerAdapter(val list:ArrayList<FeelingsItem>, val context:Context): RecyclerView.Adapter<FeelingsRecylcerAdapter.MyViewHolder>() {
    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val image:ImageView = itemView.findViewById(R.id.feelings_image)
        val feelingsText:TextView = itemView.findViewById(R.id.feelings_text)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val root = LayoutInflater.from(context).inflate(R.layout.feeling_recycler_item,parent,true)
        return MyViewHolder(root)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.image.setImageResource(list[position].image)
        holder.feelingsText.text = list[position].text

    }

    override fun getItemCount(): Int {
        return list.size
    }

}