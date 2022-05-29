package com.trainticketbook;

import java.util.Scanner;

public class ttbruner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("北高火車票價試算系統，目前價格為：單趟1000元，來回票可以享有九折優惠");
        System.out.println("請輸入訂票張數：");
        int otkn = scanner.nextInt();
        System.out.println("有幾張是來回票？");
        int rtkn = scanner.nextInt();
        ttb booknum = new ttb(otkn, rtkn);
        booknum.print();
    }
}
