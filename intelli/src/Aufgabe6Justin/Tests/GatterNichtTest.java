package Aufgabe6Justin.Tests;

import Aufgabe6Justin.Eingang;
import Aufgabe6Justin.GatterNicht;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GatterNichtTest {
  Eingang inputTrue = new Eingang(true);
  Eingang inputFalse = new Eingang(false);

  /**
   * Testet GatterNicht
   */
  @Test
  public void testeGatterNicht() {
    assertTrue(new GatterNicht(inputFalse).getOutput());
    assertFalse(new GatterNicht(inputTrue).getOutput());
  }
}
