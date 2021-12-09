package Mang;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Bai_41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> arrays;
        List<Integer> arrays1 = Arrays.asList(4, 2, 3, 1);
        arrays1.sort((o1, o2) -> o1 - o2);
        System.out.println(arrays1);
        List<Integer> arrays2 = Arrays.asList(8, 5, 2, 7);
        arrays2.sort(((o1, o2) -> o1 - o2));
        System.out.println(arrays2);



    }
}





