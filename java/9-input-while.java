//Klavyeden girilen adı 10 defa yazdırma (WHILE)
import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) {
        Scanner tara = new Scanner(System.in);
        int x = 1;
        String ad;
        System.out.println("İsim gir:");
        ad = tara.nextLine();
        while( x <= 10 ) {
            System.out.println(ad);
            x++;
        }
    }
}