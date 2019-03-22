package com.day02.dome002;
/*十一、编写一个泛型方法，实现任意引用类型数组指定位置元素交换。*/
public class Test11 {
    public static void main(String[] args) {
        Integer[] arr={1,2,3,4,5,6,7,8,9};
        String[] arr1={"a","d","s","g","df","as","f","w"};
        getArray(arr,1,3);
        getArray(arr1,1,3);
    }
    public static <E> void getArray(E[] e,int a,int b){
        E tamp=e[a];
        e[a]=e[b];
        e[b]=tamp;
        for (E e1 : e) {
            System.out.print(e1+" ");
        }
        System.out.println();
    }
}
