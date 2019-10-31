int[] laufzeit = new int[4];
String[] titel = new String[4];
int anzahl = 0;

void setup(){
hinzufuegen(55,"Deutschstunde");
hinzufuegen(92,"Joker");
hinzufuegen(128, "Der König der Löwen");
hinzufuegen(134,"Downton Abbey");
hinzufuegen(73,"Ugly Dolls");
sammlungAusgeben();
println("\nGesammte Laufzeit von " + anzahl + " Titeln in Stunden: " + getLaufzeit()/60);
}


  /** Prozedur gibt die DVD Sammlung auf der Konsole aus.
   **/
void sammlungAusgeben(){
  for(int i = 0; i < titel.length; i++){
      if (laufzeit[i] > 0){
      println("Titel: " + titel[i]);
      println("Laufzeit: " + laufzeit[i] + " Minuten");
      println("--------------");
    }
  }
}

  /** Prozedur zum hinzufügen eines Titels und der korospondierenen Laufzeit
    * Parameter: int: Laufzeit, String: Titel
    * Die Prozedur erweitert jeweils das Array Laufzeit, Titel um 1, und speichert 
    * in  diese den Inhalt der übergebenen Parameter.
    */

void hinzufuegen(int eingabeLaufzeit, String eingabeTitel){
  
  //Testet ob die Anzahl an Titel = Anz. an Laufzeiten
  if (laufzeit.length != titel.length){                           
    throw new IllegalArgumentException("Error, Anzahl titel != Anzahl Laufzeit");
  }
  
  if (anzahl >= laufzeit.length){
    int[] laufzeitNeu = new int[laufzeit.length*2];                //<>//
    System.arraycopy(laufzeit, 0, laufzeitNeu, 0, laufzeit.length);   
    laufzeit = laufzeitNeu;
    
    String[] titelNeu = new String[titel.length*2];
    System.arraycopy(titel, 0, titelNeu, 0, titel.length);   //kopieren des alten ins neue 
    titel = titelNeu;  
  }
  
  laufzeit[anzahl] = eingabeLaufzeit;
  titel[anzahl] = eingabeTitel;
  
  anzahl++;
}


int getLaufzeit(){
  int summe = 0;
  for(int i :  laufzeit){
    summe += i;
  }
  return summe;
}
