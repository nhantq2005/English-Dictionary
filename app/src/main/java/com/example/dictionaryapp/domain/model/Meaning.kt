package com.example.dictionaryapp.domain.model

data class Meaning(
    val antonyms: List<String>?=null,
    val definition: List<Definition>?=null,
    val partOfSpeech: String?=null,
    val synonyms: List<String>?=null
)