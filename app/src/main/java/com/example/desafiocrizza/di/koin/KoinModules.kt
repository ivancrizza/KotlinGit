package com.example.desafiocrizza.di

import android.content.Context
import com.example.desafiocrizza.di.koin.modules.repository.gitHubRepositoryModule
import com.example.desafiocrizza.di.koin.modules.viewmodel.gitHubModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

fun startKoin(context: Context){
    startKoin{
        androidContext(context)
        modules(viewModelModules + repositoryModules)
    }
}

val viewModelModules = listOf(
    gitHubModule
)

val repositoryModules = listOf(
    gitHubRepositoryModule
)
