package Aufgabe7Justin;

public class App{
  public static void main(String[] args){
    TolkienFigur figur1 = new TolkienFigur("Legolas", Rasse.ELB);
    TolkienFigur figur2 = new TolkienFigur("Aragorn", Rasse.MENSCH);
    TolkienFigur figur3 = new TolkienFigur("Gimli", Rasse.ZWERG);
    TolkienFigur figur4 = new TolkienFigur("Frodo", Rasse.HOBBIT);

    Menge gemeinschaft = new Menge(new Object[1]);
    gemeinschaft.einfuegen(figur1, figur2, figur3, figur2, figur1, figur2);


    System.out.println(gemeinschaft.toString());
  }
}
