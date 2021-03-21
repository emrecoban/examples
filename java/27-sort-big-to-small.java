//Büyükten küçüğe doğru sıralama:
int rnd1=0, rnd2=0;
Scanner tara = new Scanner(System.in);
System.out.println("Birinci sayı: ");
rnd1 = tara.nextInt();
System.out.println("İkinci sayı: ");
rnd2 = tara.nextInt();
int gecici=0;
if(rnd2<rnd1){
    gecici=rnd1;
    rnd1=rnd2;
    rnd2=gecici;
}
for(int i=rnd2;i>rnd1;i--){
    System.out.println(i);
}