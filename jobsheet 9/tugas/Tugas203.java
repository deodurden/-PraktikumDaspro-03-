
import java.util.Scanner;

public class Tugas203 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        String[] menu = {
            "Nasi Goreng", "Mie Goreng", "Roti Bakar",
            "Kentang Goreng", "Teh Tarik", "Cappucino",
            "Chocolate Ice"
        };

        int[] harga = {
            15000, 13000, 10000, 12000,
            8000, 18000, 20000
        };

        
        System.out.println("===== MENU KAFE KAMPUS =====");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i] + " - Rp" + harga[i]);
        }

        
        System.out.print("\nCari menu yang ingin dipesan: ");
        String cari = input.nextLine();

        int indexCari = -1;

        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cari)) {
                indexCari = i;
                break;
            }
        }

        if (indexCari != -1) {
            System.out.println("Menu ditemukan!");
            System.out.println("Nama menu: " + menu[indexCari]);
            System.out.println("Harga: Rp" + harga[indexCari]);
        } else {
            System.out.println("Menu tidak tersedia.");
        }

        
        System.out.print("\nMasukkan jumlah jenis pesanan: ");
        int n = input.nextInt();
        input.nextLine();

        if (n <= 0) {
            System.out.println("Jumlah pesanan harus lebih dari 0.");
        } else {
            String[] pesanan = new String[n];
            int[] hargaPesanan = new int[n];
            int total = 0;

            
            for (int i = 0; i < pesanan.length; i++) {
                boolean ditemukan = false;

                while (!ditemukan) {
                    System.out.print("Masukkan nama menu pesanan ke-" + (i + 1) + ": ");
                    String nama = input.nextLine();

                    
                    for (int j = 0; j < menu.length; j++) {
                        if (menu[j].equalsIgnoreCase(nama)) {
                            pesanan[i] = menu[j];
                            hargaPesanan[i] = harga[j];
                            total += harga[j];
                            ditemukan = true;
                            break;
                        }
                    }

                    if (!ditemukan) {
                        System.out.println("Menu tidak tersedia! Silakan masukkan ulang.");
                    }
                }
            }

            
            System.out.println("\n===== STRUK PEMESANAN =====");
            System.out.println("No. | Nama Menu       | Harga");

            for (int i = 0; i < pesanan.length; i++) {
                System.out.println((i + 1) + ".  | " + pesanan[i] + " | Rp" + hargaPesanan[i]);
            }

            System.out.println("----------------------------");
            System.out.println("Total biaya: Rp" + total);
        }

        input.close();
    }
}
