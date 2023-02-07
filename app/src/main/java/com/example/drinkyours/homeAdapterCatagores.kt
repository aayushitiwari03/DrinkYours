package com.example.drinkyours

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class homeAdapterCatagores(private var lists:List<HomeDataCatageroes>): RecyclerView.Adapter<homeAdapterCatagores.ItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        var view= LayoutInflater.from(parent.context).inflate(R.layout.rv_item2,parent,false)
        return ItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        var item2Scrooll=lists[position]
        holder.img.setImageResource(item2Scrooll.images)
        holder.txt.text=item2Scrooll.textbeer2
        holder.img2.setImageResource(item2Scrooll.images2)
        holder.txt2.text=item2Scrooll.textbeer
    }

    override fun getItemCount(): Int {
        return lists.size
    }

    class ItemViewHolder(view: View) : RecyclerView.ViewHolder(view){
        var img: ImageView =itemView.findViewById(R.id.img1_id)
        var txt: TextView =itemView.findViewById(R.id.txt1_id)
        var img2: ImageView =itemView.findViewById(R.id.img2_id)
        var txt2: TextView =itemView.findViewById(R.id.txt2_id)
    }

}