package com.example.dictionaryapp.ui.theme

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

data class AppColor(
    val searchBar:Color = Color.Unspecified,
    val wordItem:Color = Color.Unspecified,
    val partOfSpeechItem:Color = Color.Unspecified,
    val keyword:Color= Color.Unspecified
)

val LocalAppColor = staticCompositionLocalOf {
    AppColor()
}