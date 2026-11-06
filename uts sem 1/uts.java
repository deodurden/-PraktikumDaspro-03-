import java.util.Scanner;

public class uts{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bilangan1,bilangan2,bilangan3;

        System.out.print("masukan bilangan 1");
        bilangan1 = sc.nextInt();

        System.out.print("masukan bilangan 2");
        bilangan2 = sc.nextInt();

        System.out.print("masukan bilangan 3");
        bilangan3 = sc.nextInt();

        if(bilangan1>bilangan2){
            System.out.print(bilangan1>bilangan2);
        }else if(bilangan3>bilangan2){
            System.out.print(bilangan3>bilangan2);
        }else{
            System.out.print("peler bapakau pecah");
        }
        




        
    }
}