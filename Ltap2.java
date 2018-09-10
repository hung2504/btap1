package com.company;

import java.util.Scanner;

public class Ltap2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chieu dai hinh chu nhat la:");
        int chieudai = scanner.nextInt();
        System.out.println("chieu rong hinh chu nhat la");
        int chieurong = scanner.nextInt();
        System.out.println("yeu cau bai toan:");
        int chuvi = (chieudai + chieurong)*2;
        System.out.println("chu vi hinh chu nhat la:"+chuvi);
        int dientich = chieudai*chieurong;
        System.out.println("dien tich hinh chu nhat la:"+dientich);
        int x = Math.min(chieudai,chieurong);
        System.out.println("canh nho hon la:"+x);

    }
}
