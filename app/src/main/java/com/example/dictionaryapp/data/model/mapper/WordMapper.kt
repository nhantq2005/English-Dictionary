package com.example.dictionaryapp.data.model.mapper

import com.example.dictionaryapp.data.model.dto.WordItemDto
import com.example.dictionaryapp.domain.model.WordItem

fun WordItemDto.toWordItem() = WordItem {
    word = word ?: "",
    phoneticDtos
}