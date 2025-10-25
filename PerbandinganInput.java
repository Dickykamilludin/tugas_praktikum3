
package praktikum3;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class PerbandinganInput {
  
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        System.out.println("=== Input dengan Scanner ===");
        System.out.print("Masukkan nama: ");
        String nama1 = sc.nextLine();
        System.out.print("Masukkan umur: ");
        int umur1 = sc.nextInt();
        System.out.println("Nama: " + nama1 + ", Umur: " + umur1);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\n=== Input dengan BufferedReader ===");
        System.out.print("Masukkan nama: ");
        String nama2 = br.readLine();
        System.out.print("Masukkan umur: ");
        int umur2 = Integer.parseInt(br.readLine()); // harus konversi manual
        System.out.println("Nama: " + nama2 + ", Umur: " + umur2);
    }
    
}
