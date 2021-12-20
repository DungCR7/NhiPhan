package Mang;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Bai_41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       /* List<Integer> arrays;
        List<Integer> arrays1 = Arrays.asList(4, 2, 3, 1);
        arrays1.sort((o1, o2) -> o1 - o2);
        System.out.println(arrays1);
        List<Integer> arrays2 = Arrays.asList(8, 5, 2, 7);
        arrays2.sort(((o1, o2) -> o1 - o2));
        System.out.println(arrays2);
        */
       /* int array1[]=new int[4];
        khởi tạo mảng cách 1
        array1[0]=1;
        array1[1]=2;
        array1[2]=3;
        array1[3]=4;
        */
        int[] array1 = {4,2,3,1}; // khởi tạo mảng cách 2
        int[] array2 = {2,5,7,8};
        System.out.println("\nMảng 1 : "+Arrays.toString(array1));
        System.out.println("\nMảng 2 : "+Arrays.toString(array2));
        Arrays.sort(array1);
        Arrays.sort(array2);
        System.out.println("Mang sau khi sap xep : "+Arrays.toString(array1));
        System.out.println("Mang sau khi sap xep : "+Arrays.toString(array2));



    }
}





