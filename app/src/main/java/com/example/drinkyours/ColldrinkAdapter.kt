package com.example.drinkyours

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide


class ColldrinkAdapter(private val userList: ArrayList<Colldrinkdataclass>) : RecyclerView.Adapter<ColldrinkAdapter.ViewHolder>() {
    private lateinit var context: Context

//    var onItemClick:((User) ->Unit)?=null

    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val img=itemView.findViewById<ImageView>(R.id.img_name)
        val name=itemView.findViewById<TextView>(R.id.txt_name)
        val id=itemView.findViewById<TextView>(R.id.txt_id_name)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        context=parent.context
        val view=LayoutInflater.from(context).inflate(R.layout.items,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val user=userList[position]

        Glide.with(context).load(user.strDrinkThumb).into(holder.img)
        holder.name.text=user.strDrink+user.idDrink
        holder.id.text=user.idDrink

//        holder.itemView.setOnClickListener(){
//            onItemClick?.invoke(user)
//        }
    }

    override fun getItemCount(): Int {
        return userList.size
    }
}
