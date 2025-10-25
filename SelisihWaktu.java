
package praktikum3;

import java.util.Scanner;

public class SelisihWaktu {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jam1, menit1, detik1;
        int jam2, menit2, detik2;

        System.out.println("=== PROGRAM MENGHITUNG SELISIH WAKTU ===");

        System.out.println("Masukkan Waktu Pertama:");
        System.out.print("Jam   : ");
        jam1 = input.nextInt();
        System.out.print("Menit : ");
        menit1 = input.nextInt();
        System.out.print("Detik : ");
        detik1 = input.nextInt();

        System.out.println("\nMasukkan Waktu Kedua:");
        System.out.print("Jam   : ");
        jam2 = input.nextInt();
        System.out.print("Menit : ");
        menit2 = input.nextInt();
        System.out.print("Detik : ");
        detik2 = input.nextInt();

        int totalDetik1 = (jam1 * 3600) + (menit1 * 60) + detik1;
        int totalDetik2 = (jam2 * 3600) + (menit2 * 60) + detik2;

        int selisihDetik = Math.abs(totalDetik2 - totalDetik1);

        int jamSelisih = selisihDetik / 3600;
        selisihDetik %= 3600;
        int menitSelisih = selisihDetik / 60;
        int detikSelisih = selisihDetik % 60;

        System.out.println("\n=== HASIL SELISIH WAKTU ===");
        System.out.println("Selisih: " + jamSelisih + " jam, " + menitSelisih + " menit, " + detikSelisih + " detik");
    }
    
}
