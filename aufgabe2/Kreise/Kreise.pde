// Gitter aus Kreisen
int anzahlSpalte = 15;
int anzahlZeile = 10;

size(1000,1000);
ellipseMode(RADIUS);
rectMode(RADIUS);



for(int aktuelleZeile = 0; aktuelleZeile < anzahlZeile; aktuelleZeile++){         //läuft durch Zeilen
  for(int aktuelleSpalte = 0; aktuelleSpalte < anzahlSpalte; aktuelleSpalte++){   //läuft durch Spalten
 
    int index = aktuelleZeile*anzahlZeile+aktuelleSpalte;                 //index nummeriert die Kreise von oben links (ab 0) Zeilenweise 
    //int red = index*5<=255?index*5:255;
    int red = (index*5)%255;
    int green = index%2==0?50:200;
    int blue = 255;
    fill(red, green, blue);                                                       //gruen ist 50 wenn gerade, sonst 200
    
    int abstand = 10*2+5;                                                         //Radius*2+Abstand  
    if (red>128){                                                             //Wenn rot > 128
      rect((aktuelleSpalte+1)*abstand,(aktuelleZeile+1)*abstand,10,10);           //zeiche Rechteck (+1, da sonst 0*abstand = 0 -> Kreise abgeschnitten)
    }else{
      ellipse((aktuelleSpalte+1)*abstand,(aktuelleZeile+1)*abstand,10,10);        //zeichne Kreis
    }
  }
}
