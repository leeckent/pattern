package com.feizhou.pattern.singleton.test;

import com.feizhou.pattern.singleton.Emperor;
import com.feizhou.pattern.singleton.EmperorSyn2;

/**
 * [description]
 *
 * @author lee
 * @version V1.0.0
 * @date 16/12/7
 */
public class Minister {

    public static void main(String[] args) {
        Emperor emperor = Emperor.getInstance();
        emperor.emperorInfo();

        Emperor emperor2 = Emperor.getInstance();
        emperor2.emperorInfo();

        for (int i = 0; i < 10; i++) {
            Thread myThread1 = new MyThread();

            Thread myThread2 = new MyThread();

            myThread1.start();
            myThread2.start();
        }
    }

}
class MyThread extends Thread {

    @Override
    public void run() {
        EmperorSyn2 emperor2 = EmperorSyn2.getInstance();
    }
}
