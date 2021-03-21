# --- * --- VÜCUT KİTLE İNDEKSİ HESAPLAMA (+ELIF) --- * ---
kg = float(input("Kilonuz(kg):"))
boy = float(input("Boyunuz(m):"))
vki = kg / (boy**2)
if(vki<=18):print "Zayıf."
elif(vki>=19) and (vki<=25):print "Normal."
elif(vki>=25) and (vki<=40):print "Şişman."
elif(vki>=41):print "Obez."
