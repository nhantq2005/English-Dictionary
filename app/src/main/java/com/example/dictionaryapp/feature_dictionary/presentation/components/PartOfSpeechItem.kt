package com.example.dictionaryapp.feature_dictionary.presentation.components

import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun PartOfSpeechComponents(partOfSpeech:String){
    Card {
        Text(text = partOfSpeech)
    }
}