//Sayının çift mi tek mi olduğunu bulma?
scanner tara = new.scanner(system.in);
int sy;
System.out.println("Sayı girin:");
sy = tara.nextint();
if(sy%2==0){
    System.out.println("Sayı çifttir.");
}else{
    System.out.println("Sayı tektir.");
}