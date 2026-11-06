package tugas;


import java.util.Scanner;

public class Tugas303 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahToko;
        int totalBarangSemua = 0;
        int tokoTerbanyak = 1;
        int barangTerbanyak = -1;

        System.out.print("Masukkan jumlah toko: ");
        jumlahToko = sc.nextInt();

        while (jumlahToko < 1) {
            System.out.print("Jumlah toko minimal 1. Masukkan ulang: ");
            jumlahToko = sc.nextInt();
        }

        for (int i = 1; i <= jumlahToko; i++) {
            int jumlahPelanggan;
            int totalBarangToko = 0;

            System.out.println("Toko " + i);

            System.out.print("Masukkan jumlah pelanggan: ");
            jumlahPelanggan = sc.nextInt();

            while (jumlahPelanggan < 0) {
                System.out.print("Tidak boleh negatif. Masukkan ulang: ");
                jumlahPelanggan = sc.nextInt();
            }

            for (int j = 1; j <= jumlahPelanggan; j++) {
                int jumlahBarang;

                System.out.print("Jumlah barang pelanggan " + j + ": ");
                jumlahBarang = sc.nextInt();

                while (jumlahBarang < 0) {
                    System.out.print("Tidak boleh negatif. Masukkan ulang: ");
                    jumlahBarang = sc.nextInt();
                }

                totalBarangToko += jumlahBarang;
            }

            System.out.println("Toko " + i + " - pelanggan: "
                    + jumlahPelanggan + ", total barang: " + totalBarangToko);

            totalBarangSemua += totalBarangToko;

            if (totalBarangToko > barangTerbanyak) {
                barangTerbanyak = totalBarangToko;
                tokoTerbanyak = i;
            }
        }

        System.out.println("Total barang seluruh toko: " + totalBarangSemua);
        System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);

        sc.close();
    }
}

