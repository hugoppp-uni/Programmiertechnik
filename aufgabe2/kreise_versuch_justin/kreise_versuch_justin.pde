size(205, 205);
int anzahlSpalten=7;
int anzahlZeilen=5;
ellipseMode(RADIUS);

for (int aktuelleZeile=0; aktuelleZeile<anzahlZeilen; aktuelleZeile++) {
  for (int aktuelleSpalte=0; aktuelleSpalte<anzahlSpalten; aktuelleSpalte++) {
    int index = (aktuelleZeile +1)*anzahlSpalten-anzahlSpalten+(aktuelleSpalte+1);
    fill(5*index, (index-1)%2==0? 50: 200, 255);
    stroke(5*index, (index-1)%2==0? 50: 200, 255);
    ellipse(15+25*aktuelleSpalte, 15+25*aktuelleZeile, 10, 10);
    ellipse(15+25*aktuelleZeile, 15+25*aktuelleSpalte, 10, 10);
    println(index);
  }
}
