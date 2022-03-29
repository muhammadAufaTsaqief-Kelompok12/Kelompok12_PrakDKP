package com.example;
import java.util.Scanner ;
public class Tugas {
    public static void main(String[] args) {
        while (true) {
            System.out.println("====================================");
            System.out.println("Selamat Datang di Toko Sepeda Motor Yanti");
            System.out.println("====================================");
            System.out.println();
            System.out.println("---------------------------------");
            System.out.println("Silahkan pilih merk sepeda motor anda");
            System.out.println("---------------------------------");
            Scanner scan = new Scanner(System.in);
            System.out.println("1. Suzuki");
            System.out.println("2. Yamaha");
            System.out.println("3. Honda");
            int merk = scan.nextInt();
            System.out.println();
