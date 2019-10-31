private final boolean TRACE_MODE =false;
void setup(){
  int x = 25;
  println("Itter: " + berechneFibonacciZahlIter(x));
  println("Rekur: " + berechneFibonacciZahlRec(x));
}

void trace(String ausgabe){
  if (TRACE_MODE){
  println(ausgabe);
  }
}

/* Berechnet die n'te Fibonacci Zahl itterativ
 * Rückgabe als Long
 * 1 < n < 93, sonst IllegalArgumentException
 */

long berechneFibonacciZahlIter(int n){
  
  //Fehlerausgabe, wenn n außerhalb erlaubten Bereich
  if (n <= 1){
    throw new IllegalArgumentException("n muss großer 2 sein!");
  }if (n >= 93){
    throw new IllegalArgumentException("n muss kleiner 93 sein! (Overflow)");
  }
  
  //initialisierung vom Ergebnis //<>//
  long result = 0;
  //"nullte" Ziffer aus der Fibo Reihe
  long result1 = 0;
  //erste Ziffer aus der Fibo Reihe
  long result2 = 1;
  
  for(int i = 1; i < n; i++){
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

/* Berechnet die n'te Fibonacci Zahl rekursiv
 * Rückhabe als Long
 * 0 < n < 40, sonst IllegalArgumentException
 */

long berechneFibonacciZahlRec(int n){
  
  trace("Die Prozedur berechnet gerade Fib(" + n + ")");
  //Fehlerausgabe, wenn n außerhalb erlaubten Bereich
  if (n <= 0){
    throw new IllegalArgumentException("n muss großer 0 sein!");
  }if (n >=40){
    throw new IllegalArgumentException("n muss kleiner 40 sein (Performance)");
  }
  
  //Abbruchbedingung
  if (n <= 2){
    return 1;
  }
  //rek. Selbstaufruf
  return berechneFibonacciZahlRec(n-1) + berechneFibonacciZahlRec(n-2);
}
