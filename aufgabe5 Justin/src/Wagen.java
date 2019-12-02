public class Wagen {
    private String id;
    private Wagen nachfolgerWagen;

    /**
<<<<<<< HEAD
     * @param id
=======
     *      * @param id
>>>>>>> neu
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
