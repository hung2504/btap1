package com.company;

import java.util.Scanner;

public class Ltap4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap he so phuong trinh bac 2:");
        System.out.println("Nhap he so a:");
        int a = scanner.nextInt();
        System.out.println("Nhap he so b:");
        int b = scanner.nextInt();
        System.out.println("Nhap he so c:");
        int c = scanner.nextInt();
        double delta = Math.pow(b,2) - 4*a*c;
        double x = Math.sqrt(delta);
        System.out.println("can bac hai cua delta la:"+x);
    }
}
