//Dizide indis bulma (2'ye bölüp)
Scanner tara = new Scanner(System.in);
int i,j,Bos,n, aranan;
System.out.print("Dizi boyutunu giriniz:");
n = tara.nextInt();
System.out.println("\n----------------------------------------");
int a[]=new int[n];
System.out.println("a dizisinin sıralanmış elemanları:");
for(i=0;i<a.length;i++){
    a[i]=(1+(int)(Math.random()*100));
    System.out.print(a[i]+"\t");
}
for(i=0;i<a.length-1;i++){
    for(j=0;j<a.length-1;j++){
        if(a[j+1]<a[j]){
            Bos=a[j];
            a[j]=a[j+1];
            a[j+1]=Bos;
        }
    }
}
System.out.println("\n----------------------------------------");
System.out.print("Aramak istediğiniz sayı:");
aranan = tara.nextInt();
System.out.println("\n----------------------------------------");
System.out.println("a sıralı dizisinin elemanları");
for(i=0;i<n;i++){
    System.out.print(a[i]+"\t");
}
System.out.println("\n----------------------------------------");
if(a[(n/2)]>aranan)
{
    for(i=0;i<n/2;i++){
        if(aranan == a[i]){
            System.out.println(aranan + " sayısının indisi: " + i);
        }
    }
}else{
    for(i=n/2;i<n;i++){
        if(aranan == a[i]){
            System.out.println(aranan + " sayısının indisi: " + i);
        }
    }
}