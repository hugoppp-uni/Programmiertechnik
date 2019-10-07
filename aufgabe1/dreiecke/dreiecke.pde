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

size(1000,1000); 
int scale = -100;

line(500,500-scale, 500-scale, 500+scale);
line(500,500-scale, 500+scale, 500+scale);
line(500+scale, 500+scale, 500-scale, 500+scale);
