package com.nadiamagazine.paginglibraryproject.ui

import androidx.recyclerview.widget.RecyclerView
import com.nadiamagazine.paginglibraryproject.data.Article
import com.nadiamagazine.paginglibraryproject.data.createdText
import com.nadiamagazine.paginglibraryproject.databinding.ArticleViewholderBinding

/**
 * View Holder for a [Article] RecyclerView list item.
 */
class ArticleViewHolder(
    private val binding: ArticleViewholderBinding
) : RecyclerView.ViewHolder(binding.root) {

    fun bind(article: Article) {
        binding.apply {
            binding.title.text = article.title
            binding.description.text = article.description
            binding.created.text = article.createdText
        }
    }
}

