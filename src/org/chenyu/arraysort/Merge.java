package org.chenyu.arraysort;

import org.junit.Test;

import java.util.Arrays;

public class Merge {
    public static int []mergeSort(int []arr){
        if(arr.length < 2){
            return arr;
        }
        int middle = arr.length/2;
        int []left = Arrays.copyOfRange(arr, 0, middle);
        int []right = Arrays.copyOfRange(arr, middle, arr.length);
        return merge(mergeSort(left), mergeSort(right));
    }
    public static  int []merge(int []left, int []right){
        int []result = new int[left.length + right.length];
        for (int index = 0,i = 0, j = 0; index < result.length; index++) {
            if(i >= left.length){
                result[index] = right[j++];
            }else if(j >= right.length){
                result[index] = left[i++];
            }else if(left[i] > right[j]){
                result[index] = right[j++];
            }else {
                result[index] = left[i++];
            }
        }
        return result;
    }

    @Test
    public void test(){
        int []arr = new int[]{90, 80, 7, 6, 8, 4, 4};
        arr=Merge.mergeSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
