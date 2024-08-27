package com.example.localdatabasekotlin

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface StudentDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertStudent(studentTable: StudentTable)

    @Query("select * from 'StudentTable'")
    fun getAllStudents(): List<StudentTable>

    @Query("DELETE from 'StudentTable' where id = :stuid")
    fun deleteStu(stuid: Int)

    @Query("UPDATE 'StudentTable' SET name = :stuName where id = :id")
    fun updateStu(stuName:String,id:Int)



    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertStudentDetails(studentDetailsTable: StudentDetailsTable)

    @Query("select * from 'StudentDetailsTable'")
    fun getAllStudentsDetails(): List<StudentDetailsTable>
}