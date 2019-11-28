package Aufgabe5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class testeZug {
    @Test
    public void testeHinzufügen() {
        Zug zug = new Zug();
        Wagen wagen1 = new Wagen("wagen1");
        Wagen wagen2 = new Wagen("wagen2");
        Wagen wagen3 = new Wagen("wagen3");
        zug.anhaengen(wagen1);
        zug.anhaengen(wagen2);
        zug.anhaengen(wagen3);
        //testet, ob ersterWagen im Zugobjekt richtig gesetzt wird
        assertEquals(zug.getErsterWagen(), wagen1);
        //testet, ob naechsterWagen vom ersten Wagen richtig gesetzt ist.
        assertEquals(wagen1.naechsterWagen, wagen2);
        //testet, ob naeshterWagen vom zweiten Wagen richtig gesetzt ist.
        assertEquals(wagen2.naechsterWagen, wagen3);
        //testet, ob am letzen Wagen kein weiterer Wagen hängt
        assertNull(wagen3.naechsterWagen);
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
        zug.abhaengen(wagen2);
        assertEquals(zug.getErsterWagen(), wagen1);
        assertEquals(wagen1.naechsterWagen, wagen3);
        assertNull(wagen2.naechsterWagen);

        //letzen Wagen abhängen, expected: zug-wagen1-wagen3
        zug.abhaengen(wagen4);
        assertNull(wagen3.naechsterWagen);
        assertEquals(wagen1.naechsterWagen, wagen3);

        //ersten Wagen abhängen, expected: zug-wagen3
        zug.abhaengen(wagen1);
        assertEquals(zug.getErsterWagen(),wagen3);
        assertNull(wagen3.naechsterWagen);
    }
    @Test
    public void testeFindeVorgaengerVon(){
      Zug zug = new Zug();
      Wagen wagen1 = new Wagen("zuTesten");
      zug.anhaengen(wagen1);
      assertSame(zug.findeWagenObjektMitId("zutesten"),wagen1);
    }
}
