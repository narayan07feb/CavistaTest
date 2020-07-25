package com.cavistatest.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.cavistatest.model.Comment

@Dao
interface DBService {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveComment(result: Comment);

    @Query(value = "SELECT * FROM Comment WHERE id= :search")
    suspend fun fetchComment(search: String): Comment;
}