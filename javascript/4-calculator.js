var sy1 = prompt("İlk sayıyı girin:");
var sy2 = prompt("İkinci sayıyı girin:");
var islem = prompt("İşlem seçimi yapınız:\n1. Toplama\n2. Çıkarma\n3. Çarpma\n4. Bölme\n5. Üs Alma");
var toplama = Number(sy1) + Number(sy2);
var cikarma = Number(sy1) - Number(sy2);
var carpma = Number(sy1) * Number(sy2);
var bolme = Number(sy1) / Number(sy2);
var us = Math.pow(Number(sy1),Number(sy2));
if(islem==1){
document.writeln("<b>Seçtiğiniz işlem türü:</b> Toplama");
document.write("<b>Toplama işlemi sonucu:</b> " + toplama);
}else if(islem==2){
document.writeln("<b>Seçtiğiniz işlem türü:</b> Çıkarma");
document.write("<b>Çıkarma işlemi sonucu:</b> " + cikarma);
}else if(islem==3){
document.writeln("<b>Seçtiğiniz işlem türü:</b> Çarpma");
document.write("<b>Çarpma işlemi sonucu:</b> " + carpma);
}else if(islem==4){
document.writeln("<b>Seçtiğiniz işlem türü:</b> Bölme");
document.write("<b>Bölme işlemi sonucu:</b> " + bolme);
}else if(islem==5){
document.writeln("<b>Seçtiğiniz işlem türü:</b> Üs Alma");
document.write("<b>Üs işlemi sonucu:</b> " + us);
}else{
document.write("<b><font color=red>Yanlış işlem değeri girdiniz, lütfen sayfayı yenileyin!</font></b>");
}