package com.example.broadcastreceiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.net.ConnectivityManager
import android.widget.Toast

class MyReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        // This method is called when the BroadcastReceiver is receiving an Intent broadcast.
        if(Intent.ACTION_BOOT_COMPLETED.equals(intent.action)){
            Toast.makeText(context,"BOOT COMPLETED", Toast.LENGTH_SHORT).show()

        }else if(ConnectivityManager.CONNECTIVITY_ACTION.equals(intent.action)){
            Toast.makeText(context,"Connectivity Status Changed", Toast.LENGTH_SHORT).show()
        }
    }
}