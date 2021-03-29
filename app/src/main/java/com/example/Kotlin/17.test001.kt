package com.example.Kotlin
fun main(array: Array<String>){
    println(first())
    println(second(80))
    println(third(49))
    println(gugudan())
}


fun first (){
    val alist = mutableListOf<Int>()
    val blist = mutableListOf<String>()
    for ( i in 0..9){
        alist.add(i)
    }
    for (i in alist){
        if (i %2==0){
            blist.add("True")
        }else{
            blist.add("False")
        }
    }
    println(alist)

    println(blist)

}

//2번 문제

fun second (x:Int){
    if (x>=80 && x<90){
        println('A')
    }else if (x>=70 && x<80){
        println('B')
    }else if (x>=60 && x<70){
        println('C')
    }else{
        println('F')
    }
}

//3번 문제
fun third (x:Int){
    println((x/10)+(x%10))
}
//4번 문제 (구구단
fun gugudan (){
    for (i in 2..9){
        for (j in 1..10){
            println("${i} * ${j} = ${i*j}")
        }
        println()
    }
}