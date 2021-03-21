Scanner tara=new Scanner(System.in);
int gecici;
System.out.print("Kaç elemanlı bir dizi olsun");
int sayi=tara.nextInt();
int[] dizi=new int[sayi];

for(int i=0;i<sayi;i++)
{
    dizi[i]=(int)((Math.random()*99)+1);
    System.out.println(dizi[i]);
}

System.out.print("Bir Sayı Tutun:");
int tutulan=tara.nextInt();

for(int i=1;i<sayi;i++)
{
    for(int j=0;j<sayi-i;j++)
    {
        if(dizi[j]>dizi[j+1])
        {
            gecici=dizi[j+1];
            dizi[j+1]=dizi[j];
            dizi[j]=gecici;
        }
    }
}
System.out.println("--------------");
for(int i=0;i<sayi;i++)
{
    System.out.println(dizi[i]);
}

int ort=sayi/2;

if(dizi[ort]>tutulan)
{
    for(int i=0;i<ort;i++)
    {
        if(dizi[i]==tutulan){System.out.println("Dizideki sırası:"+i);}
    }

}
if(dizi[ort]<tutulan)
{
    for(int i=ort;i<sayi;i++)
    {
        if(dizi[i]==tutulan){System.out.println("Dizideki sırası:"+i);}
    }    
}  
if(dizi[ort]==tutulan)
{
    for(int i=0;i<sayi;i++)
    {
        if(dizi[i]==tutulan){System.out.println("Dizideki sırası:"+i);}
    }
}