package Aufgabe6Justin.Tests;

import Aufgabe6Justin.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Tests {
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
}
