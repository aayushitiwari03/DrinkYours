package com.example.drinkyours


import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley

@SuppressLint("MissingInflatedId")

class DrinksActivity : AppCompatActivity() {
    lateinit var cooldapter: ColldrinkAdapter
    var recycler: RecyclerView? = null
    var userList = arrayListOf<Colldrinkdataclass>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_drinks)

        recycler= findViewById(R.id.recyclerDrik_id)

        val url = "https://www.thecocktaildb.com/api/json/v1/1/filter.php?c=Cocktail"

        val reQueue: RequestQueue = Volley.newRequestQueue(this)
        val request = JsonObjectRequest(Request.Method.GET, url, null, { res ->
            Log.d("Volley sample", res.toString())

            val jsonArray = res.getJSONArray("drinks")
            for (i in 0 until jsonArray.length()) {
                val jsonobj = jsonArray.getJSONObject(i)
                Log.d("Volley Sample", jsonobj.toString())

                val drinks = Colldrinkdataclass(
                    jsonobj.getString("strDrink"),
                    jsonobj.getString("strDrinkThumb"),
                    jsonobj.getString("idDrink")
                )
                userList.add(drinks)
                Log.d("Volley sample", userList.toString())
            }
            recycler?.layoutManager = LinearLayoutManager(this)
            recycler?.adapter = ColldrinkAdapter(userList)

        }, { err ->
            Log.d("Fail", err.message.toString())
        })
        reQueue.add(request)

    }
}

