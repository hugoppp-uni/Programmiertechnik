private final boolean TRACE_MODE =false; //<>//
boolean alleTestsErfolgreich=true;

void setup() {
  int x = 39;
  println("Itter: " + berechneFibonacciZahlIter(x));
  println("Rekur: " + berechneFibonacciZahlRec(x));
  testeBerechneFibonacciZahlRec();
}

void trace(String ausgabe) {
  if (TRACE_MODE) {
    println(ausgabe);
  }
}

/** 
 * Berechnet die n'te Fibonacci Zahl itterativ, gibt diese zurück
 * 1 < n < 93, sonst IllegalArgumentException
 */

long berechneFibonacciZahlIter(int n) {

  //Fehlerausgabe, wenn n außerhalb erlaubten Bereich
  if (n <= 1) {
    throw new IllegalArgumentException("n muss großer 1 sein!");
  }
  if (n >= 93) {
    throw new IllegalArgumentException("n muss kleiner 93 sein! (Overflow)");
  }

  //initialisierung vom Ergebnis
  long result = 1;
  //"nullte" Ziffer aus der Fibo Reihe
  long result1 = 1;
  //erste Ziffer aus der Fibo Reihe
  long result2 = 1;

  for (int i = 2; i < n; i++) {
    //Ergebniss aus den beiden Vorgängern errechnen
    result = result1 + result2;
    //Vorgänger aktualisieren
    result1=result2;
    result2=result;

    trace("Die Prozedur berechnet gerade Fib(" + (i+1) + ") = " + result);
  }
  trace("Das Ergebis von Fibbonachi Itterativ von n = " + n + " ist: " + result);
  return result;
}

/**
 * Berechnet die n'te Fibonacci Zahl rekursiv, gibt diese zurück
 * 0 < n < 40, sonst IllegalArgumentException
 */

long berechneFibonacciZahlRec(int n) {

  trace("Die Prozedur berechnet gerade Fib(" + n + ")");
  //Fehlerausgabe, wenn n außerhalb erlaubten Bereich
  if (n <= 0) {
    throw new IllegalArgumentException("n muss großer 0 sein!");
  }
  if (n >=40) {
    throw new IllegalArgumentException("n muss kleiner 40 sein (Performance)");
  }
  
  //Abbruchbedingung
  if (n <= 2) {
    return 1;
  }
  //rek. Selbstaufruf
  return berechneFibonacciZahlRec(n-1) + berechneFibonacciZahlRec(n-2);
}
/**
 *
 */
void testeLong(long soll, long ist){
  alleTestsErfolgreich = alleTestsErfolgreich && soll == ist;
}

/**
 * testet Prozedur berechneFibonacciZahlRec
 *
 */ 
void testeBerechneFibonacciZahlRec() {
  testeLong(berechneFibonacciZahlRec(2),1);
  testeLong(berechneFibonacciZahlRec(35),9227465);
  testeLong(berechneFibonacciZahlRec(39),63245986);
  println(alleTestsErfolgreich? "test erfolgreich" : "test nicht erfolgreich");
}
