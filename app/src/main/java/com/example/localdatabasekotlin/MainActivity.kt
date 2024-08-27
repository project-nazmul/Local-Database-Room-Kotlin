package com.example.localdatabasekotlin

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var btn_insert:Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_insert = findViewById(R.id.insertStudentButton)

        var db = DBHandler.getDB(this)

        btn_insert.setOnClickListener {
            db.studentDao.insertStudent(StudentTable("Daniyel","daniyel@gmail.com"))
            db.studentDao.insertStudent(StudentTable("Daniyel2","daniyel2@gmail.com"))
            db.studentDao.insertStudentDetails(StudentDetailsTable("Nazmul","nazmul@gmail.com","Dhaka,Bangladesh"))
            db.studentDao.insertStudentDetails(StudentDetailsTable("Nazmul2","nazmul2@gmail.com","Dhaka,Bangladesh2"))
            //db.studentDao.deleteStu(1)
            //db.studentDao.updateStu("Watson",2)
            println(db.studentDao.getAllStudents())
            println(db.studentDao.getAllStudents()[0].name)

            println(db.studentDao.getAllStudentsDetails())
            println(db.studentDao.getAllStudentsDetails()[0].address)
        }
    }
}