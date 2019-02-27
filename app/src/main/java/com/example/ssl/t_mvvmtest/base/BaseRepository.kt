package com.example.ssl.t_mvvmtest.base

import com.example.ssl.t_mvvmtest.net.ApiService

 abstract class BaseRepository {
    fun unSubscribe() {

    }
    protected val apiService: ApiService by lazy { ApiService() }


}