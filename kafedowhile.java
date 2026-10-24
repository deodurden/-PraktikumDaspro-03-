import java.util.Scanner;

public class kafedowhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kopi,roti,teh,totalharga;
        int hargakopi=12000,hargateh=7000,hargaroti=20000;
        String pelanggan;
        do{
            System.out.println("masukan nama tulis 'batal' untuk membatalkan transisi: ");
            pelanggan = input.nextLine();
            if(pelanggan.equalsIgnoreCase("batal")){
                System.out.println("trasnsaksi dibatalkan");
                break;
            }
            System.out.println("jumlah kopi ");
            kopi = input.nextInt();
            System.out.println("jumlah teh ");
            teh = input.nextInt();
            System.out.println("jumlah roti ");
            roti = input.nextInt();
            totalharga = (roti * hargaroti)+(kopi * hargakopi)+(teh * hargateh);
            System.out.println("total harga: "+totalharga);
            input.nextLine();
        

        } while(true);
        System.out.println("semua transaksi selesai");

    }
}