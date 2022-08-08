package com.example.algorithm_kotlin.by_week.week2

// parameter에 있는 변/상수는 생성자에 name을 넣어서 생성
class Person(val name: String) {

    init {
        println("init")
    }

    fun hello() {
        print("Hi my name is $name")
    }
}


fun createPerson() {
    // init
    val chris = Person("chris")

    // chris
    chris.name

    // "Hi my name is chris"
    chris.hello()
}