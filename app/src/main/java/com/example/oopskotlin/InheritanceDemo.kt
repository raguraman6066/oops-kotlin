package com.example.oopskotlin

//create common class as person- walk,talk

//math teacher -walk,talk, teach
//football player- walk,talk , play
//businessman-walk,talk, runBusiness


//no need duplication code so we using inheritance


open class Person(){
constructor( name: String, age: Int) : this() {
println("secondary constructor")
}
//    init {
//        println("the person $name and age $age")
//    }
//
//    fun talk(){
//        println("The person $name is talking")
//    }
//    fun walk(){
//        println("The person $name is walking")
//    }

}
class Teacher:Person{
constructor(name: String,age: Int):super(name ,age){
println("person secondary constructor $name $age")
}
}


class Player(name:String, age:Int):Person(name,age){
//fun playing(){
//    println("player $name playing")
//}
}

class BusinessMan( name:String, age:Int):Person(name,age){

}




