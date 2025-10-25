
package praktikum3;

import java.util.Scanner;

public class PercetanNovel {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah novel yang dicetak: ");
        int novel = input.nextInt();

        System.out.print("Masukkan tebal novel (lembar): ");
        int lembar = input.nextInt();

        int totalLembar = novel * lembar; // total lembar
        int totalDetik = totalLembar; // 1 lembar = 1 detik

        int hari = totalDetik / 86400;
        int sisaHari = totalDetik % 86400;

        int jam = sisaHari / 3600;
        int sisaJam = sisaHari % 3600;

        int menit = sisaJam / 60;
        int detik = sisaJam % 60;

        System.out.println("\n📘 Total lembar dicetak: " + totalLembar);
        System.out.println("🕒 Waktu yang diperlukan:");
        System.out.println(hari + " hari, " + jam + " jam, " + menit + " menit, " + detik + " detik");
    }
    
}
