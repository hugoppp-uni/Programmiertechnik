// Gitter aus Kreisen
int anzahlSpalte = 50;
int anzahlZeile = 50;
size(1000,1000);
ellipseMode(RADIUS);
for(int aktuelleZeile = 0; aktuelleZeile < anzahlZeile; aktuelleZeile++){
  for(int aktuelleSpalte = 0; aktuelleSpalte < anzahlSpalte; aktuelleSpalte++){
    ellipse(0+(aktuelleZeile+1)*(10*2+5),0+(aktuelleSpalte+1)*(10*2+5),10,10); // y-Koordinate 10=Radius, 5=Abstand 
  }
}
