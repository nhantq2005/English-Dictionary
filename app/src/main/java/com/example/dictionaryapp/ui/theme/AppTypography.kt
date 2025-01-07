package com.example.dictionaryapp.ui.theme

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle

data class AppTypography(
    val word: TextStyle = TextStyle.Default,
    val partOfSpeech: TextStyle = TextStyle.Default,
    val keyword: TextStyle = TextStyle.Default,
    val detail: TextStyle = TextStyle.Default
)

val LocalAppTypography = staticCompositionLocalOf {
    AppTypography()
}