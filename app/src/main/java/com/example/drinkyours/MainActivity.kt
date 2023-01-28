package com.example.drinkyours

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.drinkyours.Fragments.HomeFragment
import com.example.drinkyours.Fragments.OrderFragment
import com.example.drinkyours.Fragments.ProfileFragment
import com.example.drinkyours.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var viewBinding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        replaceFragment(HomeFragment())

        viewBinding.navBar.setOnItemSelectedListener() {
            when(it.itemId){
                R.id.home -> replaceFragment(HomeFragment())
                R.id.order -> replaceFragment(OrderFragment())
                R.id.person -> replaceFragment(ProfileFragment())
                else -> {

                }
            }
            true
        }
    }
    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager=supportFragmentManager
        val fragmentTransaction=fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame,fragment)
        fragmentTransaction.commit()
    }

}
