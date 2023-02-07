package com.example.drinkyours

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.VideoView
import androidx.recyclerview.widget.RecyclerView
//import com.cybershark.foodflix.R
//import kotlinx.androidx.synthetic.main.faq_item.view.*

class FaqAdapter(val context: Context,private val menuList:ArrayList<Pair<String,String>>):RecyclerView.Adapter<FaqAdapter.FaqViewHolder>() {
    class FaqViewHolder(itemView: View):RecyclerView. ViewHolder(itemView){
        val tvFaqQuestions:TextView=itemView.findViewById(R.id.tvFaqQuestion)
        val tvFaqAnswers:TextView=itemView.findViewById(R.id.tvFaqAnswer)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FaqViewHolder {
        return FaqViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.faq_item,parent,false))
    }

    override fun getItemCount(): Int {
        return menuList.size
    }

    override fun onBindViewHolder(holder: FaqViewHolder, position: Int) {
        holder.tvFaqAnswers.text=menuList[position].second
        holder.tvFaqQuestions.text=menuList[position].first
    }
}