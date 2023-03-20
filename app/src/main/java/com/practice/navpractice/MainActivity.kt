package com.practice.navpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.activity.OnBackPressedCallback
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.NavGraph
import androidx.navigation.fragment.findNavController
import com.practice.navpractice.databinding.ActivityMainBinding

val TAG = "NavPractice"

class MainActivity : AppCompatActivity() {
    lateinit var bd: ActivityMainBinding
    lateinit var navController: NavController
    var backTimestamp: Long = 0
    val backPressedCallback: OnBackPressedCallback = object : OnBackPressedCallback(false) {
        override fun handleOnBackPressed() {
            if (System.currentTimeMillis() - backTimestamp < 2000) {
                finish()
            } else {
                backTimestamp = System.currentTimeMillis()
                Toast.makeText(this@MainActivity, "在按一次返回退出", Toast.LENGTH_LONG).show()
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bd = DataBindingUtil.setContentView(this, R.layout.activity_main)
        navController =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment)!!.findNavController()
        navController.addOnDestinationChangedListener { controller, d, _ ->
            Log.e(TAG, "onCreate: addOnDestinationChangedListener\n$d current is FragmentA ${d.id==R.id.fragmentA}", )

            backPressedCallback.isEnabled = controller.backQueue.count { entry ->
                entry.destination !is NavGraph
            } <= 1
        }
        bd.goBtn.setOnClickListener {
            navController.navigate(MainNavDirections.actionGlobalFragmentB(System.currentTimeMillis()))
        }
        bd.backBtn.setOnClickListener {
            if (!navController.popBackStack()) {
                if (System.currentTimeMillis() - backTimestamp < 2000) {
                    finish()
                } else {
                    backTimestamp = System.currentTimeMillis()
                    Toast.makeText(this@MainActivity, "在按一次返回退出", Toast.LENGTH_LONG).show()
                }
            }
            Log.e(TAG, "onCreate: ${navController.popBackStack()}")
        }
        onBackPressedDispatcher.addCallback(this, backPressedCallback)
    }


}