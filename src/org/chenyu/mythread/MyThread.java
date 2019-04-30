package org.chenyu.mythread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread {
    public static void main(String[] args) {
        MyThread my = new MyThread();
        my.fun1(10, 1);
    }
    public String fun1(int x, int y){
        try {
            Lock lock=new ReentrantLock();
            int temp = x/y;
            return "ok";
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("继续执行");
        System.out.println("ok");
        return "no";

    }
}
