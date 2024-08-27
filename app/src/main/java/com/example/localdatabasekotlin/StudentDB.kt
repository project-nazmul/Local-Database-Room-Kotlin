package com.example.localdatabasekotlin

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [StudentTable::class,StudentDetailsTable::class], version = 1)
abstract class StudentDB : RoomDatabase() {

    abstract  val studentDao: StudentDao
}