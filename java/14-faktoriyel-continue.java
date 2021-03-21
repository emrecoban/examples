//Girilen sayının faktöriyelini bulma (Continue komutu, alt satırı es geçme)
 
import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) {
        Scanner tara = new Scanner(System.in);
        int sayi, fak=1;
        System.out.println("Sayıyı girin: ");
        sayi = tara.nextInt();
        for(int i=1;i<=sayi;i++){
            fak = fak *i;
            if(i==5){continue;}
            System.out.println(i);
        }
        System.out.println("Sonuç: " + fak);
    }
}