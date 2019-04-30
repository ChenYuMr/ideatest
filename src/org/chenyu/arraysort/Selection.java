package org.chenyu.arraysort;

import org.junit.Test;

/**
 * 选择排序
 */
public class Selection {
    public static int [] selectionSort(int []arr){
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = index + 1; j < arr.length; j++) {
                if(arr[index] > arr[j]){
                    index = j;
                }
            }
            if(index != i){
                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
            }
        }
        return arr;
    }

    @Test
    public void test(){
        int []arr = new int[]{90, 80, 7, 6, 8, 4, 4};
        arr=Selection.selectionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
