//Rastgele üretilen sayıları en büyük ve en küçük olanını bulma:
int[] A = new int[5];
for(int j=0;j<5;j++){
    int rnd=(int)(Math.random()*(100-1)+1);
    A[j] = rnd;
}

int eb=A[0], ek=A[0];
for(int i=0;i<A.length;i++){
    System.out.println(i + ". Eleman: " + A[i]);
    if(A[i]>eb){
        eb=A[i];
    }

    if(A[i]<ek){
        ek=A[i];
    }
}
System.out.println("En büyük değer: " + eb);
System.out.println("En küçük değer: " + ek);
