public class Wagen {
    private String id;
    private Wagen nachfolgerWagen;

    /**
     * @param id
     */
    public Wagen(String id) {
        this.id = id;
    }

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @return nachfolgerWagen
     */
    public Wagen getNachfolgerWagen() {
        return nachfolgerWagen;
    }

    /**
     * @param nachfolgerWagen
     */
    public void setNachfolgerWagen(Wagen nachfolgerWagen) {
        this.nachfolgerWagen = nachfolgerWagen;
    }
}
