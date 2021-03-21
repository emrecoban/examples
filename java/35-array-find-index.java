//Sayının indisini bulma:
Scanner tara = new Scanner(System.in);
int i,n,indisi=99999;

int a[]=new int[10];
System.out.println("Dizi elemanları:");
for(i=0;i<10;i++){
    a[i]=(1+(int)(Math.random()*10));
    System.out.print(a[i]+"\t");
}
System.out.print("\nİndisini bulmak istediğiniz sayı:");
n = tara.nextInt();
for(int j=0;j<10;j++){
    if(n==a[j]){
        indisi = j;
    }
}
if(indisi!=99999){
    System.out.println(n + " sayısının indisi: " + indisi);
}else{
    System.out.println("Böyle bir sayı yok.");
}