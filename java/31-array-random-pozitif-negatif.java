//Rastgele üretilen sayılardan en büyük, en küçük, sıfır, pozitif ve negatif sayısını bulma:

int[] A = new int[5];
for(int j=0;j<5;j++){
    int rnd=(int)(Math.random()*(50-(-50))+(-50));
    A[j] = rnd;
}

int eb=A[0], ek=A[0], neg=0, sif=0, poz=0;
for(int i=0;i<A.length;i++){
    System.out.println(i + ". Eleman: " + A[i]);
    if(A[i]>eb){
        eb=A[i];
    }

    if(A[i]<ek){
        ek=A[i];
    }
    if(A[i]<0){
        neg++;
    }else if(A[i]==0){
        sif++;
    }else{
        poz++;
    }
}
System.out.println("En büyük değer: " + eb);
System.out.println("En küçük değer: " + ek);
System.out.println("Pozitif değer: " + poz);
System.out.println("Sıfır değer: " + sif);
System.out.println("Negatif değer: " + neg);