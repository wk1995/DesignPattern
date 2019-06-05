package com.wk.designPattern.bridge


import com.wk.designPattern.bridge.display.Display
import com.wk.designPattern.bridge.display.TwiceDisplay
import com.wk.designPattern.bridge.displayImp.ReduceDisplayImp
import com.wk.designPattern.bridge.displayImp.SubDisplayImp

object Main {

    @JvmStatic
    fun main(args: Array<String>) {
        // write your code here
        val display= Display((SubDisplayImp()))
        val display1= Display((ReduceDisplayImp()))
        val display2= TwiceDisplay((SubDisplayImp()))
        val display3= TwiceDisplay((ReduceDisplayImp()))
        display.display()
        display1.display()
        display2.twiceDisplay()
        display3.twiceDisplay()
    }
}
