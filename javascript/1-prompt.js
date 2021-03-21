var mesaj = prompt("Bir mesaj girin, ekrana çıksın: ");
alert("Ekranda verilen uyarı mesajı: " + mesaj);
document.write("<b>Girdiğiniz mesaj:</b> " + mesaj);
var memnunmu = confirm("Gelen mesajlardan memnun musun?");
if(memnunmu=="false"){var memnunluk = "Memnun kalmamış.";}
else{var memnunluk = "Çok beğenmiş!";}
document.write("<br><b>Memnunluk seviyesi:</b> " + memnunluk);