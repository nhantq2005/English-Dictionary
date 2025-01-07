package com.example.dictionaryapp.domain.model

data class WordItem(
    val meanings: List<Meaning>?=null,
    val phonetics: List<Phonetic>?=null,
    val word: String?=null
)