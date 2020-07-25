package com.cavistatest.repositry

import android.content.Context
import com.cavistatest.db.AppDatabase
import com.cavistatest.model.Comment

object DataBaseRepository {

    suspend fun saveComment(context: Context, comment: Comment) {
        return AppDatabase.getDatabase(context).getDBService().saveComment(comment);
    }

    suspend fun getComment(context: Context, id: String): Comment? {
        return AppDatabase.getDatabase(context).getDBService().fetchComment(id);
    }
}