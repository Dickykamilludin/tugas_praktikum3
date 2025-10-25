
package praktikum3;

import java.io.DataInputStream;
import java.io.IOException;

public class hitung_belanja {
    
    public static void main(String[] args) throws IOException {
        DataInputStream input = new DataInputStream(System.in);

        System.out.print("Nama: ");
        String nama = input.readLine();

        System.out.print("Total Belanja: ");
        double totalBelanja = Double.parseDouble(input.readLine());

        System.out.print("Diskon (%): ");
        double diskon = Double.parseDouble(input.readLine());

        double potongan = totalBelanja * diskon / 100;
        double totalBayar = totalBelanja - potongan;

        System.out.print("Bayar: ");
        double bayar = Double.parseDouble(input.readLine());

        double kembalian = bayar - totalBayar;

        System.out.println("\n=== STRUK PEMBELANJAAN ===");
        System.out.println("Nama Pembeli : " + nama);
        System.out.println("Total Belanja: Rp" + totalBelanja);
        System.out.println("Diskon       : " + diskon + "%");
        System.out.println("Potongan     : Rp" + potongan);
        System.out.println("Total Bayar  : Rp" + totalBayar);
        System.out.println("Bayar        : Rp" + bayar);
        System.out.println("Kembalian    : Rp" + kembalian);
    }
}
    

