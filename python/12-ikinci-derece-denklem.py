# -*- coding: cp1254 -*-
# 2. derece denklemin çözümünü fonksiyon ve döngülerle yapma
def d_hesapla(a,b,c):
d=(b**2)-(4*a*c)
return d
while 1:
print "Denklemin Katsayılarını Giriniz"
a = input("A Katsayısını girin: ")
if(a==0):break
b = input("B Katsayısını girin: ")
c = input("C Katsayısını girin: ")
d=d_hesapla(a,b,c)
print "Diskriminant Değeri: ",d
if(d<0):
print "Çözüm yoktur, Kökler sanaldır."
elif(d>0):
x1 = (-b-(d**(1/2)))/(2*a)
x2 = (-b+(d**(1/2)))/(2*a)
print "Birinci çözüm değeri: ",x1
print "İkinci çözüm değeri",x2
elif(d==0):
x = (-b)/(2*a)
print "Tek çözüm değeri: ",x
else:
print "Giriş, hesaplama hatası vardır."
