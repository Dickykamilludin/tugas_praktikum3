
package praktikum3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BuSiscaBuah {
    
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("=== PROGRAM MENGHITUNG JUMLAH BUAH BU SISCA ===");

        System.out.print("Masukkan jumlah buah mangga: ");
        int mangga = Integer.parseInt(input.readLine());

        System.out.print("Masukkan jumlah buah jambu: ");
        int jambu = Integer.parseInt(input.readLine());

        int total = mangga + jambu;

        System.out.println("\n=== HASIL PEMBELIAN ===");
        System.out.println("Jumlah mangga : " + mangga);
        System.out.println("Jumlah jambu  : " + jambu);
        System.out.println("-----------------------------");
        System.out.println("Total buah    : " + total);
    }
}
