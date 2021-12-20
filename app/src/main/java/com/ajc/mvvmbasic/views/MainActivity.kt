package com.ajc.mvvmbasic.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.Observer
import com.ajc.mvvmbasic.R
import com.ajc.mvvmbasic.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {

    val viewModel = MainViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel.getDataFromRepository().observe(this, Observer {
            Toast.makeText(this, "$it", Toast.LENGTH_SHORT).show()
        })

    }
}


//echo "# MVVM-Basics" >> README.md
//git init
//git add README.md
//git commit -m "first commit"
//git branch -M main
//git remote add origin https://github.com/avadhutjc/MVVM-Basics.git
//git push -u origin main
//
//git remote add origin https://github.com/avadhutjc/MVVM-Basics.git
//git add *
//git commit -m "first commit"
//git push -u origin main