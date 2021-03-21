//10 tane 0'dan 10'a kadar rastgele sayı üretip pozitif ve sıfır olan sayıların adetini bulma
int po=0, si=0;
System.out.println("## Üretken Sayılar ##");
for(int i=0;i<10;i++){
    int a=(int)(Math.random()*10);
    System.out.println(a+"\t");
    if(Math.signum(a)!=0)
        po++;
    else
        si++;
}
System.out.println("\npozitif sayı adedi:"+po);
System.out.println("sıfır adedi:"+si);
