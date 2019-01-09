package com.example.ssl.t_mvvmtest.base

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import com.example.ssl.t_mvvmtest.utils.TUtil

abstract class AbsLifecycleActivity<T : BaseViewModel<*>> : BaseActivity() {
    protected var mViewModel: T? = null


    protected open fun initView() {
        mViewModel = ViewModelProviders.of(this).get(TUtil.getInstance<T>(this)!!::class.java)
    }

    protected abstract fun dataObserver()

    protected abstract fun getRemoteData()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initView()
        dataObserver()

    }
}