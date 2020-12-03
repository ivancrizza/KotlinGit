package com.example.desafiocrizza.data.api

import com.example.desafiocrizza.model.GitHubResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface APIGitHub {

    companion object {
        const val BASE_URL = "https://api.github.com"
    }

    @GET("search/repositories?q=language:Java&sort=stars")
    suspend fun getListRepo(
        @Query("page") page: Int
    ): GitHubResponse

    @GET("repos/{user}/{repository}/pulls")
    suspend fun getListPr(
        @Path("user") user: String,
        @Path("repository") repository: String,
        @Query("page") page: Int
    ): GitHubResponse
}