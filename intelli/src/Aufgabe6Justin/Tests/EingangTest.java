package Aufgabe6Justin.Tests;

import Aufgabe6Justin.Eingang;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EingangTest {

  Eingang inputTrue = new Eingang(true, false);
  Eingang inputFalse = new Eingang(false, false);

  /**
   * Testet getOutput() aus der Klasse Eingang
   */
  @Test
  public void testeGetOutput() {
    assertTrue(inputTrue.getOutput());
    assertFalse(inputFalse.getOutput());
  }
}

