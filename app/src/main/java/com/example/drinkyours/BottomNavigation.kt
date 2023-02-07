package com.example.drinkyours

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.drinkyours.databinding.ActivityBottomNavigationBinding

class BottomNavigation : AppCompatActivity() {
    lateinit var view:ActivityBottomNavigationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        view= ActivityBottomNavigationBinding.inflate(layoutInflater)
        setContentView(view.root)
        replaceFragment(HomeFragment())
        view.navigationViewId.setOnItemSelectedListener {
            when (it.itemId){
                R.id.home -> replaceFragment(HomeFragment())
//                R.id.search -> replaceFragment(SearchFragment())
                R.id.profile -> replaceFragment((ProfileFragment()))
                R.id.saved -> replaceFragment(SavedFragment())
                else -> {

                }

            }
            true
        }

    }

    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.framelayout, fragment)
        fragmentTransaction.commit()
    }
}
