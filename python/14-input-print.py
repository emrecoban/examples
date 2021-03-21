#Girilen bilgileri OKUMA ve YAZMA uygulaması (Seçenekli)
while 1:
print "---MENU---\n //0. Cikis //1. Yaz //2. Oku"
sec = input("Menüden bir seçenek giriniz:")
if sec == 0:break
if sec == 1:
print "Sunucunun Kullanıcı Bilgilerini Giriniz"
kul = raw_input("Kullanıcı İsmi........:")
sfr = raw_input("Kullanıcı Şifresi.....:")
mad = raw_input("Mail Adresi...........:")
ads = raw_input("Kullanıcı Adı Soyadı..:")
unv = raw_input("Kullanıcı Ünvanı......:")
KulDos = open("sunucu.dat","a")
KulDos.write(kul+" "+sfr+" "+mad+" "+ads+" "+unv+"\n")
KulDos.close()
print "\n \n Kayıt YAZILDI. \n \n"
sor = raw_input("Menü için ENTER tuşlayınız:")
pass
if sec == 2:
KulDos = open("sunucu.dat","r")
oku = KulDos.read()
print oku
KulDos.close()
print "\n \n Kayıt OKUNDU. \n \n"
sor = raw_input("Menü için ENTER tuşlayınız:")
pass
print "PROGRAM BİTTİ"