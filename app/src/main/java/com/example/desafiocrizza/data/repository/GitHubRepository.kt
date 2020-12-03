package com.example.desafiocrizza.data.repository

import com.example.desafiocrizza.data.api.APIGitHub
import com.example.desafiocrizza.data.coroutines.AppContextProvider
import com.example.desafiocrizza.model.GitHubResponse
import kotlinx.coroutines.withContext


class GitHubRepository(private val apiGitHub: APIGitHub) {

    suspend fun getRepoList(page: Int): GitHubResponse =
        withContext(AppContextProvider.io) {
            apiGitHub.getListRepo(page)

        }


    suspend fun getPrList(user: String, repo: String, page: Int): GitHubResponse =
        withContext(AppContextProvider.io) {
            apiGitHub.getListPr(user, repo, page)
        }
}
