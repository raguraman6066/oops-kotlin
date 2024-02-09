package com.example.oopskotlin


fun  main(){
    var b1=Bus()
    b1.accelerate()
}
interface Vehicle{
    val speedValue:Int
    fun startEngine()
    fun accelerate(){
        println("Accelerating...")
    }
}


class Bus() :Vehicle{

    override val speedValue: Int=25
    override fun startEngine() {
        TODO("Not yet implemented")
    }
}