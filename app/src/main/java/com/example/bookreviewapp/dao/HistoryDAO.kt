package com.example.bookreviewapp.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.bookreviewapp.model.History

@Dao
interface HistoryDAO {
    @Query("SELECT * FROM history")
    fun getAll(): List<History>

    @Insert
    fun insertHist(history: History)

    @Query("DELETE FROM history WHERE keyword == :keyword")
    fun delete(keyword: String)
}