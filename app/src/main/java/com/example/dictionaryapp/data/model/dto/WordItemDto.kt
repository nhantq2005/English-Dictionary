package com.example.dictionaryapp.data.model.dto

data class WordItemDto(
    val meaningDtos: List<MeaningDto>?=null,
    val phoneticDtos: List<PhoneticDto>?=null,
    val sourceUrls: List<String>?=null,
    val word: String?=null
)