package com.example.lesson03.ui.home

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton
import androidx.recyclerview.widget.RecyclerView
import com.example.lesson03.R

class StatesRecyclerAdapter (var list:ArrayList<StatesItem>, var context: Context):
    RecyclerView.Adapter<StatesRecyclerAdapter.MyViewHolder>() {
    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        val state_image: ImageView = itemView.findViewById(R.id.state_image)
        val stateText: TextView = itemView.findViewById(R.id.state_text)
        val stateText2: TextView = itemView.findViewById(R.id.state_text2)
        //val stateButton: AppCompatButton = itemView.findViewById(R.id.state_button)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val root = LayoutInflater.from(context).inflate(R.layout.state_recycler_item,parent,false)
        return MyViewHolder(root)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.state_image.setImageResource(list.get(position).state_image)
        holder.stateText.text = list[position].state_text}
        //holder.stateText2.text = list.get(position).state_text2}

    override fun getItemCount(): Int {
        return list.size
    }
}