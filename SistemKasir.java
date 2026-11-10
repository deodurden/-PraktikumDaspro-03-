
import java.util.Scanner;

public class SistemKasir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Deklarasi variabel
        String nama;
        String namaMenu = "";
        String pembayaran = "";

        int umur;
        int menu;
        int jumlah;
        int harga = 0;
        int subtotal;
        int diskon = 0;
        int diskonMahasiswa = 0;
        int total;

        // 2. Input identitas pembeli
        System.out.print("Masukkan nama Anda: ");
        nama = sc.nextLine();

        System.out.print("Masukkan umur Anda: ");
        umur = sc.nextInt();

        // 3. Pilihan kategori dan produk
        System.out.println("\n=== MENU KANTIN ===");
        System.out.println("1. Makanan - Nasi Goreng (Rp15.000)");
        System.out.println("2. Minuman - Es Teh (Rp4.000)");
        System.out.println("3. Camilan - Kentang Goreng (Rp10.000)");

        System.out.print("Pilih menu (1-3): ");
        menu = sc.nextInt();

        // 4. Menentukan produk menggunakan switch
        switch (menu) {
            case 1:
                namaMenu = "Nasi Goreng";
                harga = 15000;
                break;

            case 2:
                namaMenu = "Es Teh";
                harga = 4000;
                break;

            case 3:
                namaMenu = "Kentang Goreng";
                harga = 10000;
                break;

            default:
                System.out.println("Menu tidak tersedia.");
                sc.close();
                return;
        }

        // 5. Input jumlah pesanan
        System.out.print("Masukkan jumlah pesanan: ");
        jumlah = sc.nextInt();

        // Validasi jumlah pesanan
        if (jumlah <= 0) {
            System.out.println("Jumlah pesanan harus lebih dari 0.");
            sc.close();
            return;
        }

        // 6. Menghitung subtotal menggunakan operator
        subtotal = harga * jumlah;

        // 7. Menentukan diskon utama
        if (subtotal >= 50000) {
            diskon = subtotal * 10 / 100;
        } else if (subtotal >= 25000) {
            diskon = subtotal * 5 / 100;
        } else {
            diskon = 0;
        }

        // 8. Nested if untuk diskon mahasiswa
        if (umur <= 22) {
            if (subtotal >= 30000) {
                diskonMahasiswa = 2000;
            }
        }

        // 9. Menghitung total akhir
        total = subtotal - diskon - diskonMahasiswa;

        // 10. Memilih metode pembayaran menggunakan switch
        System.out.println("\n=== METODE PEMBAYARAN ===");
        System.out.println("1. Tunai");
        System.out.println("2. QRIS");
        System.out.println("3. Transfer");

        System.out.print("Pilih pembayaran (1-3): ");
        int metode = sc.nextInt();

        switch (metode) {
            case 1:
                pembayaran = "Tunai";
                break;

            case 2:
                pembayaran = "QRIS";
                break;

            case 3:
                pembayaran = "Transfer";
                break;

            default:
                System.out.println("Metode pembayaran tidak tersedia.");
                sc.close();
                return;
        }

        // 11. Menampilkan struk
        System.out.println("\n===== STRUK PEMBAYARAN =====");
        System.out.println("Nama pembeli : " + nama);
        System.out.println("Umur         : " + umur + " tahun");
        System.out.println("Produk       : " + namaMenu);
        System.out.println("Harga satuan : Rp" + harga);
        System.out.println("Jumlah       : " + jumlah);
        System.out.println("Subtotal     : Rp" + subtotal);
        System.out.println("Diskon utama : Rp" + diskon);
        System.out.println("Diskon mahasiswa: Rp" + diskonMahasiswa);
        System.out.println("Pembayaran   : " + pembayaran);
        System.out.println("----------------------------");
        System.out.println("Total bayar  : Rp" + total);
        System.out.println("============================");

        sc.close();
    }
}