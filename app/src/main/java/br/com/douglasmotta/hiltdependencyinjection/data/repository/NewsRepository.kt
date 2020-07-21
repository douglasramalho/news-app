package br.com.douglasmotta.hiltdependencyinjection.data.repository

import android.content.Context
import br.com.douglasmotta.hiltdependencyinjection.data.model.NewsResult

class NewsRepository(
    private val context: Context,
    private val newsDbDataSource: NewsDbDataSource,
    private val newsApiDataSource: NewsApiDataSource
) : NewsRepositoryInterface {

    override suspend fun getNews(): NewsResult {
        return newsApiDataSource.fetchNews()
    }
}