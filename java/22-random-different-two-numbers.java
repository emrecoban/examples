//10 ile 60 arasındaki rastgele sayı üretip arasındaki değerleri yazdırma
double rnd1 = Math.floor((Math.random()*(60.0-10.0)+10.0));
double rnd2 = Math.floor((Math.random()*(60.0-10.0)+10.0));
double gecici=0;
if(rnd2<rnd1){
    gecici=rnd1;
    rnd1=rnd2;
    rnd2=gecici;
}
for(double i=rnd1;i<rnd2;i++){
    System.out.println(i);
}