//Random sayı ile üçgen formülünü bulma: (a^2v3/4)
double a=Math.floor(Math.random()*(10.0-1.0)+1.0);
double sonuc=(Math.pow(a,2) * Math.sqrt(3))/4;
System.out.println("random: "+a);
System.out.println("sonuç: "+sonuc);