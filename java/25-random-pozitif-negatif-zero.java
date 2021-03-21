//10 tane -5 ile 5 arasında rastgele sayı üretip sıfır, negatif ve pozitif sayı adedini bulma
int po=0, si=0, sifir=0;
System.out.println("## Üretken Sayılar ##");
for(int i=0;i<10;i++){
int a=(int)(Math.random()*(5-(-5))+(-5));
System.out.println(a+"\t");
if(a<0)
po++;
else if(a!=0)
si++;
else
sifir++;
}
System.out.println("\nnegatif sayı adedi:"+po);
System.out.println("pozitif adedi:"+si);
System.out.println("sıfır adedi:"+sifir);
