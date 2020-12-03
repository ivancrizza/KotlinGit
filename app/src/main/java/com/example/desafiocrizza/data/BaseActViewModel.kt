package com.example.desafiocrizza.data

import androidx.lifecycle.ViewModel
import com.example.desafiocrizza.data.coroutines.AppContextProvider
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlin.coroutines.CoroutineContext

abstract class BaseActViewModel : ViewModel(), CoroutineScope {
    private val job = Job()
    override val coroutineContext: CoroutineContext by lazy { job + AppContextProvider.io }

    override fun onCleared() {
        job.cancel()
        super.onCleared()
    }
}