//Çarpım tablosu örneği (do-while)
 
int i=1, tab=1, sonuc=0,oncekitab=0;
do
{
    System.out.print(i + "x" + tab + "=" + (tab*i) + " | ");
    i++;
    oncekitab=i;
    if(i==10){tab++;i=1;}
    if(i!=oncekitab){System.out.print("\n");}
    if(tab==10){break;}
}
while(i<=9);
