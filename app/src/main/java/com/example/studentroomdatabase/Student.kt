package com.example.studentroomdatabase

import androidx.room.ColumnInfo
import androidx.room.PrimaryKey

data class Student(@PrimaryKey(autoGenerate = true)
                   val id: Int,
                   @ColumnInfo(name = "first_name")
                   val firstName: String,
                   @ColumnInfo(name = "last_name")
                   val lastName: String,
                   @ColumnInfo(name = "roll_no")
                   val rollNo: Int)
