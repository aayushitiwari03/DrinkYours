package com.example.drinkyours

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class ProfileFragment : Fragment() {

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        var vijitha= inflater.inflate(R.layout.fragment_profile, container, false)
        var vijii=vijitha.findViewById<TextView>(R.id.txtprofile)
        var ok =vijitha.findViewById<TextView>(R.id.txtok)
        var account=vijitha.findViewById<TextView>(R.id.txtyour_acount)
        var order=vijitha.findViewById<TextView>(R.id.txtyour_order)
        var address=vijitha.findViewById<Button>(R.id.etsave)
        var drink=vijitha.findViewById<TextView>(R.id.txttxtdrink)
        vijii.setOnClickListener() {
            startActivity(Intent(requireContext(), FaqActivity::class.java))
        }
        ok.setOnClickListener(){
            startActivity(Intent(requireContext(),OrderActivity2::class.java))
        }
        drink.setOnClickListener(){
            startActivity(Intent(requireContext(),DrinksActivity::class.java))
        }
        account.setOnClickListener(){
            startActivity(Intent(requireContext(),Signuppage::class.java))
        }
        order.setOnClickListener(){
            startActivity(Intent(requireContext(),OrderActivity2::class.java))
        }
        address.setOnClickListener(){
            Toast.makeText(requireContext(), "Your address is save", Toast.LENGTH_SHORT).show()
//            startActivity(Intent(requireContext(),HomeFragment::class.java))
        }
        return vijitha

    }
}
























//        val v = inflater.inflate(R.layout.fragment_profile, container, false)
//
////        val imageSlider = v.findViewById<ImageSlider>(R.id.image_slider) // init imageSlider
////
////        val imageList = ArrayList<SlideModel>() // Create image list
////        imageList.add(SlideModel(R.drawable.bear3))
////        imageList.add(SlideModel(R.drawable.bear1))
////        imageList.add(SlideModel(R.drawable.bear2))
////        imageList.add(SlideModel(R.drawable.bear4))
////        imageList.add(SlideModel(R.drawable.bear5))
////        imageList.add(SlideModel(R.drawable.bear6))
////
////        imageSlider.setImageList(imageList, ImageView.ScaleType.FIT_CENTER)
//        return v
//
//    }
//}