package Aufgabe6Justin.Tests;

import Aufgabe6Justin.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class SchaltungTest {
  Eingang inputTrue = new Eingang(true, false);
  Eingang inputFalse = new Eingang(false, false);

  Gatter gatterUnd = new BinaeresGatterUnd(inputFalse, inputTrue);
  Gatter gatterOder = new BinaeresGatterOder(gatterUnd, inputTrue);
  Gatter gatterNicht = new GatterNicht(gatterOder);

  @Test
  public void testeKomplexeSchaltung() {
    assertFalse(gatterNicht.getOutput());
  }
}
