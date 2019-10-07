// Gitter aus Kreisen
int anzahlSpalte = 11;
int anzahlZeile = 11;
size(1000,1000);
ellipseMode(RADIUS);
for(int aktuelleZeile = 0; aktuelleZeile < anzahlZeile; aktuelleZeile++){
  for(int aktuelleSpalte = 0; aktuelleSpalte < anzahlSpalte; aktuelleSpalte++){
    int index = aktuelleZeile*anzahlZeile+aktuelleSpalte;
    int gruen = index%2==0?50:200;
    fill(index*5, gruen,255);
    int abstand = 10*2+5; //Radius*2+Abstand  
    ellipse((aktuelleZeile+1)*abstand,(aktuelleSpalte+1)*abstand,10,10); // +1, da sonst 0*abstand = 0 -> Kreise abgeschnitten
  }
}
