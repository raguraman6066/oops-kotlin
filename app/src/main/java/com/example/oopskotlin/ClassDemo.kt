package com.example.oopskotlin

//Dry Principle
//procedural -fun , oops -class with data and methods
/*
*classes
* objects
* constructors
* class fun
*inheritance
* polymorphism
* encapsulation
* interfaces
* abstraction
* */


class Car (var year: Int,var brand: String,var color: String){


        //attributes -property
  /*  var brand="Ford"
    var year=2023
    var color="red"

    constructor(brand: String, year: Int, color: String) {
        this.brand = brand
        this.year = year
        this.color = color
    }*/

    //functions- methods
    fun drive(){
        println("Im driving")
    }
    fun brake(){
        println("Im pressing brake")
    }
}

class Emp:Employee(){
    override var name2:String="Johny"


}