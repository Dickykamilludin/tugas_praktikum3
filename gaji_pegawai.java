
package praktikum3;

import java.util.Scanner;

public class gaji_pegawai {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nomor Induk Karyawan (NIK): ");
        String nik = input.nextLine();

        System.out.print("Nama Karyawan: ");
        String nama = input.nextLine();

        System.out.print("Alamat: ");
        String alamat = input.nextLine();

        System.out.print("Jabatan: ");
        String jabatan = input.nextLine();

       
        System.out.print("Gaji Pokok (P1): ");
        double gajiPokok = input.nextDouble();

        System.out.print("Tunjangan Jabatan (P2):  ");
        double tunjanganJabatan = input.nextDouble();

        System.out.print("Tunjangan Istri (P3): ");
        double tunjanganIstri = input.nextDouble();

        System.out.print("Tunjangan Anak (P4):  ");
        double tunjanganAnak = input.nextDouble();

        double totalGaji = gajiPokok + tunjanganJabatan + tunjanganIstri + tunjanganAnak;

        double pajak = 0.10 * totalGaji;

        double gajiBersih = totalGaji - pajak;

        System.out.println("\n=== SLIP GAJI PEGAWAI ===");
        System.out.println("NIK              : " + nik);
        System.out.println("Nama             : " + nama);
        System.out.println("Alamat           : " + alamat);
        System.out.println("Jabatan          : " + jabatan);
        System.out.println("------------------------------");
        System.out.println("Gaji Pokok       : Rp" + gajiPokok);
        System.out.println("Tunjangan Jabatan: Rp" + tunjanganJabatan);
        System.out.println("Tunjangan Istri  : Rp" + tunjanganIstri);
        System.out.println("Tunjangan Anak   : Rp" + tunjanganAnak);
        System.out.println("------------------------------");
        System.out.println("Total Gaji       : Rp" + totalGaji);
        System.out.println("Pajak (10%)      : Rp" + pajak);
        System.out.println("Gaji Bersih      : Rp" + gajiBersih);
    }
}

