package com.cnheima.dome01;

import java.util.Arrays;

public class Test4 {
    public static void main(String[] args) {
        int[] arr1={123,234,325,34,6,45,65,7,6,8,679,7};
        int[] arr2={223,421,5,235,346,4656,75,7568,34};
        System.out.println(Arrays.toString(arr2));
        System.arraycopy(arr1,3,arr2,5,3);
        System.out.println(Arrays.toString(arr2));
    }
}
