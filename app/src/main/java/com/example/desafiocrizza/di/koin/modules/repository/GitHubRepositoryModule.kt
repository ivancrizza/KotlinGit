package com.example.desafiocrizza.di.koin.modules.repository

import com.example.desafiocrizza.data.repository.GitHubRepository
import org.koin.dsl.module

val gitHubRepositoryModule = module {
    factory { GitHubRepository(get()) }
}