//Rastgele 2 sayı üretip, 2 sayıda klavyeden girilen sayıları toplama
import java.util.Scanner;
public class HelloWorld {
public static void main(String[] args) {
Scanner tara = new Scanner(System.in);
int toplam=0,sy3=0,sy4=0;

int sy1=(int)(Math.random()*(10-1)+1);
int sy2=(int)(Math.random()*(10-1)+1);

System.out.println("1. sayıyı girin: ");
sy3 = tara.nextInt();
System.out.println("2. sayıyı girin: ");
sy4 = tara.nextInt();

toplam=sy1+sy2+sy3+sy4;

System.out.println("Üretilen 1. sayı: " + sy1);
System.out.println("Üretilen 2. sayı: " + sy2);
System.out.println("Toplam: " + toplam);