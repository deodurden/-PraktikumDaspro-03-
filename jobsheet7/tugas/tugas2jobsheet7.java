package tugas;

import java.util.Scanner;

public class tugas2jobsheet7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jenis, durasi, total = 0;

        do {
            System.out.println("Masukkan jenis kendaraan (1 mobil, 2 motor, 0 keluar):");
            jenis = input.nextInt();

            if (jenis == 1 || jenis == 2) {
                System.out.println("Masukkan durasi parkir (jam):");
                durasi = input.nextInt();

                if (jenis == 1) {
                    total += durasi * 3000;
                } else {
                    total += durasi * 2000;
                }
            }
// asd
        } while (jenis != 0);

        System.out.println("Total pembayaran parkir: Rp " + total);

        input.close();
    }
}
