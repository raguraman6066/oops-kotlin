package com.example.oopskotlin

fun main(){
   //visibility modifiers
    //public(all) private(only file and same package) - protected(not package only subclass) - internal
var emp=Emp()
    println(emp.name2)
}


open class Employee{
    open var name2:String="Jack" //public
    private var age=2
    protected  var hairColor:String="red"

}

