package com.example.desafiocrizza

import android.app.Application
import com.example.desafiocrizza.di.repositoryModules
import com.example.desafiocrizza.di.viewModelModules
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class GitApplication: Application() {

    companion object{
        fun applicationContext() = GitApplication()
    }

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@GitApplication)
            modules(viewModelModules + repositoryModules)
        }
    }
}