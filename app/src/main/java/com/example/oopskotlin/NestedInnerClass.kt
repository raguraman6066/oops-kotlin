package com.example.oopskotlin

fun main(){
var o1=Outer()
    println(o1.age)
    var nested=Outer.Nested()
    println(nested.length)
}
class Outer{
    //...
    var age=25
    class Nested{
        //...
        var length=55
    }
}