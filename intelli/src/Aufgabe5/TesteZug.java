package Aufgabe5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TesteZug {

  @Test
  public void testeAnhaengen() {
    Zug zug = new Zug();
    //testet ob der Zug am Anfang keine Wagen hat
    assertNull(zug.getErsterWagen());
    Wagen wagen1 = new Wagen("wagen1");
    Wagen wagen2 = new Wagen("wagen2");
    Wagen wagen3 = new Wagen("wagen3");
    zug.anhaengen(wagen1);
    // Test
    zug.anhaengen(wagen2);
    zug.anhaengen(wagen3);
    //testet, ob ersterWagen im Zugobjekt richtig gesetzt wird
    assertEquals(zug.getErsterWagen(), wagen1);
    //testet, ob naechsterWagen vom ersten Wagen richtig gesetzt ist.
    assertEquals(wagen1.getNaechsterWagen(), wagen2);
    //testet, ob naeshterWagen vom zweiten Wagen richtig gesetzt ist.
    assertEquals(wagen2.getNaechsterWagen(), wagen3);
    //testet, ob am letzen Wagen kein weiterer Wagen hängt
    assertNull(wagen3.getNaechsterWagen());
  }

  @Test
  public void testeAbhaengen() {
    Zug zug = new Zug();
    Wagen wagen1 = new Wagen("wagen1");
    Wagen wagen2 = new Wagen("wagen2");
    Wagen wagen3 = new Wagen("wagen3");
    Wagen wagen4 = new Wagen("wagen4");

    zug.anhaengen(wagen1);
    zug.anhaengen(wagen2);
    zug.anhaengen(wagen3);
    zug.anhaengen(wagen4);

    //Wagen aus der mitte abhängen, expected: zug-wagen1-wagen3-wagen4
    Wagen ret = zug.abhaengen(wagen2);
    assertEquals(ret, wagen2);
    //testet, ob die Referenz des Zuges auf den erste Wagen zeigt
    assertEquals(zug.getErsterWagen(), wagen1);
    //testet, ob die Referenz vom ersten Wagen auf den zweiten Wagen zeigt
    assertEquals(wagen1.getNaechsterWagen(), wagen3);
    //testet, ob der letzte Wagen keinen Nachfolger hat
    assertNull(wagen2.getNaechsterWagen());

    //letzen Wagen abhängen, expected: zug-wagen1-wagen3
    zug.abhaengen(wagen4);
    //testet, ob der abgehängte Wagen keinen Nachfolger hat
    assertNull(wagen3.getNaechsterWagen());
    //testet, ob der Wagen, der vor dem abgehängten war, an der ehemaligen Nachfolger des abgehäbgten Wagens zeigt
    assertEquals(wagen1.getNaechsterWagen(), wagen3);

    //ersten Wagen abhängen, expected: zug-wagen3
    zug.abhaengen(wagen1);
    //testet, ob der abgehängte Wagen keinen Nachfolger hat
    assertNull(wagen3.getNaechsterWagen());
    //testet, ob die Referenz des Zuges auf den ersten Wagen nun auf den Nachfolger des abgehägten Wagens zeigt
    assertEquals(zug.getErsterWagen(), wagen3);
  }

  @Test
  public void testeFindeWagenObjektMitId() {
    Zug zug = new Zug();
    Wagen wagen1 = new Wagen("zuTesten");
    Wagen wagen2 = new Wagen("zuTesten2");
    //Assertions.assertThrows(IllegalArgumentException.class, () -> {zug.findeWagenObjektMitId("test");});
    zug.anhaengen(wagen1);
    zug.anhaengen(wagen2);
    //testet, ob der erste Wagen gefunden wird (ignore Case wird mitgetestet)
    assertSame(zug.findeWagenObjektMitId("zutesten"), wagen1);
    //testet, ob der zweite Wagen gefunden wird (ignore Case wird mitgetestet)
    assertSame(zug.findeWagenObjektMitId("zuTesten2"), wagen2);
  }
  @Test
  public void testeAbhaengenLetzer(){
    Zug zug = new Zug();
    Wagen wagen1 = new Wagen("zuTesten");
    Wagen wagen2 = new Wagen("zuTesten2");
    zug.anhaengen(wagen1);
    zug.anhaengen(wagen2);
    zug.abhaengenLetzter();
    assertNull(wagen1.getNaechsterWagen());
    zug.abhaengenLetzter();
    assertNull(zug.getErsterWagen());
  }
}
