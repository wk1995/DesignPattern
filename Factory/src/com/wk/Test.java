package com.wk;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

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
public class Test {

    public static void main(String[] a) {
        int count=0;
        try {
            BufferedReader mBufferedReader =
                    new BufferedReader(
                            new InputStreamReader(
                                    new FileInputStream(
                                            "D:\\1.txt")
                                    ));
            BufferedReader mBufferedReader1 =
                    new BufferedReader(
                            new InputStreamReader(
                                    new FileInputStream(
                                            "D:\\2.txt")
                            ));
            String tmp="";
            String tmp1="";
            while((tmp=mBufferedReader.readLine())!=null && (tmp1=mBufferedReader1.readLine())!=null){
                count++;
                if(!tmp.equals(tmp1)){
                  System.out.println(count+"    "+tmp+"   "+tmp1);
              }

            }

        }catch (Exception e){

        }
    }
}
