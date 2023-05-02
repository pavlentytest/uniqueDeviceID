package com.example.myapplication

import android.Manifest.permission
import android.content.Context
import android.content.pm.PackageManager
import android.os.Build
import android.os.Bundle
import android.telephony.TelephonyManager
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import java.util.UUID


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getIMEIDeviceId()
    }

    fun getIMEIDeviceId(){
        val uniquePseudoID =
            "35" + Build.BOARD.length % 10 + Build.BRAND.length % 10 + Build.DEVICE.length % 10 + Build.DISPLAY.length % 10 + Build.HOST.length % 10 + Build.ID.length % 10 + Build.MANUFACTURER.length % 10 + Build.MODEL.length % 10 + Build.PRODUCT.length % 10 + Build.TAGS.length % 10 + Build.TYPE.length % 10 + Build.USER.length % 10
        val serial = Build.getRadioVersion()
        val uuid = UUID(uniquePseudoID.hashCode().toLong(), serial.hashCode().toLong()).toString()
        Log.d("RRRR", uuid)
        fun uniqueId():String = UUID.randomUUID().toString()
        Log.d("RRRR",uniqueId())

        //00000000-5bb8-31e8-0000-0000314dc9b2
        //00000000-724a-69e7-0000-0000714a4f37
    }
}