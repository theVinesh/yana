package app.vineshbuilds.news.home.repository

import androidx.lifecycle.LiveData
import app.vineshbuilds.news.home.viewmodel.ArticleVm

interface Source {
    fun refreshArticles(): LiveData<List<ArticleVm>?>
}
