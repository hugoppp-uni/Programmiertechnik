// 3 Kreise zeichnen
size(1000, 1000);
for (int i=3; i>=1; i--) {
  ellipseMode(RADIUS);
  fill(0, i*75, 0);
  stroke(0, i*75, 0);
  ellipse(500, 500, i*100, i*100);
}  
