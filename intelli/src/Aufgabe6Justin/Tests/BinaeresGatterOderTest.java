package Aufgabe6Justin.Tests;

import Aufgabe6Justin.BinaeresGatterOder;
import Aufgabe6Justin.Eingang;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BinaeresGatterOderTest {
  Eingang inputTrue = new Eingang(true);
  Eingang inputFalse = new Eingang(false);

  /**
   * Testet BinaeresGatterOder
   */
  @Test
  public void testeBinaeresGatterOder() {
    assertTrue(new BinaeresGatterOder(inputFalse, inputTrue).getOutput());
    assertTrue(new BinaeresGatterOder(inputTrue, inputFalse).getOutput());
    assertFalse(new BinaeresGatterOder(inputFalse, inputFalse).getOutput());
    assertTrue(new BinaeresGatterOder(inputTrue, inputTrue).getOutput());
  }

  @Test
  public void testeToString() {

  }

}
