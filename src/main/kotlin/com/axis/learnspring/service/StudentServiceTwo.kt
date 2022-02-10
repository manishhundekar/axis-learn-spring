package com.axis.learnspring.service

import com.axis.learnspring.exception.StudentNotFoundException
import com.axis.learnspring.model.Student
import com.axis.learnspring.repository.StudentRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

@Service
class StudentServiceTwo(@Autowired val studentRepository: StudentRepository) {

    fun add(student: Student): Student {
        return studentRepository.save(student)
    }

    fun retrieveAllStudents(): List<Student> {
        return studentRepository.findAll()
    }

    fun retrieveStudent(id: Int): Optional<Student> {
        return studentRepository.findById(id)
    }

    fun removeStudent(id: Int) {
        return studentRepository.deleteById(id)
    }

    fun edit(student: Student): Student {
        return studentRepository.save(student)
    }

}