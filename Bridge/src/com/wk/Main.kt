package com.wk

import com.wk.display.Display
import com.wk.display.TwiceDisplay
import com.wk.displayImp.ReduceDisplayImp
import com.wk.displayImp.SubDisplayImp

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
