package com.student.dao;

import org.apache.log4j.*;
import org.apache.log4j.xml.*;
import java.io.*;

public class ExLog2 {
    //(1)Loggerオブジェクトの生成
    static Logger log = Logger.getLogger(ExLog2.class.getName());
    public static void main(String[] args) {
        //(2)設定ファイルの読み込み
        DOMConfigurator.configure("log4j.xml");

        ExLog2 obj1 = new ExLog2();
        ExLog2 obj2 = new ExLog2();

        obj1.methodA();

    }

    void methodA() {
        try {
            FileReader in = new FileReader("test.txt");  //(3)
        } catch(IOException e) {
            log.warn("エラー：" + e);  //(4)warnメソッドの記述
        }
    }
}