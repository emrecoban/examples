# Öğrencinin klavyeden numarası, adı soyadı, ders adı, vize, final not bilgisi girilecek ve öğrencinin bilgileri ile hesaplanan ortalama bilgisi sonucu çıkacak, öğrenci numarası "0" girilene kadar devam edecek.

# -*- coding: cp1254 -*-
while 1: 
OgrNo=raw_input("Öğrencinin numarası: ")
if(OgrNo=="0"):break
AdSoyad=raw_input("Öğrencinin Adı ve Soyadı: ")
Ders=raw_input("Ders Adı: ")
Vize=float(input("Vize Notu: "))
Final=float(input("Final Notu: "))
ort = (Vize * 0.20) + (Final * 0.80)
print "Öğrenci Ortalaması: ",ort
if(ort<50):print "Başarı durumu:Başarısız, kaldı."
elif(ort>=50) and (ort<=59):print "Başarı durumu:Şartlı, geçer."
elif(ort>=60):print "Başarı durumu:Başarılı, geçer."
print "\n BİTTİ"
