package com.lcorozco10.tvg

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.view.View
import android.widget.Button
import android.widget.Toast

class AlertDialog : AppCompatActivity(), View.OnClickListener {

    lateinit var openDialogButton:Button
    lateinit var alertDialogBuilder: AlertDialog.Builder
    lateinit var alertDialog:AlertDialog


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alert_dialog)

        alertDialogBuilder = AlertDialog.Builder(this)
        alertDialogBuilder.setTitle("Bad Alert XD.")
        alertDialogBuilder.setMessage("Are you ok?")
        alertDialogBuilder.setPositiveButton("Yes"){ dialogInterface, i ->
            Toast.makeText(this,"Ok.",Toast.LENGTH_SHORT).show()
        }
        alertDialogBuilder.setNegativeButton("No"){dialogInterface, i ->
            Toast.makeText(this,"Nop.",Toast.LENGTH_SHORT).show()
        }

        //alertDialogBuilder.setCancelable(false)
        alertDialogBuilder.setOnCancelListener { dialogInterface ->
            Toast.makeText(this,"Cancel.",Toast.LENGTH_SHORT).show()
        }

        alertDialog = alertDialogBuilder.create()
        openDialogButton = findViewById(R.id.openDialogButton)
        openDialogButton.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        when {
            p0?.id == R.id.openDialogButton->{
                alertDialog.show()
            }
        }
    }
}