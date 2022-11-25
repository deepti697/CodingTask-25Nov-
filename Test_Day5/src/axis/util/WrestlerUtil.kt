package com.axis.util
import com.axis.model.Wrestler
class WrestlerUtil {
    var wrestlerList= mutableListOf<Wrestler>()
    init{
        wrestlerList.add(Wrestler("Ram",38,60,80))
        wrestlerList.add(Wrestler("Suresh",29,66,120))
        wrestlerList.add(Wrestler("Bheem",36,50,85))
        wrestlerList.add(Wrestler("Jaggu",41,52,110))
        wrestlerList.add(Wrestler("Rajesh",46,71,90))
    }

    fun addWrest(wrestler: Wrestler){
        wrestlerList.add(wrestler)
        println("Wrestler added to list successfully!!!!")
    }

    fun display(){
        for (wrestler in wrestlerList){
            println(wrestler.toString())

        }
    }

    fun count(){
        var countList=wrestlerList.count{it.age > 35}
        println("Count of wrestlers whose age is > 35 : $countList")
    }
}