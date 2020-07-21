package br.com.douglasmotta.hiltdependencyinjection.data

import br.com.douglasmotta.hiltdependencyinjection.data.model.ErrorResponse
import br.com.douglasmotta.hiltdependencyinjection.data.model.NewsResponse
import com.haroldadmin.cnradapter.NetworkResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsApiClient {

    @GET("top-headlines?country=br")
    suspend fun getNews(
        @Query("category") category: String = "technology",
        @Query("apiKey") apiKey: String = "0a0bfb59fa05442983eea798d8f34e55"
    ): NetworkResponse<NewsResponse, ErrorResponse>
}