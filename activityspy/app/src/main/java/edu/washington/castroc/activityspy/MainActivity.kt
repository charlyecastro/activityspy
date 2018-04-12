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
        Log.i(TAG, savedInstanceState.toString())
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onStart is working!!")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume is doing its job!")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "onStop event fired")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(TAG, "onRestart event fired")
    }

    override fun onDestroy() {
        super.onDestroy()
            Log.e(TAG, "were going down caption")
    }
}
