package com.example.ssl.t_mvvmtest.base

import com.example.ssl.t_mvvmtest.net.ApiService

open abstract class BaseRepository {
    fun unSubscribe() {

    }

    protected lateinit var apiService: ApiService;

    init {
        if (apiService == null) {
            apiService = ApiService()
        }
    }


}