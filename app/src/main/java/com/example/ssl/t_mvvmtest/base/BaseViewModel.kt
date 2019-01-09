package com.example.ssl.t_mvvmtest.base

import android.arch.lifecycle.ViewModel

import com.example.ssl.t_mvvmtest.utils.TUtil


open class BaseViewModel<T : BaseRepository> : ViewModel() {
      var mRepository: T?
 init {
     mRepository=TUtil.getInstance<T>(this)
 }
    override fun onCleared() {
        super.onCleared()
         mRepository?.run { mRepository?.unSubscribe() }
    }

}