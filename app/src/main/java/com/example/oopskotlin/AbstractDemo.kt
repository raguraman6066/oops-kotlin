package com.example.oopskotlin
fun main(){
    var t1=Teach("jack")
    t1.displayGreet()
   // t1.displayAge()
}
abstract class AbstractDemo(name: String) {
    var age:Int=30
   open fun displayAge(){
        print("my age is $age")
    }
    abstract fun displayGreet();
}

class Teach(var name:String):AbstractDemo(name){
    override fun displayGreet() {
        println("hi $name")
    }

}