package com.example.dictionaryapp.data.model.dto

data class MeaningDto(
    val antonyms: List<String>?=null,
    val definitionDtos: List<DefinitionDto>?=null,
    val partOfSpeech: String?=null,
    val synonyms: List<String>?=null
)