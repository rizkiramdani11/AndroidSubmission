package com.programmer.Toolbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Atur toolbar sebagai support action bar
        setSupportActionBar(toolbar)

        //Setting toolbar
        supportActionBar?.apply {
            title = "Toolbar"
            subtitle = "Rizki"

            setDisplayShowCustomEnabled(true)
            setLogo(R.drawable.ic_launche_pn)
            setDisplayUseLogoEnabled(true)

        }
    }

    //Setting menu action bar
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.toolbar_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    //Aksi ketika menu item di klik
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        var itemClicked: String =""

        when(item.itemId){
            R.id.action_cut ->{
                itemClicked = "Cut Clicked"
            }
            R.id.action_copy->{
                itemClicked = "copy Clicked"
            }
            R.id.action_new->{
                itemClicked = "New Clicked"
            }
            R.id.action_paste->{
                itemClicked = "Paste Clicked"
            }
        }

        //Buat Snackbar sebagai aksi
        Snackbar.make(root_layout, itemClicked, Snackbar.LENGTH_LONG)//.setTextColor(Color.parseColor("#f78f23"))
            .setAction("Action", null).show()

        return super.onOptionsItemSelected(item)
    }
}