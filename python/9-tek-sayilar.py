# Klavyeden girilen ve 100'den küçük sayıya kadar tek sayıları yazdıran program.
 # -*- coding: cp1254 -*-
n=input("Lütfen 1 ile 100 arasında bir sayı giriniz:")
if(n>=1 and n<=100):
a=1
while(a<=n):
print a
a=a+2
else:print "Geçersiz sayı girildi."

print "\n BİTTİ"
