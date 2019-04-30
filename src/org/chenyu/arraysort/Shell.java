package org.chenyu.arraysort;

import org.junit.Test;

/**
 * 希尔排序
 */
public class Shell {
    public static int [] shellSort(int []arr){
        int gap = arr.length/2;
        int temp = 0;
        while(gap > 0){
            for (int i = gap; i < arr.length; i++) {
                temp = arr[i];
                int index = i - gap;
                while (index >= 0 && temp < arr[index]){
                    arr[index + gap] = arr[index];
                    index = index - gap;
                }
                if((index + gap) != i){
                    arr[index + gap] = temp;
                }
            }
            gap = gap/2;
        }
        return arr;
    }

    @Test
    public void test(){
        int []arr = new int[]{90, 80, 7, 6, 8, 4, 4};
        arr=Shell.shellSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
