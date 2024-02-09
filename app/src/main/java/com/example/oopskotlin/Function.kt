package com.example.oopskotlin

fun main(){
    println("Main fun")
//    myFirstFun("john",29)
//    var myResult= addNum(2,3)
//    println(myResult)

  /*  var c1=Car(2024,"BMW","red")//c1 is object .initialize using constructor
    println( c1.brand)
    c1.drive()*/

var t1=Teacher("jack",21)


var p1=Person1()
    p1.name="jack"

}

fun myFirstFun(name:String,age:Int){
    println("this is first fun"+name+"your age "+age)
}

fun addNum(a:Int,b:Int):Int{
    return (a+b)
}