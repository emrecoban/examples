// Vize ve final notuna göre kaldı geçti sonucunu  gösteren program?
scanner tara = new.scanner(system.in);
double vz=0, fnl=0, snc=0;
System.out.println("Vize notunu girin:");
vz = tara.nextDouble();
System.out.println("Final notunu girin:");
fnl = tara.nextDouble();
snc = (vz * 0.40) + (fnl * 0.60)
if(snc>=50){
    System.out.println("Geçtiniz!");
}else{
    System.out.println("Kaldınız!");
}