package com.example.ssl.t_mvvmtest.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.ssl.t_mvvmtest.R
import com.example.ssl.t_mvvmtest.fragment.ArticleFragment


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction().add(R.id.frame, ArticleFragment()).commitAllowingStateLoss()
    }
}
