package com.axis.learnspring.controller

import com.axis.learnspring.model.Student
import com.axis.learnspring.service.StudentServiceTwo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
class StudentControllerTwo(@Autowired val studentService: StudentServiceTwo) {

    //Get all students
    @GetMapping("/students")
    fun getStudents(): List<Student> {
        return studentService.retrieveAllStudents()
    }

    //Get Student by ID
    @GetMapping("/student/{id}")
    fun getStudent(@PathVariable id: Int): Optional<Student> {
        return studentService.retrieveStudent(id)
    }

    //Add Student
    @PostMapping("/student")
    fun addStudent(@RequestBody student: Student): Student {
        return studentService.add(student)
    }

    //Delete Student by ID
    @DeleteMapping("/student/{id}")
    fun deleteStudent(@PathVariable id: Int) {
        return studentService.removeStudent(id)
    }

    //Edit Student
    @PutMapping("/student")
    fun editStudent(@RequestBody student: Student): Student {
        return studentService.edit(student)
    }

}

//Controller, Service, Repo, Model
//Get All Students  $
//Get Student $
//Add Student $
//Edit Student $
//Delete Student $