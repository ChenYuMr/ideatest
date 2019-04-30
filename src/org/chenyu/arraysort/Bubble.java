package org.chenyu.arraysort;

import org.junit.Test;

/**
 * 冒泡排序
 */
public class Bubble {
    public static int [] bubbleSort(int []arr){
        if(arr.length == 1 || arr.length == 0){
            return arr;
        }
        int temp = 0;
        boolean flag = true;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = false;
                }
            }
            if(flag){
                break;
            }
        }
        return arr;
    }
    @Test
    public void test(){
        int []arr = new int[]{90, 80, 7, 6, 8, 4, 4};
        arr=Bubble.bubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
