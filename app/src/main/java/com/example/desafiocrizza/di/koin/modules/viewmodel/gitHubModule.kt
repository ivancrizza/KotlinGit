package com.example.desafiocrizza.di.koin.modules.viewmodel

import com.example.desafiocrizza.ui.gallery.GitHubViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module


val gitHubModule = module {
    viewModel { GitHubViewModel(get()) }
}
