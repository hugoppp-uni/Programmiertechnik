package Aufgabe7Justin;

/**
 * @author Hugo
 * @author Justin
 * @version 18.12.2019
 */
public class App{
  public static void main(String[] args){
    TolkienFigur figur1 = new TolkienFigur("Legolas", Rasse.ELB);
    TolkienFigur figur2 = new TolkienFigur("Aragorn", Rasse.MENSCH);
    TolkienFigur figur3 = new TolkienFigur("Gimli", Rasse.ZWERG);
    TolkienFigur figur4 = new TolkienFigur("Frodo", Rasse.HOBBIT);

    Menge gemeinschaft1 = new Menge(new Object[1]);
    Menge gemeinschaft2 = new Menge(new Object[1]);
    gemeinschaft1.einfuegen(figur1, figur2);
    gemeinschaft2.einfuegen(figur3, figur4);

    System.out.println(gemeinschaft1.vereinigen(gemeinschaft2).toString());
    System.out.println(gemeinschaft1.schneiden(gemeinschaft2).toString());


  }
}
