package Aufgabe7Hugo;

public class Main {
  public static void main(String[] args) {
    Menge menge1 = new Menge();
    menge1.einfuegen(new TolkienFigur("Elb1", Rasse.ELB));
    menge1.einfuegen(new TolkienFigur("Elb2", Rasse.ELB));
    menge1.einfuegen(new TolkienFigur("Mensch1", Rasse.MENSCH));
    menge1.einfuegen(new TolkienFigur("Mensch2", Rasse.MENSCH));
    menge1.einfuegen(new TolkienFigur("Mensch3", Rasse.MENSCH));
    menge1.einfuegen(new TolkienFigur("Hobbit1", Rasse.HOBBIT));
    menge1.einfuegen(new TolkienFigur("Hobbit2", Rasse.HOBBIT));
    menge1.einfuegen(new TolkienFigur("Hobbit3", Rasse.HOBBIT));

    System.out.println(menge1.toString());
  }
}
