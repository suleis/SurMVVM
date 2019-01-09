package com.example.ssl.t_mvvmtest.base

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle

import com.example.ssl.t_mvvmtest.utils.TUtil

abstract class AbsLifecycleFragment<T : BaseViewModel<*>> : BaseFragment() {
    protected var mViewModel: T? = null


    protected open fun initView() {
        mViewModel = ViewModelProviders.of(this).get(TUtil.getInstance<T>(this)!!::class.java)
    }

    protected abstract fun dataObserver()

    protected abstract fun getRemoteData()

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        initView()
        dataObserver()
    }
}


