// Gitter aus Kreisen
void setup () {
  size(2000, 2000);
  ellipseMode(RADIUS);
  rectMode(RADIUS);
  drawgrid(100, 150);
}

void drawgrid(int lns, int clmns) {

  for (int cntln = 0; cntln < lns; cntln++) {             //läuft durch Zeilen
    for (int cntclmn = 0; cntclmn < clmns; cntclmn++) {   //läuft durch Spalten

      int index = cntln*lns+cntclmn;                      //index nummeriert die Kreise von oben links (ab 0) Zeilenweise 
      //int r = index*5<=255?index*5:255;
      int r = (index*5)%255;
      int g = index%2==0?50:200;
      int b = 255;
      fill(r, g, b);                                      //gruen ist 50 wenn gerade, sonst 200

      int d = 10*2+5;                                     //Radius*2+Abstand  
      if (r>128) {                                        //Wenn rot > 128
        rect((cntclmn+1)*d, (cntln+1)*d, 10, 10);         //zeiche Rechteck (+1, da sonst 0*abstand = 0 -> Kreise abgeschnitten)
      } else {
        ellipse((cntclmn+1)*d, (cntln+1)*d, 10, 10);      //zeichne Kreis
      }
    }
  }
}
