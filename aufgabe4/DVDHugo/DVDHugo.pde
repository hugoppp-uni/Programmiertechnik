int[] laufzeit = new int[0];
String[] titel = new String[0];

void setup(){
hinzufuegen(55,"Deutschstunde");
hinzufuegen(92,"Joker");
hinzufuegen(128, "Der König der Löwen");
hinzufuegen(134,"Downton Abbey");
hinzufuegen(73,"Ugly Dolls");
sammlungAusgeben();
println("\nGesammte Laufzeit in minuten: " + getLaufzeit());
}


  /** Prozedur gibt die DVD Sammlung auf der Konsole aus.
   **/
void sammlungAusgeben(){
  for(int i = 0; i < titel.length; i++){
    println("Titel: " + titel[i]);
    println("Laufzeit: " + laufzeit[i]);
    println("--------------");
  }
}

  /** Prozedur zum hinzufügen eines Titels und der korospondierenen Laufzeit
    * Parameter: int: Laufzeit, String: Titel
    * Die Prozedur erweitert jeweils das Array Laufzeit, Titel um 1, und speichert 
    * in  diese den Inhalt der übergebenen Parameter.
    */

void hinzufuegen(int eingabeLaufzeit, String eingabeTitel){
  if (laufzeit.length != titel.length){                            //Testet ob die Anzahl an Titel= Anz. an Laufzeiten
    println("Error, Anzahl titel != Anzahl Laufzeit");
  } else {
    int[] laufzeitNeu = new int[laufzeit.length+1];                //Neues array mit länge +1 vom alten //<>//
    System.arraycopy(laufzeit, 0, laufzeitNeu, 0, laufzeit.length);   //kopieren des alten ins neue 
    laufzeitNeu[laufzeitNeu.length-1] = eingabeLaufzeit;              //Schreiben der Neuen Zeit
    laufzeit = laufzeitNeu; 
    
    String[] titelNeu = new String[titel.length+1];
    System.arraycopy(titel, 0, titelNeu, 0, titel.length);   //kopieren des alten ins neue 
    titelNeu[titelNeu.length-1] = eingabeTitel;              //Schreiben der Neuen Zeit
    titel = titelNeu;   
  }
}


int getLaufzeit(){
  int summe = 0;
  for(int i :  laufzeit){
    summe += i;
  }
  return summe;
}
