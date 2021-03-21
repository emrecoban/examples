//Üçgen tipini belirleme (IF-ELSE)
Scanner tara = new Scanner(System.in);
int n1,n2,n3;
System.out.println("Birinci kenarı girin: ");
n1 = tara.nextInt();
System.out.println("İkinci kenarı girin: ");
n2 = tara.nextInt();
System.out.println("Üçüncü kenarı girin: ");
n3 = tara.nextInt();

if(n1==n2 && n1==n3 && n2==n3){
    System.out.println("Eşkenar Üçgen");
}else if(n1==n2 || n1==n3 || n2==n3){
    System.out.println("İkizkenar Üçgen");
}else{
    System.out.println("Çeşitkenar Üçgen");
}