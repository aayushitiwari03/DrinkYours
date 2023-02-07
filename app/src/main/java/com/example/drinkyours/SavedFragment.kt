package com.example.drinkyours

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.android.volley.Request
import com.android.volley.toolbox.JsonArrayRequest
import com.android.volley.toolbox.Volley

class SavedFragment : Fragment() {

    var userList = arrayListOf<HomeUser>()
    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        val vijitha = inflater.inflate(R.layout.fragment_saved, container, false)
        val recycler = vijitha.findViewById<RecyclerView>(R.id.recycler_view)
        var image = vijitha.findViewById<ImageView>(R.id.drink_img)
//        var userList = arrayListOf<User>()

        val url = "https://api.punkapi.com/v2/beers?brewed_before=11-2012&abv_gt=6"
        val queue =  Volley.newRequestQueue(requireContext())
        val request = JsonArrayRequest(Request.Method.GET, url, null,
            { res ->
                Log.d("Volley sample", res.toString())



                image?.setOnClickListener {
                    val intent = Intent(requireContext(), ProfileFragment::class.java)
                    intent.putExtra("user_list", userList)
                    startActivity(intent)
                }
                val jsonArray = res.getJSONObject(0)
                Log.d("Volley sample", jsonArray.toString())
                for (i in 0 until jsonArray.length()) {
                    println(i)
                    val user = HomeUser(
                        jsonArray.getInt("id"), jsonArray.getString("name"), jsonArray.getString("tagline"), jsonArray.getString("first_brewed"), jsonArray.getString("description"),
                        jsonArray.getString("image_url"), jsonArray.getInt("abv"), jsonArray.getInt("ibu"), jsonArray.getInt("target_fg"), jsonArray.getInt("target_og"),
                        jsonArray.getInt("ebc"), jsonArray.getInt("srm"), jsonArray.getInt("ph"), jsonArray.getInt("attenuation_level"),
                    )
                    userList.add(user)
                    Log.d("Volley sample", userList.toString())
                }
                recycler?.layoutManager = LinearLayoutManager(requireContext())
                recycler?.adapter = UserAdapter(userList)

            }, { error ->
                Log.d("bear list is not succesful", error.message.toString())
            })
        queue.add(request)
        return vijitha
    }

    @SuppressLint("SuspiciousIndentation")
    fun onItemClick(item: HomeUser, position: Int) {
        Toast.makeText(requireContext(), item.id, Toast.LENGTH_SHORT).show()
        val intent = Intent(requireContext(), ProfileFragment::class.java)
        intent.putExtra("CARNAME", item.id)
        intent.putExtra("CARDESCRIPTION", item.name)
        intent.putExtra("CARLOGO", item.tagline)
        intent.putExtra("jk", item.image_url)
        startActivity(intent)

    }
}


