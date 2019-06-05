package com.wk.designPattern.factory.abstractFactory

import com.wk.designPattern.factory.abstractFactory.sky1.Sky1Factory

object Main {

    @JvmStatic
    fun main(args: Array<String>) {
        val sky1Factory = Sky1Factory()
        val gps = sky1Factory.createGps()
        val dataTrans = sky1Factory.createDataTran()
        val sky1 = sky1Factory.createFlight(gps, dataTrans)
        sky1.show()
    }
}