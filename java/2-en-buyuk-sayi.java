//Klavyeden girilen 3 sayının en büyüğünü bulan program 
scanner tara = new.scanner(system.in);
int sy1, sy2, sy3, EB=0;
System.out.println("Birinci sayı girin:");
sy1 = tara.nextint();
System.out.println("İkinci sayı girin:");
sy2 = tara.nextint();
System.out.println("Üçüncü sayı girin:");
sy3 = tara.nextint();
int EB = sy1;
if(sy2 > EB){
    EB = sy2;
}
if(sy3 > EB){
    EB = sy3;
}
System.out.println("En büyük sayı" + EB);