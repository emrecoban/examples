### MODÜLLER
#--------------------------------------
os #--> işletim sistemi
sys #--> python
math #--> matematiksel
time #--> zaman, tarih
random #--> rastgele sayı
#--------------------------------------
Kullanımı: import os
#--------------------------------------
print os.name #--> işletim sistemi adı
print os.listdir #--> işletim sistemi adı
print os.getcwd #--> işletim sistemi adı
print os.chdir #--> işletim sistemi adı
print os.rmdir #--> işletim sistemi adı
print sys.version #--> python versiyon
print sys.path #--> python dizini
print math.pow(2,3) #--> üs alma
print math.sqrt(9) #--> karekök
print math.pi #--> pi sayısı
#--------------------------------------
for diz in dir(sys):
print diz
#--------------------------------------
print sys.path
print sys.version
print sys.version_info
for eleman in dir(sys):
print eleman
#--------------------------------------
print os.name
print os.getcwd()
p27_dizini=os.listdir("C:/Python27")
print "-- C:/Python27 -- Dizini"
for eleman1 in p27_dizini:
print eleman1
#--------------------------------------
if os.name == "posix":
print "linux"
if os.name == "nt":
print "windows"
if os.name == "mac":
print "macintosh"
#--------------------------------------