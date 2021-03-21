//2 ile 10 arasında rastgele sayı üretip faktoriyelini bulma
int rnd1 = (int)(Math.random()*(10-2)+2);
int fak=1;
for(int i=1;i<=rnd1;i++){
    fak=fak*i;
    System.out.println(i);
}
System.out.println("\n"+fak);