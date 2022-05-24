package com.train

import java.util.*

fun main(args: Array<String>) {

    val s = Scanner(System.`in`)


    print("Please enter number of tickets: ")
    var numTicket = s.nextInt()
    print("How many round-trip tickets: ")
    var numRound = s.nextInt()

    val t = ticket(numTicket, numRound)
    t.print()

}

class ticket(var numTicket:Int, var numRound:Int){

    fun print(){
        println("Total tickets: "+numTicket)
        println("Round trips: "+numRound)
        println("Total: "+(numTicket*1000+numRound*1800))
    }


}
