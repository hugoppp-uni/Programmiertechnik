package Aufgabe7HugoTests;

import Aufgabe7Hugo.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MengeTest {

  @Test
  public void testeBeinhaltet() {
    Menge menge = new Menge();
    menge.einfuegen("1");
    assertTrue(menge.beinhaltet("1"));
    //testet, ob im Fall der Verdopplung alles richtig abläuft
    for (int i = 0; i < 50; i++) {
      menge.einfuegen(i);
      assertTrue(menge.beinhaltet(i));
    }
  }

  @Test
  public void testeEinfuegen() {
    Menge menge1 = new Menge();

    menge1.einfuegen("1");
    menge1.einfuegen("2");
    menge1.einfuegen("3");
    assertEquals(3, menge1.getAnzElemente());
    //testet, ob eine Exception geworfen wird, wenn das Element bereits existiert
    try {
      menge1.einfuegen("3");
      fail("es wurde keine Exception geworfen");
    } catch (IllegalArgumentException exception) {
      assertTrue(true);
    }

    assertEquals(3, menge1.getAnzElemente());
    assertTrue(menge1.beinhaltet("1"));
    assertTrue(menge1.beinhaltet("2"));
    assertTrue(menge1.beinhaltet("3"));

    menge1.einfuegen("4", "5");

    assertEquals(5, menge1.getAnzElemente());
    assertTrue(menge1.beinhaltet("1"));
    assertTrue(menge1.beinhaltet("2"));
    assertTrue(menge1.beinhaltet("3"));
    assertTrue(menge1.beinhaltet("4"));
    assertTrue(menge1.beinhaltet("5"));
  }

  @Test
  public void testeSchnitt() {
    Menge menge1 = new Menge();
    Menge menge2 = new Menge();

    menge1.einfuegen("1");
    menge1.einfuegen("2");

    menge2.einfuegen("1");
    menge2.einfuegen("3");
    menge2.einfuegen("4");

    Menge schnitt = menge1.schnitt(menge2);
    assertEquals(1, schnitt.getAnzElemente());
    assertFalse(schnitt.beinhaltet("2"));
    assertFalse(schnitt.beinhaltet("3"));
    assertFalse(schnitt.beinhaltet("4"));
    assertTrue(schnitt.beinhaltet("1"));
  }

  @Test
  public void testeVereinigun() {
    Menge menge1 = new Menge();
    Menge menge2 = new Menge();

    menge1.einfuegen("1");
    menge1.einfuegen("2");

    menge2.einfuegen("1");
    menge2.einfuegen("3");
    menge2.einfuegen("4");

    Menge vereinigung = menge1.vereinigung(menge2);
    assertEquals(4, vereinigung.getAnzElemente());
    assertTrue(vereinigung.beinhaltet("1"));
    assertTrue(vereinigung.beinhaltet("2"));
    assertTrue(vereinigung.beinhaltet("3"));
    assertTrue(vereinigung.beinhaltet("4"));
  }

}
