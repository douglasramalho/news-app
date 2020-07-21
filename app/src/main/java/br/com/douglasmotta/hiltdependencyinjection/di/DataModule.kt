package br.com.douglasmotta.hiltdependencyinjection.di

import br.com.douglasmotta.hiltdependencyinjection.data.repository.*
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
abstract class DataModule {

    @Singleton
    @Binds
    abstract fun bindNewsRepository(
        newsRepository: NewsRepository
    ): NewsRepositoryInterface

    @Singleton
    @Binds
    abstract fun bindApiDataSource(
        apiDataSource: NewsFANApiDataSource
    ): NewsApiDataSource
}