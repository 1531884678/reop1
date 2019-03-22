package com.day02.dome002;

/*十二、编写一个泛型方法，接收一个任意引用类型的数组，并反转数组中的所有元素*/

public class Test12 {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        String[] arr1 = {"a", "d", "s", "g", "df", "as", "f", "w"};
        getArray(arr);
        getArray(arr1);
    }

    //泛型只能用于引用类型
    public static <E> void getArray(E[] e) {
        for (int i = 0, j = e.length - 1; i < j; i++, j--) {
            E tamp = e[i];
            e[i] = e[j];
            e[j] = tamp;
        }
        for (E e1 : e) {
            System.out.print(e1 + " ");
        }
        System.out.println();
    }
}
