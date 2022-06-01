package com.train

import java.util.*

fun main(args: Array<String>) {

    val s = Scanner(System.`in`)

    while(true) {

        print("Please enter number of tickets: ")
        var numTicket = s.nextInt()

        if (numTicket != -1) {

            print("How many round-trip tickets: ")
            var numRound = s.nextInt()

            if(numRound != -1) {
                val t = kticket(numTicket, numRound)
                t.print()
            }
            if(numRound == -1){
                break
            }
        }
        if (numTicket == -1){
            break
        }
    }

}

class kticket(var numTicket:Int, var numRound:Int){

    fun print(){
        println("Total tickets: "+numTicket)
        println("Round trips: "+numRound)
        println("Total: "+(numTicket*1000+numRound*1800))
    }


}
