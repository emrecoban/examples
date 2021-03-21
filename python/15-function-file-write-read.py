#Fonksiyonlu kayıt ekleme, silme, düzenleme, arama, listeleme (Tam doğru değil.)
# -*- coding: cp1254 -*-
def Mkayit(kod,ads,adr,tel,bom,ack):
MusDos = open("mus.dat","a")
MusDos.write(kod+" "+ads+" "+adr+" "+tel+" "+bom+" "+ack+"\n")
MusDos.close()
print "\n \n Müşteri Kayıt YAZILDI. \n \n"
def Mara(kelimeara):
    dosyadaara = open("mus.dat", "r")
    for line in dosyadaara:
        if kelimeara in line: print line
            dosyadaara.close()
    print "\n \n Müşteri Kayıt OKUNDU. \n \n"
def Msil(mkelime):
    f = open("mus.dat","r")
    lines = f.readlines()
    f.close()
    f = open("mus.dat","w")
    for line in lines:
        if line!=mkelime+"\n":
            f.write(line)
    f.close()
    print "\n \n Müşteri Kayıt SİLİNDİ. \n \n"
def Mduzelt(mkelimed,kod,ads,adr,tel,bom,ack):
    f = open("mus.dat","r")
    lines = f.readlines()
    f.close()
    f = open("mus.dat","w")
    for line in lines:
        if line!=mkelimed+"\n":
            f.write(line)
        else:
            f.write(kod+" "+ads+" "+adr+" "+tel+" "+bom+" "+ack+"\n")
        f.close()
    print "\n \n Müşteri Kayıt DÜZELTİLDİ. \n \n"