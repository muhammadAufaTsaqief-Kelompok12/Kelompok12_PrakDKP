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
            switch(merk) {
                case 1 :
                    System.out.println("---------------------------------");
                    System.out.println("Masukkan Budget anda (Dalam juta), ");
                    System.out.println("---------------------------------");
                    int Budget = scan.nextInt();
                    System.out.println("Budget anda" + Budget+ "juta");
                    if (Budget<=15 ){
                        System.out.println("Budget anda cocok dengan Suzuki Nex II");

                        System.exit(0);
                    }
                    else if (Budget > 15 && Budget <= 25){
                        System.out.println("Budget anda cocok dengan Nex Crossover");
                        System.exit(0);

                    }
                    else if (Budget > 25){
                        System.out.println("Budget anda cocok dengan Suzuki GSX");
                        System.exit(0);


                    }


                case 2 :
                    System.out.println(kereta());
                    System.exit(0);
                    break;
                case 3:
                    Honda objek = new Honda();
                    objek.motot(1);
                    System.exit(0);
                default:
                    System.out.println("Pilihan belum tersedia");
                    System.exit(0);


            }




        }
