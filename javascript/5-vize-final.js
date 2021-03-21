var Nmr=0, Ads="";
var Vnt=0, Fnt=0, Ont=0;
Nmr = prompt("Numara girin:","123");
Ads = prompt("Ad soyad girin:","Talebe");
Vnt = prompt("Vize notu girin:","55");
Fnt = prompt("Final notu girin:","66");
Ont = ((Vnt*0.4)+(Fnt*0.6));
document.write("Numara: " + Nmr + "<br>");
document.write("Ad Soyad: " + Ads + "<br>");
document.write("Vize Notu: " + Vnt + "<br>");
document.write("Final Notu: " + Fnt + "<br>");
document.write("Ortalama Notu: " + Ont + "<br>");
if(Ont<50){
document.write("Başarı: KALIR"); 
}else if(Ont>=50 && Ont<70){
document.write("Başarı: SORUMLU GEÇER");
}else{
document.write("Başarı: BAŞARILI"); 
}