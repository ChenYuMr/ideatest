package org.chenyu.arraysort;

import org.junit.Test;

/**
 * 插入排序
 */
public class Insert {
    public static int [] insertSort(int []arr){
        for (int i = 1; i < arr.length; i++) {
            int index = i;
            int current = arr[i];
            while (index > 0 && current < arr[index - 1]){
                    arr[index] = arr[index - 1];
                    index--;
            }
            if(index != i){
                arr[index] = current;
            }
        }
        return arr;
    }
    @Test
    public void test(){
        int []arr = new int[]{90, 80, 7, 6, 8, 4, 4};
        arr=Insert.insertSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
