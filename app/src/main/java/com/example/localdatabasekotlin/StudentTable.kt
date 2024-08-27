package com.example.localdatabasekotlin

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class StudentTable(
    var name : String,
    var email : String,
    @PrimaryKey(autoGenerate = true)
    var id :Int = 0,
)