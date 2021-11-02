package com.example.lesson03.ui.profile

import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.lesson03.R

class ImagesProfileAdapter(val list:ArrayList<ImageProfileItem> ): RecyclerView.Adapter<ImagesProfileAdapter.MyViewHolder>() {
    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val image:ImageView = itemView.findViewById(R.id.image_list)
        val time:TextView = itemView.findViewById(R.id.time_list)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.image.setImageResource((list[position].image))
        holder.time.text = list[position].time
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}