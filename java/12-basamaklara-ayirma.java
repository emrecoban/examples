//Girilen 4 basamaklı sayının basamaklarını bulma
 
import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) {

    Scanner tara = new Scanner(System.in);
    int sayi, binler, yuzler, onlar, birler;
    System.out.println("Sayıyı girin: ");
    sayi = tara.nextInt();
    binler = (sayi / 1000)*1000;
    System.out.println(binler);
    yuzler = sayi - binler;
    System.out.println(yuzler);
    onlar = yuzler-((yuzler / 100)*100);
    System.out.println(onlar);
    birler = onlar-((onlar / 10)*10);
    System.out.println(birler);

    }
}