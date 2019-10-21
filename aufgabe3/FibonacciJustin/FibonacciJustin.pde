// Debugger
private final boolean TRACE_MODE = true;

void trace(String ausgabe) {
  if (TRACE_MODE) {
    println(ausgabe);
  }
}


void setup () {
  println("Fibunacci rekursiv = " + fibrec(5));
  println("Fibunacci iterativ = " + fibite(5));
} 



// Fibunacci rekursiv

/**
 * Eingabe als integer
 * berechnet die n-te Fibunacci-Zahl rekursiv
 * Rückgabe als integer
 * n muss größer als 0 sein sonst Compiler-Fehler
 */

int fibrec(int n) {
  if (n<=0) {
    throw new IllegalArgumentException("n muss >0 sein");
  }

  if (n<=2) {
    return 1;
  } else {
    return fibrec(n-1)+fibrec(n-2);
  }
}




// Fibunacci iterativ

int fibite(int n) {

int x =1;
int y =1;
int z =1;

  if (n<=0) {
    throw new IllegalArgumentException("n muss >0 sein");
  }

  for (int i=0; i<(n-2); i++) {
    z = x+y;
    x = y;
    y = z;
  }
  return z;
}
