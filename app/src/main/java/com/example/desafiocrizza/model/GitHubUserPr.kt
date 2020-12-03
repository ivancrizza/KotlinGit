package com.example.desafiocrizza.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class GitHubUserPr(
    val avatar_url: String
) : Parcelable
