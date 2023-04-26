package com.example.broadcastreceiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var btnLaunch:Button
    private var receiver:BroadcastReceiver? =  null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val filter = IntentFilter()
        filter.addAction(Intent.ACTION_AIRPLANE_MODE_CHANGED)

        receiver = object:BroadcastReceiver(){
            override fun onReceive(context: Context?, intent: Intent?) {
                Toast.makeText(context,intent?.action,Toast.LENGTH_SHORT).show()
            }
        }
        registerReceiver(receiver,filter)

//        btnLaunch = findViewById(R.id.btnLaunch)
//
//        btnLaunch.setOnClickListener {
//            sendBroadcast(Intent("MyReceiver"))
//        }

    }

    override fun onDestroy() {
        unregisterReceiver(receiver)
        super.onDestroy()
    }
}