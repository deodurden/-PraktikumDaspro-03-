import java.util.Scanner;

public class tesguthib03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int hargacup = 18000;
        int jumlahcup, uangbayar;
        int totalharga;
        double diskon = 0;
        double totalBayar;
        double kembalian, kurang;

        System.out.print("Masukkan jumlah kopi: ");
        jumlahcup = input.nextInt();

        System.out.print("Masukkan uang pembayaran: ");
        uangbayar = input.nextInt();

        totalharga = hargacup * jumlahcup;

        if (totalharga >= 100000) {
            diskon = totalharga * 0.10;
            System.out.println("Mendapatkan diskon 10%");

            totalBayar = totalharga - diskon;
            kembalian = uangbayar - totalBayar;

            System.out.println("\n=== KEDAI KOPI SENJA ===");
            System.out.println("Harga per cup : Rp" + hargacup);
            System.out.println("Jumlah kopi   : " + jumlahcup);
            System.out.println("Total         : Rp" + totalharga);
            System.out.println("Diskon        : Rp" + diskon);
            System.out.println("Total bayar   : Rp" + totalBayar);
            System.out.println("Uang bayar    : Rp" + uangbayar);
            System.out.println("Kembalian     : Rp" + kembalian);

        } else {
            diskon = 0;
            totalBayar = totalharga - diskon;
            kembalian = uangbayar - totalBayar;

            System.out.println("\n=== KEDAI KOPI SENJA ===");
            System.out.println("Harga per cup : Rp" + hargacup);
            System.out.println("Jumlah kopi   : " + jumlahcup);
            System.out.println("Total         : Rp" + totalharga);
            System.out.println("Diskon        : Rp" + diskon);
            System.out.println("Total bayar   : Rp" + totalBayar);
            System.out.println("Uang bayar    : Rp" + uangbayar);
            System.out.println("Kembalian     : Rp" + kembalian);
            System.out.println("Belanja kurang dari Rp100.000, tidak mendapatkan diskon");
            if (uangbayar >= totalBayar) {
    kembalian = uangbayar - totalBayar;
    System.out.println("Kembalian = Rp" + kembalian);
} else {
    kurang = totalBayar - uangbayar;
    System.out.println("Uang kurang = Rp" + kurang);
}
        }
    }
}