/** //<>//
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
 *1. Hinzufügen der Einträge in die DVD-Sammlung durch addCollection()
 *2. Ausgeben der DVD-Sammlung durch printCollection()
 *3. Ausgeben der Gesamtlaufzeit der DVD-Sammlung mit println(getTotalRuntime())
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
}

/**
 *Prozedur zum Ausgeben der gesamten DVD-Sammlung
 *Keine Eingabe
 *Keine Ausgabe, lediglich ein Drucken der Arrays auf der Konsole
 *
 *printCollection() geht jedes Element beider Arrays durch und gibt diese per println-Befehl
 *auf der Konsole aus. Das ganze passiert per for-Schleife so oft, wie viele Einträge im sind.
 *Pro Schleifendurchgang wird außerdem eine Reihe von Bindestrichen gedruckt, um die Einträge
 *besser zu strukturieren.
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
 *Keine Ausgabe, lediglich eine Veränderung der oben genannten Arrays
 *Fehlermeldung bei Eingabe einer negativen oder =0 Laufzeit
 *Fehlermeldung wenn Anzahl der Titel != Anzahl der Laufzeiten
 *
 *addCollection() überprüft zunächst per if-Schleife, ob die Länge der beiden
 *oben initialisierten Arrays title und runtime kleiner als die Variable count ist,
 *da count die Anzahl der Einträge beschreibt. Ist dies der Fall wird die Prozedur
 *doubleCollection() aufgerufen, die die Länge der Arrays verdoppelt und so mehr
 *Platz für weitere Einträge schafft. Danach wird der neue Eintrag gemacht, 
 *indem die Parameter inputRuntime und inputTitle an die Stelle count im runtime-Array
 *und im title-Array geschrieben wird. Am Ende wird count um 1, da die DVD-Sammlung um 
 *einen Eintrag größer ist.
 *
 */
void addCollection(String inputTitle, int inputRuntime) {

  // Fehlermeldungen
  if (inputRuntime <= 0) {
    throw new IllegalArgumentException("invalid runtime");
  }
  if (title.length != runtime.length) {
    throw new IllegalArgumentException("missing movie information");
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
 *keine Ausgabe, lediglich eine Veränderung der oben genannten Arrays
 *
 *doubleCollection() erstellt jeweils ein neues Array vom Typ String bzw. int (titleNew
 *bzw. runtimeNew) mit der doppelten Länge des oben verwendeten Arrays title bzw runtime.
 *Als nächstes werden alle Elemente des oben verwendeten Arrays in das neu erstellte komplett
 *hineinkopiert. Das alte oben verwendete Array wird nun zum neuen Array mit doppelter Länge.
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
 *
 *getTotalRuntime() initialisiert zunächst die int-Variable total. Als nächstes
 *werden per for-Schleife pro Schleifendurchgang jeweils das nächste Element des
 *Arrays runtime zu dem Wert von total addiert und der Wert von total überschrieben.
 *Dies passiert bis das Ende des Arrays erreicht ist, dann wird total per return-Befehl
 *Ausgegeben.
 */
int getTotalRuntime() {
  int total = 0;
  for (int i : runtime) {
    total += i;
  }
  return total;
}

void testString(String reference, String actual) {
allTestsApproved = allTestsApproved && reference == actual;
}
