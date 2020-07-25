package com.cavistatest.repositry

import com.cavistatest.model.SearchImageModel
import retrofit2.Response

interface Repository {

    suspend fun searchImage(page: Int, query: String): Response<SearchImageModel>

}