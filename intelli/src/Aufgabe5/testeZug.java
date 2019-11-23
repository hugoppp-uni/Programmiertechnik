package Aufgabe5;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class testeZug{
    @test
    public void testeHinzufügen(){
        Zug zug = new Zug();
        zug.anhaengen(new Wagen("Wagen1"));
        zug.anhaengen(new Wagen("Wagen2"));
        zug.anhaengen(new Wagen("Wagen3"));
        assert

    }
}
