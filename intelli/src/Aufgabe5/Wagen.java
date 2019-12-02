package Aufgabe5;

/**
 * Wagen des Zuges
 * Referenz auf den jeweils nächsten Wagen
 * Jeder Wagen hat eine id: String
 */
public class Wagen {
  /**
   * Referenz auf den nächsten Wagen.
   * Wenn 'naechsterWagen = null' ist kein Wagen angehängt
   */
  private Wagen naechsterWagen = null;
  /**
   * die ID des Wagens
   */
  private String id;

  /**
   *
   * @param id
   */
  public Wagen(String id) {
    this.id = id.toLowerCase();
  }

  public String getId() {
    return id;
  }

  public Wagen getNaechsterWagen() {
    return naechsterWagen;
  }

  public void setNaechsterWagen(Wagen naechsterWagen) {
    this.naechsterWagen = naechsterWagen;
  }
}