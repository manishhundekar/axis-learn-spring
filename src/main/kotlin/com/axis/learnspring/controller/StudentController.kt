package com.axis.learnspring.controller

import com.axis.learnspring.model.Student
import com.axis.learnspring.service.StudentService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
class StudentController(@Autowired val studentService: StudentService) {

//    @GetMapping("/helloworld")
//    fun helloWorld(): String {
//        return "Hello World"
//    }
//
//    //Get all students
//    @GetMapping("/students")
//    fun getStudents(): MutableList<Student> {
//        return studentService.findAll()
//    }
//
//    @GetMapping("/path/{id}")
//    fun getPathVariable(@PathVariable id: Int): String {
//        return "Received Path Variable $id"
//    }

    //Get Student by ID
//    @GetMapping("/student/{id}")
//    fun getStudent(@PathVariable id : Int): ResponseEntity<Student> {
//        val student = studentService.findOne(id)
//        if(student == null){
//            return ResponseEntity<Student>(HttpStatus.NOT_FOUND)
//        }
//        return ResponseEntity<Student>(student, HttpStatus.OK)
//    }

//    @GetMapping("/student/{id}")
//    fun getStudent(@PathVariable id: Int): Student? {
//        println("Start")
//        val student = studentService.findOne(id)
//        println("End")
//        return student
//    }
//
//    //Add Student
//    @PostMapping("/student")
//    fun addStudent(@RequestBody student: Student): Boolean {
//        return studentService.saveOrUpdate(student)
//    }
//
//    //Delete Student
//    @DeleteMapping("/student/{id}")
//    fun deleteStudent(@PathVariable id: Int): String? {
//        return studentService.delete(id)
//    }
//
//    //Edit Student
//    @PutMapping("/student")
//    fun editStudent(@RequestBody student: Student): Boolean {
//        return studentService.saveOrUpdate(student)
//    }

}

//Controller, Service, Repo, Model
//Get All Students  $
//Get Student $
//Add Student $
//Edit Student $
//Delete Student $