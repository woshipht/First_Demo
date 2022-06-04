package com.example.pht_first_demo.Version_3

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.example.pht_first_demo.R
import com.example.pht_first_demo.Version_2.V2_Activity
import com.google.android.material.tabs.TabLayout

class V3_Activity : AppCompatActivity() {
    private val fragment = ArrayList<V3_Fragment>()
    private var adapter: V3_ViewPagerAdapter ?= null
    private var viewPager: ViewPager ?= null
    private var tabLayout: TabLayout ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.v3_activity)

        fragment.add(V3_Fragment(true,"最热榜"))
        fragment.add(V3_Fragment(false,"最新榜"))

        viewPager = findViewById(R.id.v3_viewPager)
        adapter = V3_ViewPagerAdapter(supportFragmentManager,fragment)
        viewPager?.adapter = adapter

        tabLayout = findViewById(R.id.v3_tabLayout)
        tabLayout?.setupWithViewPager(viewPager)
        tabLayout?.tabMode = TabLayout.MODE_FIXED
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId){
            R.id.Version_2 -> {
                val intent2 = Intent()
                intent2.setClass(this,V2_Activity::class.java)
                startActivity(intent2)
                finish()
                Toast.makeText(this,"Jump to Version2", Toast.LENGTH_SHORT).show()
            }
        }
        return true
    }
}
