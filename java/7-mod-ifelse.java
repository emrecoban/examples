// Klavyeden girilen sayı 3'e bölünüyorsa 3'le çarpsın, bölünmüyorsa 2'ye bölme?
import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) {
        Scanner tara = new Scanner(System.in);
        double n=0;
        double snc=0;
        System.out.println("Sayı girin:");
        n = tara.nextDouble();
        if(n%3==0){
            snc = n*3;
        }else{
            snc = n/2;
        }
        System.out.println("Sonuç:" + snc);
    }
}
