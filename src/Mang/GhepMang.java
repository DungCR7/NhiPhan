package Mang;

import java.util.Arrays;

public class GhepMang {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {2,5,7,8};
        System.out.println("Mảng 1 :"+ Arrays.toString(arr1));
        System.out.println("Mảng 2 :"+ Arrays.toString(arr2));
        int length = arr1.length + arr2.length ;
        int[] arr3 = new int[length];
        int j = 0;
        //ghép 2 mảng
        for (int i=0;i<arr1.length;i++){
            arr3[j] = arr1[i];
            j++;
        }
        for (int i=0;i<arr2.length;i++){
            arr3[j] = arr2[i];
            j++;
        }
        // sắp xếp 2 mảng
       for (int i = 0;i<arr3.length;i++){
            for (int a = i+1;a<arr3.length;a++){
                if (arr3[i]>arr3[a]){
                    int tam = arr3[i];
                    arr3[i] = arr3[a];
                    arr3[a] = tam;
                }
            }
            System.out.print("\t"+(arr3[i]));
        }
    }
}
