# klavyeden girilen ad soyad bilgisini harf harf yukarıdan aşağı ekrana yazdıran program (Son ifadesi girilenceye kadar çalıştırın)
AdSoyad=raw_input("Kişinin Adı ve Soyadı: ")
for harf in AdSoyad:
print harf
print "\n BİTTİ"
# -*- coding: cp1254 -*-
AdSoyad=raw_input("Kişinin Adı ve Soyadı: ")
while 1:
for harf in AdSoyad:
print harf
AdSoyad=raw_input("Kişinin Adı ve Soyadı: ")
if(AdSoyad=="son"):break
