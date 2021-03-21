//Dizilerde en küçük ve en büyük sayıyı bulma:
int A[]={15,9,12,4,5};
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