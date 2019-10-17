int[] laufzeit = new int[0];
String[] titel = new String[0];

void setup(){
hinzufuegen(55,"test");
sammlungAusgeben();
}


  /** Prozedur gibt die DVD Sammlung auf der Konsole aus.
   **/
void sammlungAusgeben(){
  for(int i = 0; i < titel.length; i++){
    println(titel[i]);
  }
}

  /** Prozedur zum hinzufügen eines Titels und der korospondierenen Laufzeit
    * Parameter: int: Laufzeit, String: Titel
    * Die Prozedur erweitert jeweils das Array Laufzeit, Titel um 1, und speichert 
    * in  diese den Inhalt der übergebenen Parameter.
    */

void hinzufuegen(int eingabeLaufzeit, String eingabeTitel){
  if (laufzeit.length != titel.length){
    println("Error, Anzahl titel != Anzahl Laufzeit");
  } else {
    int[] laufzeitNeu = new int[laufzeit.length+1];                //Neues array mit länge +1  //<>//
    System.arraycopy(laufzeit ,0,laufzeitNeu,0,laufzeit.length);   //kopieren des alten ins neue 
    laufzeit[laufzeitNeu.length-1] = eingabeLaufzeit;              //Schreiben der Neuen Zeit
    laufzeit = laufzeitNeu; 
    
    String[] titelNeu = new String[titel.length+1];
    System.arraycopy(titel ,0,titelNeu,0,titel.length);   //kopieren des alten ins neue 
    titel[titelNeu.length-1] = eingabeTitel;              //Schreiben der Neuen Zeit
    titel = titelNeu;   
  }
}


void getLaufzeit(){

}
