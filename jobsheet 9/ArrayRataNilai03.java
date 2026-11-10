
import java.util.Scanner;

public class ArrayRataNilai03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Jumlah mahasiswa harus lebih dari 0.");
        } else {
            int[] nilaiMhs = new int[n];
            int total = 0;
            int jumlahLulus = 0;
            double rata2;

            
            for (int i = 0; i < nilaiMhs.length; i++) {
                System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
                nilaiMhs[i] = input.nextInt();

                total += nilaiMhs[i];

                if (nilaiMhs[i] > 70) {
                    jumlahLulus++;
                }
            }

            
            rata2 = (double) total / nilaiMhs.length;

            
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

            // Menentukan predikat
            String predikat;

            if (rata2 >= 85) {
                predikat = "SANGAT BAIK";
            } else if (rata2 >= 70) {
                predikat = "BAIK";
            } else {
                predikat = "PERLU PENDAMPINGAN";
            }

            
            System.out.println("Total nilai: " + total);
            System.out.println("Rata-rata: " + rata2);
            System.out.println("Nilai tertinggi: " + tertinggi);
            System.out.println("Nilai terendah: " + terendah);
            System.out.println("Jumlah mahasiswa lulus: " + jumlahLulus);
            System.out.println("Predikat kelas: " + predikat);
        }

        input.close();
    }
}
