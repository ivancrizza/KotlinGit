package com.example.desafiocrizza.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.desafiocrizza.R
import com.example.desafiocrizza.model.GitHubResponse

class GitHubAdapter(context: Context?) : RecyclerView.Adapter<GitHubAdapter.GitViewHolder>() {

    private var listOfRepos = listOf<GitHubResponse>()


    inner class GitViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val repoName = itemView.findViewById<TextView>(R.id.repository_name)
        val repoDescription = itemView.findViewById<TextView>(R.id.repository_description)
        val userImage = itemView.findViewById<ImageView>(R.id.user_image)
        val userName = itemView.findViewById<TextView>(R.id.user_name_text_view)
        val userFullname = itemView.findViewById<TextView>(R.id.user_name_surname)
        val numberOfVersions = itemView.findViewById<TextView>(R.id.numer_of_versions)
        val starRate = itemView.findViewById<TextView>(R.id.star_rate)

        fun bindView(item: GitHubResponse) {
            item.apply {
                repoName.text = name
                repoDescription.text = description
                userName.text = login
                userFullname.text = full_name
                starRate.text = stargazers_count.toString()
                numberOfVersions.text = forks_count.toString()
                Glide.with(itemView.context).load(owner.avatar_url)
                    .into(userImage)
            }

        }

    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): GitViewHolder {
        return GitViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.github_item, parent, false)
        )

    }

    override fun onBindViewHolder(holder: GitViewHolder, position: Int) =
        holder.bindView(listOfRepos[position])


    override fun getItemCount(): Int = listOfRepos.size

    fun setRepo(listOfRepos: List<GitHubResponse>) {
        this.listOfRepos = listOfRepos
        notifyDataSetChanged()
    }
}