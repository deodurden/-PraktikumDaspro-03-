package tugas;
import java.util.Scanner;
public class Tugas103 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("masukan jumlah n");
        int n = input.nextInt();
        int totalangka = 0;

        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(j);
                totalangka++;
            }
            System.out.println(" ");
        }
        System.out.print("jumlah angka yang tercetak = " + totalangka );
        



    }
    
    
}
