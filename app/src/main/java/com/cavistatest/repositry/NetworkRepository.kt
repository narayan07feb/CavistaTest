package com.cavistatest.repositry

import com.cavistatest.model.SearchImageModel
import com.cavistatest.network.Api
import retrofit2.Response

object NetworkRepository : Repository {
    override suspend fun searchImage(
        page: Int, query: String
    ): Response<SearchImageModel> {
        return Api.http.searchImage(page, query)
    }


}