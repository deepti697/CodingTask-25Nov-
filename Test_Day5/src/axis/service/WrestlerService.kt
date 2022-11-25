package com.axis.service
import com.axis.model.Wrestler
import com.axis.util.WrestlerUtil
class WrestlerService {
    var wrestlerUtil=WrestlerUtil()
    fun addWrestler(wrestler: Wrestler){
        wrestlerUtil.addWrest(wrestler)

    }
    fun displayAllWrestlers(){
        wrestlerUtil.display()

    }
    fun countOfWrestlers(){
        wrestlerUtil.count()
    }
}