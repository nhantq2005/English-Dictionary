package com.example.dictionaryapp.feature_dictionary.presentation

import com.example.dictionaryapp.domain.model.WordItem

data class DictionaryState(
    val isLoading: Boolean = false,
    val searchWord: String = "",
    val wordItem: WordItem? = null

)