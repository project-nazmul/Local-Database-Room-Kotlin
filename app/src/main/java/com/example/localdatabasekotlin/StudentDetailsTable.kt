package com.example.localdatabasekotlin

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class StudentDetailsTable(
    var name : String,
    var email : String,
    var address : String,
    @PrimaryKey(autoGenerate = true)
    var id :Int = 0,
)
