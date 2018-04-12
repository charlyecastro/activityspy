package edu.washington.castroc.activityspy

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

   companion object {
       private val TAG = "MainActivity"
   }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.i(TAG,"onCreate is bithy!!" )
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onStart is working!!")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume is doing its job!")
    }

    override fun onDestroy() {
        super.onDestroy()
            Log.e(TAG, "were going down caption")
    }
}
