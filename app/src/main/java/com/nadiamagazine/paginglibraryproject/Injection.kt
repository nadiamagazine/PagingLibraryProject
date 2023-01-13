package com.nadiamagazine.paginglibraryproject

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.savedstate.SavedStateRegistryOwner
import com.nadiamagazine.paginglibraryproject.data.ArticleRepository
import com.nadiamagazine.paginglibraryproject.ui.ViewModelFactory

/**
 * Class that handles object creation.
 * Like this, objects can be passed as parameters in the constructors and then replaced for
 * testing, where needed.
 */
object Injection {

    /**
     * Creates an instance of [ArticleRepository]
     */
    private fun provideArticleRepository(): ArticleRepository = ArticleRepository()

    /**
     * Provides the [ViewModelProvider.Factory] that is then used to get a reference to
     * [ViewModel] objects.
     */
    fun provideViewModelFactory(owner: SavedStateRegistryOwner): ViewModelProvider.Factory {
        return ViewModelFactory(owner, provideArticleRepository())
    }
}

