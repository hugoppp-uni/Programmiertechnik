package Aufgabe7JustinTests;

import Aufgabe7Justin.Rasse;
import Aufgabe7Justin.TolkienFigur;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TolkienFigurTest{

  @BeforeEach
  void setUp(){
    TolkienFigur testfigur = new TolkienFigur("Gandalf", Rasse.ZAUBERER);
  }

  @Test
  void testToString(){

  }

  @Test
  void testHashCode(){
  }

  @Test
  void testEquals(){
  }
}