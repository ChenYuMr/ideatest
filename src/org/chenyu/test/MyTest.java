package org.chenyu.test;

import java.util.Collection;
import java.util.ConcurrentModificationException;

/**
 * 99乘法表
 */
public class MyTest {
    public static void main(String[] args) {
        for(int i = 1; i < 10; i++){
            int j=1;
            while(j < i+1){
                System.out.print(j + "*" + i + "=" + i*j + " ");
                j++;
            }
            System.out.println();
        }
    }
}
