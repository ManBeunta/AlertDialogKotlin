package com.project.juke.androidbasickotlin

import android.app.AlertDialog
import android.content.DialogInterface
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    public fun alertClick(view: View){
        AlertDialog.Builder(this)
                // Judul
                .setTitle("Alert Dialog Title")
                // Pesan yang di tamopilkan
                .setMessage("Pesan Alert Dialog")
                .setPositiveButton("Ya", DialogInterface.OnClickListener { dialogInterface, i ->
                    Toast.makeText(this, "Anda memilih tombol ya", Toast.LENGTH_LONG).show()
                })
                .setNegativeButton("No", DialogInterface.OnClickListener { dialogInterface, i ->
                    Toast.makeText(this, "Anda memilih tombol tidak", Toast.LENGTH_LONG).show()
                })
                .show()
    }
}
