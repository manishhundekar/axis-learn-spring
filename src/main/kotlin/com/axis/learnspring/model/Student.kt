package com.axis.learnspring.model

import org.springframework.hateoas.RepresentationModel
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class Student(
    @Id
    @GeneratedValue
    var id : Int,
    var name : String,
    var gender : String,
    var email : String,
    var phone : String
    ) : RepresentationModel<Student>()


/*
Student
{
    id : 25
    ,name
    ,gender,
    email,
    phone
}

Student
{
    id : 25
    ,name
    ,gender,
    email,
    phone,
    add
    f2
    f3
    f4
}

 */