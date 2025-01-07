package com.example.dictionaryapp.data.model.mapper

import com.example.dictionaryapp.data.model.dto.DefinitionDto
import com.example.dictionaryapp.data.model.dto.MeaningDto
import com.example.dictionaryapp.data.model.dto.PhoneticDto
import com.example.dictionaryapp.data.model.dto.WordItemDto
import com.example.dictionaryapp.domain.model.Definition
import com.example.dictionaryapp.domain.model.Meaning
import com.example.dictionaryapp.domain.model.Phonetic
import com.example.dictionaryapp.domain.model.WordItem

fun WordItemDto.toWordItem() = WordItem (
    word = word ?: "",
    meanings = meanings?.map {
        it.toMeaning()
    }?: emptyList(),
    phonetics = phonetic?.map {
        it.toPhonetic()
    }?: emptyList()
)

fun MeaningDto.toMeaning() = Meaning(
    definitions = definitionDtoToDefinition(definitions?.get(0)),
    partOfSpeech = partOfSpeech ?: "",
    antonyms = antonyms,
    synonyms = synonyms
)

fun PhoneticDto.toPhonetic() = Phonetic(
    text=text,
    audio = audio
)


fun definitionDtoToDefinition(definitionDto: DefinitionDto?) = Definition(
    definition = definitionDto?.definition ?: "",
    example = definitionDto?.example ?: "",
    synonyms = definitionDto?.synonyms,
    antonyms = definitionDto?.antonyms
)

fun phoneticDtoToPhonetic(phoneticDto: PhoneticDto) = Phonetic(
    text = phoneticDto.text?:"",
    audio = phoneticDto.audio?:""
)