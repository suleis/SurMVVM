package com.example.ssl.t_mvvmtest.viewModel;

import com.example.ssl.t_mvvmtest.repository.ArticleRepository;
import com.ssl.annotation.LiveData;
import com.ssl.annotation.ViewModel;

@LiveData
@ViewModel(superClass = ArticleRepository.class)
public class Articles {
    public String articleData = "31312312";
}
