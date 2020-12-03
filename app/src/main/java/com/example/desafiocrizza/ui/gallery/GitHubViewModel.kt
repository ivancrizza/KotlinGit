package com.example.desafiocrizza.ui.gallery

import androidx.lifecycle.MutableLiveData
import com.example.desafiocrizza.data.BaseActViewModel
import com.example.desafiocrizza.model.GitHubItem
import com.example.desafiocrizza.model.GitHubResponse
import com.example.desafiocrizza.data.repository.GitHubRepository
import kotlinx.coroutines.launch

class GitHubViewModel(
    private val repository: GitHubRepository,
    private val response: GitHubItem
) : BaseActViewModel() {

    sealed class RepoState {
        data class Success(val response: GitHubResponse) : RepoState()
        data class Error(val error: Throwable) : RepoState()
        object Loading : RepoState()
    }

    val repoState = MutableLiveData<RepoState>()
    val page: Int = 0
    fun getAllRepo() {

        launch {
            repoState.postValue(RepoState.Loading)

            try {
                val repoResponse = repository.getRepoList(page)
                repoState.postValue(RepoState.Success(repoResponse))
            } catch (error: Throwable){
                repoState.postValue(RepoState.Error(error))
            }
        }

    }

}
