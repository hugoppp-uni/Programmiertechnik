package Aufgabe6Justin.Tests;

import Aufgabe6Justin.Eingang;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class WackelkontaktTest {
  Eingang inputTrue = new Eingang(true, true);
  Eingang inputFalse = new Eingang(false, true);

  /**
   * Testet getOutput() aus der Klasse Eingang
   */
  @Test
  public void testeGetOutput() {
    if (Eingang.WACKELKONTAKT) {
      int anzTrueVonInputFalse = 0;
      int anzTrueVonInputTrue = 0;
      for (int i = 0; i < 10000; i++) {
        if (inputTrue.getOutput()) {
          anzTrueVonInputTrue++;
        }
        if (inputFalse.getOutput()) {
          anzTrueVonInputFalse++;
        }
      }
      double warscheinlichkeitVonWahr = anzTrueVonInputFalse / 10000.0;
      assertTrue((warscheinlichkeitVonWahr > 0.15 && warscheinlichkeitVonWahr < 0.18));

      warscheinlichkeitVonWahr = anzTrueVonInputTrue / 10000.0;
      assertTrue((warscheinlichkeitVonWahr > 0.80 && warscheinlichkeitVonWahr < 0.85));
    }
  }
}
