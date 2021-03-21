# --- * --- VİZE & FİNAL NOTU HESAPLAMA (+ELIF) --- * ---
vize = float(input("Vize notunuz:"))
final = float(input("Final notunuz:"))
ort = (vize * 0.20) + (final * 0.80)
print "Ortalamanız:",ort
if(ort<50):print "Başarı durumu:Başarısız, kaldı."
elif(ort>=50) and (ort<=59):print "Başarı durumu:Şartlı, geçer."
elif(ort>=60):print "Başarı durumu:Başarılı, geçer."
