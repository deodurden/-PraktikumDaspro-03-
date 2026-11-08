
import java.util.Scanner;

public class Tugas103 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Jumlah mahasiswa harus lebih dari 0.");
        } else {
            int[] nilaiMhs = new int[n];
            int total = 0;

            
            for (int i = 0; i < nilaiMhs.length; i++) {
                System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
                nilaiMhs[i] = input.nextInt();

                total += nilaiMhs[i];
            }

            
            double rataRata = (double) total / nilaiMhs.length;

            
            int tertinggi = nilaiMhs[0];
            int terendah = nilaiMhs[0];

            for (int i = 1; i < nilaiMhs.length; i++) {
                if (nilaiMhs[i] > tertinggi) {
                    tertinggi = nilaiMhs[i];
                }

                if (nilaiMhs[i] < terendah) {
                    terendah = nilaiMhs[i];
                }
            }

            
            System.out.println("=== HASIL NILAI MAHASISWA ===");
            System.out.println("Rata-rata nilai: " + rataRata);
            System.out.println("Nilai tertinggi: " + tertinggi);
            System.out.println("Nilai terendah: " + terendah);

            System.out.println("Daftar nilai mahasiswa:");

            for (int i = 0; i < nilaiMhs.length; i++) {
                System.out.print("Mahasiswa ke-" + (i + 1));
                System.out.print(" | Nilai: " + nilaiMhs[i]);

                if (nilaiMhs[i] >= 70) {
                    System.out.println(" | Status: LULUS");
                } else {
                    System.out.println(" | Status: TIDAK LULUS");
                }
            }
        }

        input.close();
    }
}
