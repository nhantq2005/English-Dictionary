package com.example.dictionaryapp.data.model.api

import com.example.dictionaryapp.data.model.dto.WordResultDto
import retrofit2.http.GET
import retrofit2.http.Path

interface DictionaryApi {
    @GET("{word}")
    suspend fun getWordResult(
        @Path("word") word: String
    ):WordResultDto

    companion object {
        const val BASE_URL = "https://api.dictionaryapi.dev/api/v2/entries/en/"
    }
}