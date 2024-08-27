package com.example.localdatabasekotlin

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var btn_insert:Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_insert = findViewById(R.id.insertStudentButton)

        var db = DBHandler.getDB(this)

        btn_insert.setOnClickListener {
            db.localDatabaseDao.insertStudent(StudentTable("Daniyel","daniyel@gmail.com"))
            db.localDatabaseDao.insertStudent(StudentTable("Daniyel2","daniyel2@gmail.com"))
            db.localDatabaseDao.insertStudentDetails(StudentDetailsTable("Nazmul","nazmul@gmail.com","Dhaka,Bangladesh"))
            db.localDatabaseDao.insertStudentDetails(StudentDetailsTable("Nazmul2","nazmul2@gmail.com","Dhaka,Bangladesh2"))
            //db.studentDao.deleteStu(1)
            //db.studentDao.updateStu("Watson",2)
            println(db.localDatabaseDao.getAllStudents())
            println(db.localDatabaseDao.getAllStudents()[0].name)

            println(db.localDatabaseDao.getAllStudentsDetails())
            println(db.localDatabaseDao.getAllStudentsDetails()[0].address)
        }
    }
}