package com.example.localdatabasekotlin

import android.content.Context
import androidx.room.Room

object DBHandler {

    fun getDB(context: Context):StudentDB{

        return  Room.databaseBuilder(context,StudentDB::class.java,"StudentDB").allowMainThreadQueries().build()
    }
}