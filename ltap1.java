package com.company;

import java.util.Scanner;

public class ltap1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ho Va Ten :");
        String hoTen = scanner.nextLine();
        System.out.println("Diem Trung Binh:");
        Double diemTb = scanner.nextDouble();
        System.out.println("Hoc Sinh: "+hoTen +diemTb);

    }
}
