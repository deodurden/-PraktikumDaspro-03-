import java.util.Scanner;

public class DanaPenghargaan03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama;
        String jenisKegiatan;
        int jumlahDokumen;
        int peringkat;
        int statusPKM;

        System.out.print("masukkan nama mahasiswa: ");
        nama = input.nextLine();

        System.out.print("masukkan jenis kegiatan: ");
        jenisKegiatan = input.nextLine();

        System.out.print("masukkan jumlah dokumen yang diupload: ");
        jumlahDokumen = input.nextInt();

        System.out.print("masukkan peringkat juara (1/2/3, isi 0 jika bukan juara): ");
        peringkat = input.nextInt();

        System.out.print("masukkan status pendanaan PKM (1=lolos, 0=tidak): ");
        statusPKM = input.nextInt();

        System.out.println("\n=== HASIL VALIDASI ===");
        System.out.println("Nama mahasiswa : " + nama);

        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") ||
            jenisKegiatan.equalsIgnoreCase("BAKORMA") ||
            jenisKegiatan.equalsIgnoreCase("Mandiri")) {

            if (peringkat >= 1 && peringkat <= 3) {

                if (jumlahDokumen == 4) {
                    System.out.println("Status dana : MENDAPATKAN DANA PENGHARGAAN");
                    System.out.println("Alasan : Juara " + peringkat + " dan dokumen lengkap.");
                } else {
                    System.out.println("Status dana : TIDAK MENDAPATKAN DANA PENGHARGAAN");
                    System.out.println("Alasan : Dokumen tidak lengkap.");
                    System.out.println("Dokumen yang masih kurang : " + (4 - jumlahDokumen));
                }
            }

            
        }
    }
}