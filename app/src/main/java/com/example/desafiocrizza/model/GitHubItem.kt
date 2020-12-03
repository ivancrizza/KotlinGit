package com.example.desafiocrizza.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class GitHubItem(
    val page: Int,
    val item: List<GitHubResponse>,
) : Parcelable






