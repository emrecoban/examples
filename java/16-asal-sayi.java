 //1 ile ekrandan girilen değer arasındaki asal sayıları bulan program ?
 
import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) {
        Scanner tara = new Scanner(System.in);
        int sayi1=0,i=1,j=2,sayac=0;
        System.out.println("Sayıyı girin: ");
        sayi1 = tara.nextInt();
        for(i=2;i<=sayi1;i++){
            sayac=0;
            for(j=2;j<=i-1;j++){
                if(i%j==0) sayac++;
            }
            if(sayac==0) System.out.println(i);
        }
    }
}