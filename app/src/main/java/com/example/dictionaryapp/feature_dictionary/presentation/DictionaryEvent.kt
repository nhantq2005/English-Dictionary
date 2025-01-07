package com.example.dictionaryapp.feature_dictionary.presentation

sealed class DictionaryEvent {
    data class EnteredSearch(val searchWord:String):DictionaryEvent()
    object OnSearch:DictionaryEvent()

}