function NotHesap(Viz,Fin)
{
var Onot = ((Viz * 0.4) + (Fin * 0.6));
return Onot;
}
var vize= 0, final= 0;
vize = prompt("Vize notu girin:","55");
final = prompt("Final notu girin:","66");
ort = NotHesap(vize,final)
document.writeln("Ortalama: " + ort);