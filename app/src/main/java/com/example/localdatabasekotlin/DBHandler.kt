package com.example.localdatabasekotlin

import android.content.Context
import androidx.room.Room

object DBHandler {

    fun getDB(context: Context):LocalDatabase{

        return  Room.databaseBuilder(context,LocalDatabase::class.java,"LocalDatabase").allowMainThreadQueries().build()
    }
}