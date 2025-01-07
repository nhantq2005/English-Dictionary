package com.example.dictionaryapp.data.repository

import android.app.Application
import com.example.dictionaryapp.data.model.api.DictionaryApi
import com.example.dictionaryapp.data.model.mapper.toWordItem
import com.example.dictionaryapp.domain.model.WordItem
import com.example.dictionaryapp.domain.repository.DictionaryRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject
import com.example.dictionaryapp.util.Result
import retrofit2.HttpException
import java.io.IOException


class DictionaryRepositoryImpl @Inject constructor(
    private val dictionaryApi: DictionaryApi,
    private val application: Application
): DictionaryRepository {
    override suspend fun getWordResult(
        word: String
    ): Flow<Result<WordItem>> {
        return flow {
            emit(Result.Loading(true))

            val remoteWordResultDto = try {
                dictionaryApi.getWordResult(word)
            }catch (e:HttpException){
                e.printStackTrace()
                emit(Result.Error("Can not get result"))
                emit(Result.Loading(false))
                return@flow
            }catch (e:IOException){
                e.printStackTrace()
                emit(Result.Error("Can not get result"))
                emit(Result.Loading(false))
                return@flow
            }catch (e:Exception){
                e.printStackTrace()
                emit(Result.Error("Can not get result"))
                emit(Result.Loading(false))
                return@flow
            }

            remoteWordResultDto?.let { wordResultDto ->
                wordResultDto[0]?.let {wordItemDto ->
                    emit(Result.Success(wordItemDto.toWordItem()))
                    emit(Result.Loading(false))
                    return@flow
                }
            }

            emit(Result.Loading(false))
        }
    }
}