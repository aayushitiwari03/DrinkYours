package com.example.drinkyours

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

//class UserAdapter {
//}



//class ListAdapter(private val mListener: (ListItemDataClass) -> Unit)

class UserAdapter(private val userList: ArrayList<HomeUser>)
    : RecyclerView.Adapter<UserAdapter.ViewHolder>() {
    private lateinit var context: Context


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val image_url = itemView.findViewById<ImageView>(R.id.drink_img)
        val name = itemView.findViewById<TextView>(R.id.txtdrink2)
        val id = itemView.findViewById<TextView>(R.id.txtdrink1)
        val tagline = itemView.findViewById<TextView>(R.id.txtdrink3)
        val first_brewed = itemView.findViewById<TextView>(R.id.txtdrink4)
        val description = itemView.findViewById<TextView>(R.id.txtdrink5)
        val abv = itemView.findViewById<TextView>(R.id.txtdrink6)
        val ibu = itemView.findViewById<TextView>(R.id.txtdrink7)
        val target_fg = itemView.findViewById<TextView>(R.id.txtdrink8)
        val  target_og= itemView.findViewById<TextView>(R.id.txtdrink9)
        val  ebc= itemView.findViewById<TextView>(R.id.txtdrink10)
        val srm = itemView.findViewById<TextView>(R.id.txtdrink11)
        val ph = itemView.findViewById<TextView>(R.id.txtdrink12)
        val  attenuation_level= itemView.findViewById<TextView>(R.id.txtdrink13)

        fun initialize(userList: HomeUser, action: OnCarItemClickListener) {
            name.text = userList.name
            description.text = userList.description
//            img.setImageResource(userList.strDrinkThumb)

            itemView.setOnClickListener() {
                action.onItemClick(userList, adapterPosition)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        context = parent.context
        val view = LayoutInflater.from(context).inflate(R.layout.items, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val user = userList[position]


        Glide.with(context).load(user.image_url).into(holder.image_url)
        holder.name.text = user.name
        holder.id.text= user.id.toString()
        holder.first_brewed.text = user.first_brewed
        holder.tagline.text = user.tagline
        holder.target_fg.text = user.target_fg.toString()
        holder.abv.text = user.abv.toString()
        holder.ibu.text = user.ibu.toString()
        holder.description.text = user.description
        holder.target_og.text = user.target_og.toString()
        holder.ebc.text = user.ebc.toString()
        holder.srm.text = user.srm.toString()
        holder.ph.text = user.ph.toString()
        holder.attenuation_level.text = user.attenuation_level.toString()

//        val item = getItem(position)

        holder.itemView.setOnClickListener {
//            user?.let { it1 -> mListener.invoke(it1) }
        }
//        holder.img.setImageResource(user.strDrinkThumb)
//
//        holder.initialize(userList.get(position), clickListener)
    }

    override fun getItemCount(): Int {
        return userList.size
    }
}

interface OnCarItemClickListener {
    fun onItemClick(item: HomeUser, position: Int)
}