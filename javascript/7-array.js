/*tanımlanan (11 adet) şehir ismi olan dizi değişkeninden klavyeden girilen, şehir kod numarası ile dizide karşılık gelen şehir ismini bulup ekrana yazdıran jsp kodlarını hazırlayınız
v2:
ilave olarak dizideki şehir isimlerini il kodlarıyla birlikte yazabilen jsp kodunu ekleyiniz.
*/
var sehir = new Array("Amasya","Samsun","İzmir","Ankara","İstanbul","Konya","Adana","Antalya","Muğla","Sinop","Kastamonu");
var skod=0;
var skod = prompt("Plaka kodu giriniz:");
document.write("Şehir: " + sehir[skod-1] + " & Plakası: " + skod);