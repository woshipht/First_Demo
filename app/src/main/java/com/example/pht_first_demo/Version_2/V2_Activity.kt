package com.example.pht_first_demo.Version_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.example.pht_first_demo.R
import com.example.pht_first_demo.Version_3.V3_Activity

class V2_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.v2_activity)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId){
            R.id.Version_3 -> {
                val intent3 = Intent()
                intent3.setClass(this, V3_Activity::class.java)
                startActivity(intent3)
                finish()
                Toast.makeText(this,"Jump to Version3",Toast.LENGTH_SHORT).show()
            }
        }
        return true
    }
}