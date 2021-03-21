//Klavyeden girilen sayının faktöriyelini bulma (WHILE) 
import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) {
        Scanner tara = new Scanner(System.in);
        int number = 0;
        int fak = 1;
        int i= 0;
        System.out.println("Sayı girin: ");
        number = tara.nextInt();
        i = number;
        do{
            fak = fak * i;
            i--;
        }while(i>=1);
        System.out.println("Sonuç: " + fak);
    }
}