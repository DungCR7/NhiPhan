package Mang;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class LoaiPhanTuTrungLap {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(20);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        arr.add(50);
        arr.add(50);
        arr.sort((o1, o2) -> o1 - o2);
        System.out.println("Mang vua nhap la :"+arr);
        Set<Integer> giaTriDuyNhat = new HashSet<>();
        giaTriDuyNhat.addAll(arr);
        arr.sort((o1, o2) -> o1 - o2);
        System.out.println("Gia tri con lai sau khi loai bo la :"+giaTriDuyNhat);
    }
}
