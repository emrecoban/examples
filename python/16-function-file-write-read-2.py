while 1:
print "---MENU---\n //0. Cikis //1. Müşteri Kayıt Yaz //2. Müşteri Ara/Bul Göster //3. Müşteri Kayıt Sil //4. Müşteri Bilgi Düzelt //5. Müşteri Bilgi Listele (Satırsal) //6. Müşteri Bilgi Listele (Tam Ekran)"
sec = input("Menüden bir seçenek giriniz:")
if sec == 0:break
if sec == 1:
print "Müşteri Bilgilerini Giriniz:"
kod = raw_input("Müşteri Kodu..........:")
ads = raw_input("Müşteri Adı Soyadı....:")
adr = raw_input("Müşteri Adresi........:")
tel = raw_input("Müşteri Telefon.......:")
bom = raw_input("Borç Miktari..........:")
ack = raw_input("Açıklama..............:")
Mkayit(kod,ads,adr,tel,bom,ack)

sor = raw_input("Menü için ENTER tuşlayınız:")
pass
if sec == 2:
kelimeara = raw_input("Aramak istediğiniz kelime:")
Mara(kelimeara)

sor = raw_input("Menü için ENTER tuşlayınız:")
pass
if sec == 3:
mkelime = raw_input("Silmek istediğiniz müşteri:")
Msil(mkelime)

sor = raw_input("Menü için ENTER tuşlayınız:")
pass
if sec == 4:
mkelimed = raw_input("Düzeltmek istediğiniz müşteri:")
print "Müşteri Bilgilerini Giriniz:"
kod = raw_input("Müşteri Kodu..........:")
ads = raw_input("Müşteri Adı Soyadı....:")
adr = raw_input("Müşteri Adresi........:")
tel = raw_input("Müşteri Telefon.......:")
bom = raw_input("Borç Miktari..........:")
ack = raw_input("Açıklama..............:")
Mduzelt(mkelimed,kod,ads,adr,tel,bom,ack)
sor = raw_input("Menü için ENTER tuşlayınız:")
pass
if sec == 5:
f = open("mus.dat","r")
lines = f.readlines()
for line in lines:
print line
f.close()
print "\n \n Müşteri Kayıtları LİSTELENDİ.(SATIRSAL) \n \n"

sor = raw_input("Menü için ENTER tuşlayınız:")
pass


if sec == 6:
KulDos = open("mus.dat","r")
oku = KulDos.read()
print oku
KulDos.close()
print "\n \n Müşteri Kayıtları LİSTELENDİ.(TAM EKRAN) \n \n"
sor = raw_input("Menü için ENTER tuşlayınız:")
pass
else:
print "Böyle bir seçenek yok ki?"
sor = raw_input("Menü için ENTER tuşlayınız:")
pass
print "PROGRAM BİTTİ"