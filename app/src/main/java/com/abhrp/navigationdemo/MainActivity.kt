package com.abhrp.navigationdemo

import android.net.Uri
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import com.abhrp.navigationdemo.dummy.DummyContent
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), FragmentOne.OnFragmentInteractionListener, ItemFragment.OnListFragmentInteractionListener {

    override fun onFragmentInteraction(uri: Uri) {

    }

    override fun onListFragmentInteraction(item: DummyContent.DummyItem?) {

    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navController = Navigation.findNavController(this, R.id.app_nav_fragment)
        val navHostFragment:NavHostFragment = supportFragmentManager.findFragmentById(R.id.app_nav_fragment) as NavHostFragment
        NavigationUI.setupWithNavController(navigation, navHostFragment.navController)
        navigation.setOnNavigationItemSelectedListener { item ->
            NavigationUI.onNavDestinationSelected(item, navController)
        }
    }
}
