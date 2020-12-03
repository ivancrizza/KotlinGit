package com.example.desafiocrizza.model

import android.os.Parcelable
import java.util.Date
import kotlinx.parcelize.Parcelize

@Parcelize
data class GitHubPr(
    val title: String,
    val user: GitHubUserPr,
    val body: String,
    val created_at: Date
) : Parcelable
