//Rastgele üretilen 2 sayıdan büyük olanını ekrana yazdırma:
double rnd1 = Math.floor((Math.random()*(100.0-1.0)+1.0));
double rnd2 = Math.floor((Math.random()*(100.0-1.0)+1.0));
System.out.println("Sayı 1: " + rnd1);
System.out.println("Sayı 2: " + rnd2);
System.out.println(Math.max(rnd1,rnd2));
System.out.println(Math.min(rnd1,rnd2));
