package com.example.mariyam.study_what

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_study.*
import java.util.*

class study : AppCompatActivity() {

    val studylist = arrayListOf("Android","Java_Course","Web","Sylabus","Project")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_study)

        decidebtn.setOnClickListener {
            val random = Random()
            val randomlist = random.nextInt(studylist.count())
            studyview.text = studylist[randomlist]
        }

        addinbtn.setOnClickListener {
            val new = addtext.text.toString()
            studylist.add(new)
            addtext.text.clear()
        }




    }
}
