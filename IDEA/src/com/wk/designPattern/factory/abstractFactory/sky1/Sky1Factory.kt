package com.wk.designPattern.factory.abstractFactory.sky1

import com.wk.designPattern.factory.abstractFactory.factory.DataTrans
import com.wk.designPattern.factory.abstractFactory.factory.FlightFactory
import com.wk.designPattern.factory.abstractFactory.factory.Gps

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
class Sky1Factory: FlightFactory {

    override fun createDataTran()=Sky1DataTrans()

    override fun createGps()=Sky1Gps()

    override fun createFlight(gps: Gps, dataTrans: DataTrans)
            =Sky1Flight(dataTrans,gps)
}