package com.company

import HomeWork
import Student
import Teacher

fun main() {

    //crete a new professor
    val professor1 = Teacher("Enrique")
    val professor2 = Teacher("Yannett")
    val student1 = Student("Ezequiel",professor1,professor2)
    val student2 = Student("Daniel",professor1,professor2)
    val student3 = Student("Marina",professor1,professor2)

    professor1.attach(student1)
    professor1.attach(student2)
    professor1.attach(student3)

    professor2.attach(student1)
    professor2.attach(student2)
    professor2.attach(student3)

    professor1.postNewHomeWork(HomeWork("10 planas de el abecedario"))
    professor2.postNewHomeWork(HomeWork("100 planas"))

}
