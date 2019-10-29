// Debugger
private final boolean TRACE_MODE = true;

void trace(String output) {
  if (TRACE_MODE) {
    println(output);
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

int fibrec(int number) {
  if (number<=0 && number>=47) {
    throw new IllegalArgumentException("n muss >0 sein");
  }

  if (number<=2) {
    return 1;
  } else {
    return fibrec(number-1)+fibrec(number-2);
  }
}




// Fibunacci iterativ

int fibite(int number) {

  int result1 =1;
  int result2 =1;
  int result3 =1;

  if (number<=0 && number>=47) {
    throw new IllegalArgumentException("n muss >0 sein");
  }

  for (int counter=0; counter<(number-2); counter++) {
    result3 = result1+result2;
    result1 = result2;
    result2 = result3;
  }
  return result3;
}
