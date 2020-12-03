package com.example.desafiocrizza.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class GitHubResponse(
    val id: Int,
    val name: String,
    val full_name: String,
    val login: String,
    val owner: GitHubOwner,
    val description: String,
    val pulls_url: GitHubPr,
    val stargazers_count: Int,
    val forks_count: Int
) : Parcelable