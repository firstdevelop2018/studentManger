package com.student.dao;

import org.apache.log4j.*;
import org.apache.log4j.xml.*;
import java.io.*;

public class ExLog1 {
    //(1)Loggerオブジェクトの生成
    static Logger log = Logger.getLogger(ExLog1.class.getName());
    public static void main(String[] args) {
        //(2)設定ファイルの読み込み
        DOMConfigurator.configure("log4j.xml");

        ExLog1 obj1 = new ExLog1();
        ExLog2 obj2 = new ExLog2();

        obj1.methodA();

    }

    void methodA() {

            log.warn("エラー zhangyong ：" );  //(4)warnメソッドの記述


    }
}