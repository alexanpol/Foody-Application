package com.example.foodrecipes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentContainerView
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.navigation.ui.AppBarConfiguration as AppBarConfiguration

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val containerView: FragmentContainerView
//        val recipeFragment = RecipesFragment()
//        val jokeFragment = jokesFragment()
//        val favoriteFragment = favoritesFragment()



        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        val navController = navHostFragment.navController

        var appBarConfiguration:AppBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.recipesFragment,
                R.id.favoritesFragment,
                R.id.jokesFragment


            )
        )



        val bottomNavView: BottomNavigationView = findViewById(R.id.bottomMenu1)
        bottomNavView.setupWithNavController(navController)

        setupActionBarWithNavController(navController, appBarConfiguration)
    }
}

