private final boolean TRACE_MODE = true;
void setup(){
  //int x = 3;
  //println("Itter: " + berechneFibonacciZahlIter(x));
  //println("Rekur: " + berechneFibonacciZahlRec(x));
 berechneFibonacciZahlIter(5);
 //berechneFibonacciZahlRec(5);
}

void trace(String ausgabe){
  if (TRACE_MODE){
  println(ausgabe);
  }
}

/* Berechnet die n'te Fibonacci Zahl itterativ
 * Rückgabe als Integer
 * n muss größer als 2 sein, sonst IllegalArgumentException
 */

int berechneFibonacciZahlIter(int n){
  if (n <= 2){
    throw new IllegalArgumentException("n muss großer 2 sein!");
  }
  int result = 0;
  int result1 = 0;
  int result2 = 1;
  for(int i = 1; i < n; i++){
    trace("Die Prozedur berechnet gerade Fib(" + (i) + ")");
    result = result1 + result2;
    result1=result2;
    result2=result;
  }
  trace("Das Ergebis von Fibbonachi Itterativ von n = " + n + " ist: " + result);
  return result; 
} //<>//

/* Berechnet die n'te Fibonacci Zahl rekursiv
 * Rückhabe als Integer
 * n muss größer als 0 sein, sonst IllegalArgumentException
 */

int berechneFibonacciZahlRec(int n){
  trace("Die Prozedur berechnet gerade Fib(" + n + ")"); //<>//
  if (n <= 0){
    throw new IllegalArgumentException("n muss großer 0 sein!");
  }
  if (n <= 2){
    return 1;
  }
  return berechneFibonacciZahlRec(n-1) + berechneFibonacciZahlRec(n-2);
}
