package Mang;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Bai_43 {
    public static void main(String[] args) {
        int n,tempSort;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập vào số phần tử của mảng thứ nhất: ");
            n = scanner.nextInt();
        } while (n < 0);
        // khởi tạo và cấp phát bộ nhớ cho mảng
        int array[] = new int[n];
        System.out.println("Nhập các phần tử cho mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            array[i] = scanner.nextInt();
        }
        System.out.println("\nMảng vừa nhập là: ");
        List<Integer> arrays;
        List<Integer> arrays1 = Arrays.asList(4, 2, 3, 1);
        arrays1.sort((o1, o2) -> o1 - o2);
        System.out.println(arrays1);
       /* for (int i = 0; i < n; i++) {
            System.out.print(array[i] + "\t");
        }

        */
        do {
            System.out.println("\nNhập vào số phần tử của mảng thứ hai: ");
            n = scanner.nextInt();
        } while (n < 0);
        System.out.println("Nhập các phần tử cho mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            array[i] = scanner.nextInt();
        }
        System.out.println("\nMảng vừa nhập là: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + "\t");
        }


    }
}


