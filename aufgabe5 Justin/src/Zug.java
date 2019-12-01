public class Zug {
    private Wagen ersterWagen = null;

    /**
     * @return ersterWagen
     */
    public Wagen getErsterWagen() {
        return ersterWagen;
    }

    /**
     * Hängt einen Wagen an den Zug
     * @param neu vom Typ Wagen
     * @throws IllegalArgumentException, wenn Eingabe null
     */
    public void anhaengen(Wagen neu) {
        if (neu == null) {
            throw new IllegalArgumentException("Eingabe darf nicht null sein.");
        }
        if (this.ersterWagen == null) {
            this.ersterWagen = neu;
        } else {
            Wagen tmp = this.ersterWagen;
            while (tmp.getNachfolgerWagen() != null) {
                tmp = tmp.getNachfolgerWagen();
            }
            tmp.setNachfolgerWagen(neu);
        }
    }

    /**
     * Entfernt einen Wagen vom Zug
     * @param deleteMe
     * @return tmp
     * @throws IllegalArgumentException, wenn Eingabe null
     * @throws IllegalArgumentException, wenn Wagen nicht im Zug
     */
    public Wagen abhaengen(Wagen deleteMe) {
        if (deleteMe == null) {
            throw new IllegalArgumentException("Wagen darf nicht null sein");
        }
        if (this.ersterWagen == deleteMe) {
            Wagen tmp = this.ersterWagen;
            this.ersterWagen = this.ersterWagen.getNachfolgerWagen();
            tmp.setNachfolgerWagen(null);
            return tmp;
        } else {
            Wagen vorgaenger = this.ersterWagen;
            while (vorgaenger.getNachfolgerWagen() != deleteMe && vorgaenger.getNachfolgerWagen() != null) {
                vorgaenger = vorgaenger.getNachfolgerWagen();
            }
            if (vorgaenger.getNachfolgerWagen() == null) {
                throw new IllegalArgumentException("Wagen nicht im Zug");
            }
            Wagen tmp = vorgaenger.getNachfolgerWagen();
            vorgaenger.setNachfolgerWagen(tmp.getNachfolgerWagen());
            tmp.setNachfolgerWagen(null);
            return tmp;
        }
    }

    /**
     * Ausgabe aller Wagen auf der Konsole
     */
    public void zugAusgeben() {
        Wagen aktuellerWagen = this.ersterWagen;
        while (aktuellerWagen != null) {
            if (aktuellerWagen.getNachfolgerWagen() != null) {
                System.out.println(aktuellerWagen.getId());
            } else {
                System.out.println(aktuellerWagen.getId());
            }
            aktuellerWagen = aktuellerWagen.getNachfolgerWagen();
        }
    }
}
