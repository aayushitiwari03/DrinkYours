package com.example.drinkyours

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.constants.ActionTypes
import com.denzcoskun.imageslider.interfaces.ItemChangeListener
import com.denzcoskun.imageslider.interfaces.ItemClickListener
import com.denzcoskun.imageslider.interfaces.TouchListener
import com.denzcoskun.imageslider.models.SlideModel

class HomeFragment : Fragment() {
    private lateinit var itemList2Adapter: ItemList2Adapter
    private lateinit var list: ArrayList<item2ScroollDataClass>

    private lateinit var adapterCatagores: homeAdapterCatagores
    private lateinit var adapterCatagoresSecond: homeAdapterCatagores2
    private lateinit var list2: ArrayList<HomeDataCatageroes>
    private lateinit var list3: ArrayList<HomeDataCategeroes2>
//    var itemClickListener: ItemClickListener? = null

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var vijitha = inflater.inflate(R.layout.fragment_home, container, false)
        val recyclerView = vijitha.findViewById<RecyclerView>(R.id.main_recycler_id)
        val recyclerView2 = vijitha.findViewById<RecyclerView>(R.id.recycler2_id)
        val recyclerView3 = vijitha.findViewById<RecyclerView>(R.id.recycler3_id)

//        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager =
            LinearLayoutManager(requireContext(), RecyclerView.HORIZONTAL, false)
        recyclerView2.layoutManager =
            LinearLayoutManager(requireContext(), RecyclerView.VERTICAL, false)
        recyclerView3.layoutManager =
            LinearLayoutManager(requireContext(), RecyclerView.VERTICAL, false)

        list = ArrayList()
        itemList2Adapter = ItemList2Adapter(list)
        recyclerView.adapter = itemList2Adapter
        list.add(item2ScroollDataClass(R.drawable.ic_peg, "drink"))
        list.add(item2ScroollDataClass(R.drawable.glass_ic, "drinks"))
        list.add(item2ScroollDataClass(R.drawable.glasses_ic, "cool drinks"))
        list.add(item2ScroollDataClass(R.drawable.ice_ic, "drink"))
        list.add(item2ScroollDataClass(R.drawable.glasses_ic_imgs, "drinks"))
        list.add(item2ScroollDataClass(R.drawable.glases5_ic, "cooldrinks"))
        list.add(item2ScroollDataClass(R.drawable.drink_ic, "drinks"))
        list.add(item2ScroollDataClass(R.drawable.beeer, "drinks"))
        list.add(item2ScroollDataClass(R.drawable.icecu_img, "cool drinks"))
        list.add(item2ScroollDataClass(R.drawable.ice_img, "drinks"))
        list.add(item2ScroollDataClass(R.drawable.ic_peg, "drinks"))
        list.add(item2ScroollDataClass(R.drawable.glass_ic, "drinks"))
        list.add(item2ScroollDataClass(R.drawable.glasses_ic, "drinks"))
        list.add(item2ScroollDataClass(R.drawable.colorful, "drinks"))


        list2 = ArrayList()
        adapterCatagores = homeAdapterCatagores(list2)
        recyclerView2.adapter = adapterCatagores
        list2.add(HomeDataCatageroes(R.drawable.ice_ic, "Drink", R.drawable.glasses_ic, "Ice creme"))
        list2.add(HomeDataCatageroes(R.drawable.ic_peg, "Beer", R.drawable.beeer, "Votka"))
        list2.add(HomeDataCatageroes(R.drawable.glasses_ic_imgs,
            "Beers",
            R.drawable.drink_ic,
            "share beer"))


        list3 = ArrayList()
        adapterCatagoresSecond = homeAdapterCatagores2(list3)
        recyclerView3.adapter = adapterCatagoresSecond
        list3.add(HomeDataCategeroes2(R.drawable.glass_ic,
            "Sun rice drink",
            R.drawable.drinkk,
            "Colorful drink"))
        list3.add(HomeDataCategeroes2(R.drawable.beer_ic_img,
            "Beatiful drinks",
            R.drawable.laduu,
            "Ice-cubes drink"))
        list3.add(HomeDataCategeroes2(R.drawable.ice_img,
            "Ice creme",
            R.drawable.drinks,
            "Total drinks"))

        val imageSlider = vijitha.findViewById<ImageSlider>(R.id.image_slider)
        // init imageSlider

        val imageList = ArrayList<SlideModel>() // Create image list
        imageList.add(SlideModel(R.drawable.bear1))
        imageList.add(SlideModel(R.drawable.bear2))
        imageList.add(SlideModel(R.drawable.bear3))
        imageList.add(SlideModel(R.drawable.bear4))
        imageList.add(SlideModel(R.drawable.bear5))
        imageList.add(SlideModel(R.drawable.bear5))

        imageSlider.setImageList(imageList)

        imageSlider.setItemClickListener(object : ItemClickListener {
            override fun onItemSelected(position: Int) {
            }
        })

        imageSlider.setItemChangeListener(object : ItemChangeListener {
            override fun onItemChanged(position: Int) {
            }
        })

        imageSlider.setTouchListener(object : TouchListener {
            override fun onTouched(touched: ActionTypes) {
                if (touched == ActionTypes.DOWN) {
                    imageSlider.stopSliding()
                } else if (touched == ActionTypes.UP) {
                    imageSlider.startSliding(1000)
                }
            }
        })
        return vijitha
    }
}




