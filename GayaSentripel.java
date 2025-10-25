
package praktikum3;

import java.util.Scanner;

public class GayaSentripel {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== PROGRAM MENGHITUNG GAYA SENTRIPETAL ===");

        System.out.print("Masukkan massa benda (kg): ");
        double massa = input.nextDouble();

        System.out.print("Masukkan kecepatan (m/s): ");
        double kecepatan = input.nextDouble();

        System.out.print("Masukkan jari-jari lintasan (m): ");
        double jariJari = input.nextDouble();


        double gayaSentripetal = (massa * Math.pow(kecepatan, 2)) / jariJari;

        System.out.println("\n=== HASIL PERHITUNGAN ===");
        System.out.println("Massa (m)        : " + massa + " kg");
        System.out.println("Kecepatan (v)    : " + kecepatan + " m/s");
        System.out.println("Jari-jari (r)    : " + jariJari + " m");
        System.out.println("----------------------------");
        System.out.println("Gaya Sentripetal : " + gayaSentripetal + " N");
    }
}
    

