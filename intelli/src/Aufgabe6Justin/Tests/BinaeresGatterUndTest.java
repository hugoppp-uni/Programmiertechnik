package Aufgabe6Justin.Tests;

import Aufgabe6Justin.BinaeresGatterUnd;
import Aufgabe6Justin.Eingang;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BinaeresGatterUndTest {
  Eingang inputTrue = new Eingang(true);
  Eingang inputFalse = new Eingang(false);

  /**
   * Testet BinaeresGatterUnd
   */
  @Test
  public void testeBinaeresGatterUnd() {
    assertFalse(new BinaeresGatterUnd(inputFalse, inputTrue).getOutput());
    assertFalse(new BinaeresGatterUnd(inputTrue, inputFalse).getOutput());
    assertFalse(new BinaeresGatterUnd(inputFalse, inputFalse).getOutput());
    assertTrue(new BinaeresGatterUnd(inputTrue, inputTrue).getOutput());
  }

  /**
   * Testet toString()
   */
  @Test
  public void testeToString(){
    String ist = new BinaeresGatterUnd(inputFalse, inputTrue).toString();
    String soll = "( FALSCH UND WAHR )";
    assertEquals(soll, ist);
  }
}
