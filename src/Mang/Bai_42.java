package Mang;

import java.util.Arrays;
import java.util.Scanner;

public class Bai_42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array1 = {1,2,3,4}; // khởi tạo mảng cách 2
        int n1 = array1.length;
        int[] array2 = {2,5,7,8};
        int n2 = array2.length;
        System.out.println("Mảng 1 : "+ Arrays.toString(array1));
        System.out.println("Mảng 2 : "+ Arrays.toString(array2));
        int[] array3 = new int[n1+n2];
        int hopNhatMang;
        hopNhatMang(array1,array2,n1,n2,array3);
        System.out.println("Mảng sau khi sắp xếp:");
        for (int i =0;i<n1+n2;i++)
            System.out.println(array3[i]+"");
    }

    private static void hopNhatMang(int[] array1, int[] array2, int n1, int n2, int[] array3) {

    }
}
