//Dizideki elemanları sıralı listelettirme:

Scanner tara = new Scanner(System.in);
int i,j,Bos,n;
System.out.println("Dizi boyutunu giriniz:");
n = tara.nextInt();
int a[]=new int[11];
System.out.println("a dizisinin sıralanmış elemanları");
for(i=0;i<n;i++){
    a[i]=(1+(int)(Math.random()*100));
    System.out.print(a[i]+"\t");
}
for(i=0;i<n-1;i++){
    for(j=0;j<n-1;j++){
        if(a[j+1]<a[j]){
            Bos=a[j];
            a[j]=a[j+1];
            a[j+1]=Bos;
        }
    }
}
System.out.println();
System.out.println("a sıralı dizisinin elemanları");
for(i=0;i<n;i++){
    System.out.print(a[i]+"\t");
}
