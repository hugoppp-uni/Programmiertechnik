// Gitter aus Kreisen
int anzahlSpalte = 7;
int anzahlZeile = 5;
size(1000,1000);
ellipseMode(RADIUS);
for(int aktuelleZeile = 0; aktuelleZeile < anzahlZeile; aktuelleZeile++){
  for(int aktuelleSpalte = 0; aktuelleSpalte < anzahlSpalte; aktuelleSpalte++){
    int index = aktuelleZeile*anzahlZeile+aktuelleSpalte;
    fill(index*5, index%2==0?50:200,255); //gruen ist 50 wenn gerade, sonst 200
    int abstand = 10*2+5; //Radius*2+Abstand  
    ellipse((aktuelleSpalte+1)*abstand,(aktuelleZeile+1)*abstand,10,10); // +1, da sonst 0*abstand = 0 -> Kreise abgeschnitten
  }
}
