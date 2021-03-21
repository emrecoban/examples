//1 ile 100 arasında rastgele 30 sayıyı toplayıp ve ortalamasını yazdıran uygulama
double toplam=0;
for(int i=1;i<=30;i++){
    double bul = Math.floor((Math.random()*(100.0-20.0)+20.0));
    toplam = toplam+bul;
}
System.out.println("Toplam: " + toplam);
System.out.println("Ortalama: " + (toplam/30));
