package com.example.ssl.t_mvvmtest.fragment


import android.arch.lifecycle.Observer
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.ssl.t_mvvmtest.R
import com.example.ssl.t_mvvmtest.base.AbsLifecycleFragment
import com.example.ssl.t_mvvmtest.viewModel.Articles
import com.ssl.generate.ArticlesViewModel


import kotlinx.android.synthetic.main.frag_main.*

class ArticleFragment : AbsLifecycleFragment<ArticlesViewModel>() {
    override fun initView() {
        super.initView()
        tvName.setOnClickListener {
            getRemoteData()
            mViewModel!!.mRepository!!.upload()
        }
    }

    override fun dataObserver() {
        mViewModel?.articlesLiveData!!.observe(this, Observer {
          tvName.setText(it!!.articleData)})
    }

    override fun getRemoteData() {
        mViewModel?.setArticlesValue(Articles().apply { articleData="surTest" })

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return View.inflate(activity, R.layout.frag_main, null)
    }
}