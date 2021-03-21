//Barkod doğrulunu kontrol etme:
Scanner klavye = new Scanner(System.in);
int[] barkod = new int[13];
int sayi=0,tek=0,cift=0,carptopla=0,sonuc=0;
for(int j=0;j<barkod.length;j++){
    System.out.print(j + ". Elemanı gir: ");
    sayi = klavye.nextInt();
    barkod[j] = sayi;
}

for(int i=0;i<barkod.length;i++){
    if(i%2==1){
        tek=tek+(barkod[i]*3);
    }else{
        cift=cift+barkod[i];
    }
}
carptopla=tek+cift;
sonuc=(carptopla/10)-10;
System.out.println(carptopla);
System.out.println(sonuc);
if(sonuc==barkod[12]){
    System.out.println("Bu barkod doğru.");
}else{
    System.out.println("Bu barkod yanlış!");
}
/*9 799753 29368 5
indisi tek olanları toplayıp 3 le çarp
+ çift indisleri ekle
10 a böl kalana bak 
10dan kalanı çıkart*/