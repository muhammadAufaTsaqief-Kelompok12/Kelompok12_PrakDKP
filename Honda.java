package com.example;
import java.util.Scanner;
public class Honda {
    public void motot(Integer Budget) {
        Scanner scan = new Scanner(System.in);
        System.out.println("---------------------------------");
        System.out.println("Masukkan Budget anda (Dalam juta), ");
        System.out.println("---------------------------------");
         Budget = scan.nextInt();
        System.out.println("Budget anda" + Budget + "juta");
