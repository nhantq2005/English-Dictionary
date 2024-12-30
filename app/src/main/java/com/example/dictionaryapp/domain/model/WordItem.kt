package com.example.dictionaryapp.domain.model

data class WordItem(
    val meaning: List<Meaning>?=null,
    val phonetic: List<Phonetic>?=null,
    val sourceUrls: List<String>?=null,
    val word: String?=null
)