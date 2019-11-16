private final boolean TRACE_MODE = false; //<>//

/**
 *Initialisierung zweier Arrays:
 * -vom Typ String für die Liste der Filmtitel
 * -vom Typ int für die Liste der Filmlaufzeiten
 */
String[] title = new String[1];
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

/**
 *addCollection(): Hinzufügen der Einträge in die DVD-Sammlung
 *printCollection(): Ausgeben der DVD-Sammlung
 *println(getTotalRuntime()): Ausgeben der Gesamtlaufzeit der DVD-Sammlung
 *testAddCollection(): Testprozedur von addCollection()
 */
void setup() {
  addCollection("Der Herr der Ringe: Die Rückkehr des Königs", 200);
  addCollection("Good Will Hunting", 126);
  addCollection("The Dark Knight", 152);
  addCollection("The Shawshank Redemption", 142);
  addCollection("Pulp Fiction", 178);
  addCollection("Fight Club", 151);
  addCollection("The Matrix", 150);
  addCollection("Saw", 103);

  printCollection();

  println("\ntotal collection runtime: " + getTotalRuntime() + " min / ~" + getTotalRuntime()/60 + " hrs");

  if (TRACE_MODE) {
    testAddCollection("Max Mustermann, der Film", 1337);
    testDoubleCollection();
    testGetTotalRuntime();

    println("\ntested and approved: " + allTestsApproved);
  } else {
    println("\n! not tested yet");
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
    println(title[i] + ": " + runtime[i] + " min");
  }
}

/**
 *Prozedur zum Hinzufügen eines Eintrags in die DVD-Sammlung
 *Eingabe des Filmtitels als Typ String
 *Eingabe der Filmlaufzeit als Typ int
 *Keine Ausgabe
 *Fehlermeldung bei Eingabe einer negativen oder =0 Laufzeit und bei leerem String
 *Fehlermeldung wenn Anzahl der Titel != Anzahl der Laufzeiten
 *Fehlermeldung wenn ein nicht referenzierter String übergeben wird
 */
void addCollection(String inputTitle, int inputRuntime) {

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
 *Testet addCollection()
 *Eingabe String und int
 *Keine Ausgabe
 */
void testAddCollection(String referenceTitle, int referenceRuntime) {
  addCollection(referenceTitle, referenceRuntime);
  if (!(referenceTitle.equals(title[count-1])
    && referenceRuntime == runtime[count-1]
    && allTestsApproved)) {
    allTestsApproved = false;
  }
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
 *Testet getTotalRuntime()
 *Keine Eingabe
 *Keine Ausgabe
 */
void testGetTotalRuntime() {
  int testTotal = 0;
  for (int i : runtime) {
    testTotal += i;
  }
  if (!(getTotalRuntime() == testTotal
    && allTestsApproved)) {
    allTestsApproved = false;
  }
}
