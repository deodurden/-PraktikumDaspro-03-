package tugas;
import java.util.Scanner;
public class Tugas203 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah baris: ");
        int n = input.nextInt();
        int total = 0;

        if (n >= 3) {
            int i = 1;
            while (i <= n) {
                int j = 1;
                while (j <= 4) {
                    int hasil = j * i;
                    System.out.print(hasil + " ");
                    total += hasil;
                    j++;
                }

                System.out.println();
                i++;
            }

            System.out.print("Jumlah semua angka: ");
            System.out.print(total);
        } else {
            System.out.print("Minimal 3");
        }
    }
    
}
