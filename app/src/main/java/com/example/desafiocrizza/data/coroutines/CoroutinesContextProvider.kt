package com.example.desafiocrizza.data.coroutines

import kotlin.coroutines.CoroutineContext

interface CoroutinesContextProvider {
    val main: CoroutineContext
    val io: CoroutineContext
}