package Aufgabe7Justin;

public class App{
  public static void main(String[] args){
    TolkienFigur figur1 = new TolkienFigur("Legolas", Rasse.ELB);
    TolkienFigur figur2 = new TolkienFigur("Aragorn", Rasse.MENSCH);
    TolkienFigur figur3 = new TolkienFigur("Gimli", Rasse.ZWERG);
    TolkienFigur figur4 = new TolkienFigur("Frodo", Rasse.HOBBIT);

    TolkienFigur figurVergleich = new TolkienFigur("Legolas", Rasse.ELB);

    System.out.println(figur1.getRASSE().toString());
    System.out.println(figur2.getRASSE().toString());
    System.out.println(figur3.getRASSE().toString());
    System.out.println(figur4.getRASSE().toString());

    System.out.println(figur1.toString());
    System.out.println(figur2.toString());
    System.out.println(figur3.toString());
    System.out.println(figur4.toString());

    System.out.println(figur1.equals(figur2));
    System.out.println(figur1.equals(figurVergleich));

    System.out.println(495053715);
    System.out.println(figur1.getRASSE().hashCode());



  }
}
