import java.util.Scanner;

public class tugas1jobsheet7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int tiket, totalTiket = 0;
        int hargaTiket = 50000;
        double totalPenjualan = 0;
        double diskon, totalHarga;

        while (true) {
            System.out.println("Masukkan jumlah tiket (0 untuk selesai):");
            tiket = input.nextInt();

            if (tiket == 0) {
                break;
            }

            if (tiket < 0) {
                System.out.println("Jumlah tiket tidak valid!");
                continue;
            }

            totalHarga = tiket * hargaTiket;

            if (tiket > 10) {
                diskon = 0.15;
            } else if (tiket > 4) {
                diskon = 0.10;
            } else {
                diskon = 0;
            }

            totalHarga = totalHarga - (totalHarga * diskon);

            totalTiket += tiket;
            totalPenjualan += totalHarga;

            System.out.println("Total harga setelah diskon: Rp " + totalHarga);
        }

        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.println("Total penjualan: Rp " + totalPenjualan);

        input.close();
    }
}
