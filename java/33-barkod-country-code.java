//Ülke kodunu bulan barkod:
Scanner tara=new Scanner(System.in);
String ilk3="";
int islem1=0,islem2=0,sonuc=0;
int barkod[]=new int[13];
System.out.println("Barkodu giriniz.");
//9 799753 29368 5
for(int b=0;b<13;b++)
{
    System.out.println((b+1)+".harf");
    barkod[b]=tara.nextInt();
    if(b%2==1)
    {
    islem1=islem1+barkod[b];
    }
    else {islem2=islem2+barkod[b]; }
}
islem1=islem1*3;
sonuc=(islem1+islem2);
ilk3 = barkod[0] +""+ barkod[1] +""+ barkod[2];
System.out.println("Numarası: " + ilk3);
if(ilk3.equals("380")){
    System.out.println("Numarası: Bulgaristan");
}else if(ilk3.equals("868") || ilk3.equals("869")){
    System.out.println("Numarası: Türkiye");
}else{
    System.out.println("Numarası: Tanımlama yapılmamış.");
}
if(sonuc%10==0)
{
    System.out.println("Barkod dogru.");
}
else System.out.println("Barkod Yanlış..");