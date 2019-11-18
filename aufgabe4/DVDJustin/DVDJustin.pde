private final boolean TRACE_MODE = true; //<>// //<>//

/**
 *Deklaration und Initialisierung eines Arrays
 *vom Typ String für die Liste der Filmtitel
 */
String[] title = new String[1];

/**
 *Deklaration und Initialisierung eines Arrays
 *vom Typ int für die Liste der Filmlaufzeiten
 */
int[] runtime = new int[1];

/**
 *Initialisierung der Variable "count" vom Typ int,
 *die dokumentiert, wie viele Einträge sich in der
 *Sammlung befinden
 */
int count = 0;

/**
 *Initialisierung der globalen Variable allTestsApproved vom Typ 
 *boolean für spätere Testprozeduren
 */
boolean allTestsApproved = true;

void setup() {
  addToCollection("Der Herr der Ringe: Die Rückkehr des Königs", 200);
  addToCollection("Good Will Hunting", 126);
  addToCollection("The Dark Knight", 152);
  addToCollection("The Shawshank Redemption", 142);
  addToCollection("Pulp Fiction", 178);
  addToCollection("Fight Club", 151);
  addToCollection("The Matrix", 150);
  addToCollection("Saw", 103);
  
  printCollection();
  
  println("\ntotal collection runtime: " + getTotalRuntime() + " min / ~" + getTotalRuntime()/60 + " hrs");
  
  println("runtime = " + getRuntime("Saw"));

  if (TRACE_MODE) {
    testCollection();
    println("\ntested and approved: " + allTestsApproved);
  }
}

/**
 *Prozedur zum Ausgeben der gesamten DVD-Sammlung
 *Keine Eingabe
 *Keine Ausgabe
 */
void printCollection() {
  for (int i=0; i<count; i++) {
    println("-------------");
    println(i+1 + " " + title[i] + ": " + runtime[i] + " min");
  }
}

/**
 *Prozedur zum Hinzufügen eines Eintrags in die DVD-Sammlung
 *Eingabe des Filmtitels als Typ String
 *Eingabe der Filmlaufzeit als Typ int
 *Keine Ausgabe
 *Fehlermeldung bei Eingabe einer negativen oder =0 Laufzeit und bei leerem String
 *Fehlermeldung wenn Länge von title != Länge von runtime
 *Fehlermeldung wenn ein nicht referenzierter String übergeben wird
 */
void addToCollection(String inputTitle, int inputRuntime) {

  // Fehlermeldungen
  if (inputRuntime <= 0 | inputTitle.equals("")) {
    throw new IllegalArgumentException("invalid input");
  }
  if (title.length != runtime.length) {
    throw new IllegalArgumentException("missing movie information");
  }
  if (title == null) {
    throw new IllegalArgumentException("title can't be null");
  }

  if (count >= runtime.length) {
    doubleCollection();
  }

  runtime[count] = inputRuntime;
  title[count] = inputTitle;
  count++;
}

/**
 *Prozedur zum Verdoppeln der beiden Arrays runtime und title
 *keine Eingabe
 *keine Ausgabe
 */
void doubleCollection() {
  String[] titleNew = new String[title.length*2];
  System.arraycopy(title, 0, titleNew, 0, title.length);
  title = titleNew;

  int[] runtimeNew = new int[runtime.length*2];
  System.arraycopy(runtime, 0, runtimeNew, 0, runtime.length);
  runtime = runtimeNew;
}

/**
 *Prozedur zum Berechnen der Gesamtlaufzeit der DVD-Sammlung
 *keine Eingabe
 *Ausgabe als Typ int
 */
int getTotalRuntime() {
  int total = 0;
  for (int i : runtime) {
    total += i;
  }
  return total;
}

// Testprozeduren

/**
 *Testet addToCollection()
 *Eingabe String und int
 *Keine Ausgabe
 */
void testCollection() {

  // Neue leere Sammlung
  title = new String[1];
  runtime = new int[1];
  count = 0;
  // Test: eine DVD einfügen
  addToCollection("Moin Moin", 69);
  allTestsApproved = "Moin Moin".equals(title[count-1])
    && 69 == runtime[count-1]
    && allTestsApproved;

  // Test: Einfügen mit Verdoppeln
  addToCollection("Moin Moin der zweite", 92);
  allTestsApproved = "Moin Moin der zweite".equals(title[count-1])
    && 92 == runtime[count-1]
    && allTestsApproved; 

  // Test: n'te DVD
  addToCollection("Moin Moin der dritte", 93);
  addToCollection("Moin Moin der vierte", 94);
  addToCollection("Moin Moin der fünfte", 95);
  addToCollection("Moin Moin der sechste", 96);
  allTestsApproved = "Moin Moin der sechste".equals(title[count-1])
    && 96 == runtime[count-1]
    && allTestsApproved;
    
  // Teste Runtime
  allTestsApproved = 539 == getTotalRuntime()
    && allTestsApproved;
   
}

/**
 *Testet doubleCollection()
 *Eingabe String und int
 *Keine Ausgabe
 */
void testDoubleCollection() {
  int testRuntimeLength = runtime.length;
  int testTitleLength = title.length;
  doubleCollection();
  if (!(2*testRuntimeLength == runtime.length
    && 2*testTitleLength == title.length)) {
    allTestsApproved = false;
  }
}

/**
 *Prozedur zum Entfernen eines Eintrags in die DVD-Sammlung
 *Eingabe als int
 *Keine Ausgabe
 *Fehlermeldung bei Eingabe einer negativen oder =0 Zahl
 *Fehlermeldung wenn Anzahl der Titel != Anzahl der Laufzeiten
 *Fehlermeldung wenn eingegebener Index nicht als Eintrag existiert
 */
void removeFromCollection(int index) {

  // Fehlermeldungen
  if (index <= 0) {
    throw new IllegalArgumentException("invalid input");
  }
  if (title.length != runtime.length) {
    throw new IllegalArgumentException("missing movie information");
  }
  if (index > runtime.length | index > title.length) {
    throw new IllegalArgumentException("entry not found");
  }

  int[] runtimeNew = new int[runtime.length-1];
  String[] titleNew = new String[title.length-1];

  for (int i = 0; i<index-1; i++) {
    runtimeNew[i] = runtime[i];
    titleNew[i] = title[i];
  }
  for (int i = index; i<runtime.length; i++) {
    runtimeNew[i-1] = runtime[i];
    titleNew[i-1] = title[i];
  }

  runtime = runtimeNew;
  title = titleNew;
  count--;
}

/**
 *Prozedur zur Ausgabe der Laufzeit eines Titels
 *Eingabe Titel als String
 *Ausgabe der Laufzeit als int
 *Fehlermeldung falls so ein Titel nicht vorhanden
 */
int getRuntime(String inputTitle) {
  for (int i = 0; i < count; i++) {
    if (title[i].equals(inputTitle)) {
      return runtime[i];
    }
  }
  throw new IllegalArgumentException(inputTitle + " not found");
}
