package com.bakeysfitnesshelper.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.recyclerview.widget.GridLayoutManager
import com.bakeysfitnesshelper.app.adapterbekfit.BakeysAdapter
import com.bakeysfitnesshelper.app.databinding.ActivityMainBinding
import com.bakeysfitnesshelper.app.utilsbakey.BakeysManager
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    private lateinit var binding : ActivityMainBinding
    private var adapter : BakeysAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initDrawerMenu()
        initAdapter()
    }

    private fun initAdapter() =with(binding){
        adapter = BakeysAdapter(BakeysManager.listAllFit,this@MainActivity)
        mainContent.rcFitView.layoutManager = GridLayoutManager(this@MainActivity,2)
        mainContent.rcFitView.adapter = adapter
    }

    private fun initDrawerMenu() = with(binding){
        val toggle = ActionBarDrawerToggle(
            this@MainActivity,drawerLayout,mainContent.toolbar,R.string.open_draw,R.string.close_draw
        )
        drawerLayout.addDrawerListener(toggle)
        navView.setNavigationItemSelectedListener(this@MainActivity)
        toggle.syncState()


    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.vid_id -> {
                adapter = BakeysAdapter(BakeysManager.listVidTraining,this@MainActivity)
                binding.mainContent.rcFitView.adapter = adapter
                binding.mainContent.toolbar.title = getString(R.string.vid_fintess_dr_title)
            }
            R.id.type_id -> {
                adapter = BakeysAdapter(BakeysManager.listTypeTraining,this@MainActivity)
                binding.mainContent.rcFitView.adapter = adapter
                binding.mainContent.toolbar.title = getString(R.string.type_fintess_dr_title)
            }
            R.id.ex_id -> {
                adapter = BakeysAdapter(BakeysManager.listExercises,this@MainActivity)
                binding.mainContent.rcFitView.adapter = adapter
                binding.mainContent.toolbar.title = getString(R.string.exercise_dr_title)
            }
            R.id.all_id -> {
                adapter = BakeysAdapter(BakeysManager.listAllFit,this@MainActivity)
                binding.mainContent.rcFitView.adapter = adapter
                binding.mainContent.toolbar.title = getString(R.string.all)
            }
        }
        binding.drawerLayout.closeDrawer(GravityCompat.START)
        return true
    }
}