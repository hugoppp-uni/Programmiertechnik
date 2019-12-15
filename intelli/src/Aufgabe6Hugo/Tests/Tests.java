package Aufgabe6Hugo.Tests;

import Aufgabe6Hugo.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Tests {
    Eingang f = new Eingang(false);
    Eingang w = new Eingang(true);

  @Test
  public void testeGatterNicht(){
    assertTrue(new GatterNicht(f).getOutput());
    assertFalse(new GatterNicht(w).getOutput());
  }

  @Test
  public void testeBinaeresGatterUnd(){
    assertFalse(new BinaeresGatterUnd(w,f).getOutput());
    assertFalse(new BinaeresGatterUnd(f,f).getOutput());
    assertFalse(new BinaeresGatterUnd(f,w).getOutput());
    assertTrue(new BinaeresGatterUnd(w,w).getOutput());
  }

  @Test void testeBinaeresGatterOder(){
    assertTrue(new BinaeresGatterOder(w,w).getOutput());
    assertTrue(new BinaeresGatterOder(f,w).getOutput());
    assertTrue(new BinaeresGatterOder(w,f).getOutput());
    assertFalse(new BinaeresGatterOder(f,f).getOutput());
  }
}
