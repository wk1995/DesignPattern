package com.wk.abstractFactory.factory

/**
 * <pre>
 *      author : wk
 *      e-mail : 122642603@qq.com
 *      time   :2018/03/15
 *      GitHub : https://github.com/wk1995
 *      CSDN   : http://blog.csdn.net/qq_33882671
 *      desc   :
 * </pre>
 */
interface FlightFactory {
    fun createDataTran():DataTrans;
    fun createGps():Gps
    fun createFlight(gps: Gps, dataTrans: DataTrans):Flight
}