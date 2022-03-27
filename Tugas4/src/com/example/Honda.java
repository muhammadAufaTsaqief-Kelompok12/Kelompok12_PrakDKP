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

if (Budget <= 15 ){
    System.out.println("Budget anda cocok dengan Honda Beat");
}
else if (Budget >15 && Budget<=25){
    System.out.println("Budget anda cocok dengan Honda Vario");}
else if (Budget > 25){
    System.out.println("Budget anda cocok dengan Honda PCX");
}
    }
}