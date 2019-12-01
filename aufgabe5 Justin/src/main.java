import java.sql.SQLOutput;

public class main {

    public static void main(String[] args) {
        Wagen wagen1 = new Wagen("Wagen mit einer Bar");
        Wagen wagen2 = new Wagen("Kühlwagen");
        Wagen wagen3 = new Wagen("erste Klasse");
        Wagen wagen4 = new Wagen("Toilettenwagen");

        Zug zug = new Zug();

        zug.anhaengen(wagen1);
        zug.anhaengen(wagen2);
        zug.anhaengen(wagen3);
        zug.anhaengen(wagen4);

        zug.abhaengen(wagen2);

        zug.zugAusgeben();
    }
}
