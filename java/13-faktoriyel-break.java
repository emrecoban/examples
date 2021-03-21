//Girilen sayının faktöriyelini bulma (en fazla 5'e kadar BREAK komutu)
import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) {
        Scanner tara = new Scanner(System.in);
        int sayi, fak=1;
        System.out.println("Sayıyı girin: ");
        sayi = tara.nextInt();
        for(int i=1;i<=sayi;i++){
            fak = fak *i;
            if(i==5){break;}
        }
        System.out.println("Sonuç: " + fak);
    }
}