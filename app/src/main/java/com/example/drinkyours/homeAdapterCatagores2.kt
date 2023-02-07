package com.example.drinkyours

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class homeAdapterCatagores2(private var lists:List<HomeDataCategeroes2>): RecyclerView.Adapter<homeAdapterCatagores2.ItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        var view= LayoutInflater.from(parent.context).inflate(R.layout.re3_item,parent,false)
        return ItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        var view=lists[position]
        holder.image.setImageResource(view.imgList)
        holder.text.text=view.textList
        holder.image1.setImageResource(view.imgs2List)
        holder.text1.text=view.text2List2
    }
    override fun getItemCount(): Int {
        return lists.size
    }
    class ItemViewHolder(view: View) : RecyclerView.ViewHolder(view){
        var image: ImageView =itemView.findViewById(R.id.imghome)
        var text: TextView =itemView.findViewById(R.id.txthre31)
        var image1: ImageView =itemView.findViewById(R.id.imghome2)
        var text1: TextView =itemView.findViewById(R.id.txthre3)
    }
}