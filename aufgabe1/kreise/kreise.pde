/*• Zeichnen Sie drei verschiedene Rechtecke an
verschiedenen Positionen im Fenster mit unterschiedlichen
Füllfarben und unterschiedlichen
Linienfarben.
• Zeichnen Sie drei ineinander geschachtelte
Kreise mit dem gleichen Mittelpunkt und unterschiedlichen
Radien.
• Zeichnen Sie unter Verwendung des line()-
Befehls ein Dreieck. Die Größe des Dreiecks
soll durch eine Variable skalierung einstellbar
sein. */


size(1000, 1000);
for (int i=3; i>=1; i--) {
  ellipseMode(RADIUS);
  fill(0, i*75, 0);
  stroke(0, i*75, 0);
  ellipse(500, 500, i*100, i*100);
}  
