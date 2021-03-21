# --- * --- ÜÇ SAYIDAN EN BÜYÜĞÜNÜ BULAN --- * ---
x1 = input("Birinci sayıyı giriniz: ")
x2 = input("İkinci sayıyı giriniz: ")
x3 = input("Üçüncü sayıyı giriniz: ")
EB = x1
Sonuc = "En büyük sayı birinci sayı: "
if(x2 > EB):
EB=x2
Sonuc = "En büyük sayı ikinci sayı: "
if(x3 > EB):
EB=x3
Sonuc = "En büyük sayı üçüncü sayı: "
print Sonuc, EB
