package com.example.mad_23012531056_pr_2

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    val TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        showMessage("onCreate method is called")
    }
    fun showMessage(msg:String){
        Log.i(TAG, "showMessage: $msg")
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()

    }
    override fun onRestart() {
        showMessage("onRestart method is called")
        super.onRestart()
    }
    override fun onPause() {
        showMessage("onPause method is called")
        super.onPause()
    }
    override fun onStop(){
        showMessage("OnStop method is called")
        super.onStop()
    }
    override fun onResume() {
        showMessage("OnResume method is called")
        super.onResume()
    }

    override fun onDestroy() {
        showMessage("OnDestroy method is called")
        super.onDestroy()
    }

}