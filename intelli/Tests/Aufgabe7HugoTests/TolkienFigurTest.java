package Aufgabe7HugoTests;

import Aufgabe7Hugo.Rasse;
import Aufgabe7Hugo.TolkienFigur;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TolkienFigurTest {
  @Test
  public void testeEquals() {

    TolkienFigur elb = new TolkienFigur("Elb", Rasse.ELB);

    TolkienFigur elbDerZweite = new TolkienFigur("Elb", Rasse.ELB);
    TolkienFigur elbAndererName = new TolkienFigur("doch kein Elb", Rasse.ELB);
    TolkienFigur elbAndereRase = new TolkienFigur("Elb", Rasse.MENSCH);
    TolkienFigur zwerg = new TolkienFigur("Zweg", Rasse.ZWERG);

    assertEquals(elb, elbDerZweite);
    assertNotEquals(elb, elbAndererName);
    assertNotEquals(elb, elbAndereRase);
    assertNotEquals(elb, zwerg);
  }

  @Test
  public void testeToString() {
    assertEquals(new TolkienFigur("Elb", Rasse.ELB).toString(), "Tolkien Figur: Elb (Rasse: Elb)");
  }
  //TODO testeHashCode() ???
}
