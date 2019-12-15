package Aufgabe6Hugo;


public class Main {
  public static void main(String[] args) {
  Eingang f = new Eingang(false);
  Eingang w = new Eingang(true);

  System.out.println( new GatterNicht(w).toString());

  System.out.println( new GatterNicht(new BinaeresGatterOder(w,f)).toString());

  System.out.println( new BinaeresGatterOder( new GatterNicht(w), new GatterNicht(f));

  System.out.println(new GatterNicht(new GatterNicht(w)));

  }
}
