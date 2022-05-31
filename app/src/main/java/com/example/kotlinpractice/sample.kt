package com.example.kotlinpractice

fun main() {
    helloWorld()

    println(add(3,5))

    //3. String Template

    val name = "Jisu"
    val lastName = "Kim"
    println("my name is ${name + lastName} I`m 27") //{}대괄호를 사용한하면 nameI 라는 변수를 찾게되어서 에러가 남 {}안에 name이라는 변수를 찾음.

    println("this is 2\$a") // 백슬래쉬를 안해주면 a라는 변수를 찾는데 없어서 에러가남 $앞에 \ 해주면 스트링값으로 읽힌다.

    checkNum(1)

    forAndWhile()

}

//1. 함수

fun helloWorld() : Unit {
    println("Hello World!")
}

fun add(a: Int, b: Int): Int {
    return a+b;
}

//2. val vs var
//val = value

fun hi() {
    val a : Int = 10 //상수
    var b : Int = 9  //변수
    var e : String

    b = 100

    val c = 100 // val c : Int = 100 타입 지정 안 해줘도 됨
    var d = 100 // var d : Int = 100 타입 지정 안 해줘도 됨

    var name : String = "Jisu" // 타입 생략가능능
}

//4.조건식

fun maxBy(a: Int, b: Int) : Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}

fun maxBy2(a : Int, b : Int)  = if(a>b) a else b

fun checkNum(score: Int) {
    when (score) {
        0 -> println("this is 0")
        1 -> println("this is 1")
        2, 3 -> println("this is 2 or 3")
        else -> println("")
    }

    var b = when (score) {
        1 -> 1
        2 -> 2
        else -> 3
    }

    println("b : ${b}")

    when (score) {
        in 90..100 -> println("You are genius")
        in 10..80 -> println("not bad")
        else -> println("okay")
    }
}

//Expression vs Statement 반환 하면 전자 ,자바의 void 가 후자 코틀린은 모든 함수가 반환을함

//5. Array and List

//Array

// List
// 1. List   읽기전용
// 2.MutableList  읽기,쓰기 가능능
fun array() {
    val array = arrayOf(1, 2, 3)
    val list = listOf(1,2,3,)

    val array2 = arrayOf(1, "d", 3, 4)
    val list2 = listOf(1, "d", 11L)

    array[0] = 3
    val value = list.get(0)

    val arrayList = arrayListOf<Int>()
    arrayList.add(10)
    arrayList.add(20)
    arrayList[0] = 20

}

//6. For / While
fun forAndWhile() {
    val students = arrayListOf("Jisu", "jenny", "Yerin")

    for (name: String in students) {
        println("name : ${name}")
    }

    var sum : Int = 0
    for (i  in 1..10 ) {
        sum += i
    }
    println("1..10 : ${sum}")
    sum = 0

    for (i  in 1..10 step 2) {
        sum += i
    }
    println("1..10 step2 : ${sum}")
    sum = 0

    for (i in 10 downTo 1) {
        sum += i
    }
    println("1 in 10 downTo 1 : ${sum}")
    sum = 0

    for (i in 1 until 10) { //1~10 10미만 -> 9까지
        sum += i
    }
    println("1 until 10 : ${sum}")
    sum = 0

    var index = 0
    while (index < 10) {
        println("current index : ${index}")
        index++
    }

}