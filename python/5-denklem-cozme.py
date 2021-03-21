# --- * --- FORMÜL KULLANARAK DENKLEM ÇÖZME (+ELIF) --- * ---
A = input("Lütfen A katsayısını giriniz: ")
B = input("Lütfen B katsayısını giriniz: ")
C = input("Lütfen C katsayısını giriniz: ")
D=(B**2)-(4*A*C)
print "Çözüm kontrol değeri, Delta: ",D
if(D>0):
x1 = (-B-(D**(1/2)))/(2*A)
x2 = (-B+(D**(1/2)))/(2*A)
print "Birinci çözüm kökü: ",x1
print "İkinci çözüm kökü: ",x2
elif(D==0):
x = (-B)/(2*A)
print "Tek çözüm kökü: ",x
elif(D<0):
print "Gerçek kök yoktur."
