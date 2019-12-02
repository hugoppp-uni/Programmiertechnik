package Aufgabe5;

/**
 * Zug besitzt Referenz auf den ersten Wagen
 * Zug bietet die Schnittstelle zum konfigurieren des Zuges
 */
public class Zug {
  /**
   * Referenz auf den ersten Wagen des Zuges
   * Wenn 'ersterWagen = null' ist kein Wagen angehängt
   */
  private Wagen ersterWagen = null;

  /**
   * Hängt einen Wagen an den letzen Wagen des Zuges an, falls es keinen Wagen gibt, an den Zug.
   *
   * @param neuerWagen der anzuhängende Wagen
   */
  public void anhaengen(Wagen neuerWagen) {
    Wagen aktuellerWagen = ersterWagen;
    if (neuerWagen == null) {
      throw new IllegalArgumentException("Parameter von anhaengen() kann nicht null sein");
    }
    if (ersterWagen == null) {
      //Falls noch kein Wagen da ist, wird einer an den Zug gehängt
      ersterWagen = neuerWagen;
    } else {
      while (aktuellerWagen.getNaechsterWagen() != null) {
        //Schleife geht durch Zug und findet letzen Wagen,
        //Falls der neuerWagen schon am Zug hängt -> IllegalArgumentException
        if (aktuellerWagen == neuerWagen) {
          throw new IllegalArgumentException("Wagen hängt bereits am Zug");
        }
        aktuellerWagen = aktuellerWagen.getNaechsterWagen();
      }
      //sonst wird an den letzten Wagen der neue rangehängt
      Wagen letzerWagen = aktuellerWagen;
      //alter Code: Wagen letzerWagen = findeVorgaengerVon(null);
      letzerWagen.setNaechsterWagen(neuerWagen);
    }
  }

  /**
   * Hängt einen bestimmten Wagen ab, der Wagen davor (bzw. Zug) und Wagen danach werden verbunden:
   * zug-wagen1-*wagen*-wagen3  -> zug-wagen1-wagen3
   *
   * @param wagen wird abgehägt
   */
  public Wagen abhaengen(Wagen wagen) {
    if (wagen == null) {
      throw new IllegalArgumentException("Kann nicht null sein");
    }
    if (ersterWagen == wagen) {
      //1. Fall: ersten Wagen abhängen
      Wagen wagenZuEntfernen = ersterWagen;
      //der Wagen, der hinter dem wagenZuEnfernen ist, wird an den Zug gehängt
      ersterWagen = wagenZuEntfernen.getNaechsterWagen();
      //naechsterWagen vom wagenZuEnfernen wird enfernt, da dieser keinen Nachfolger mehr hat
      wagenZuEntfernen.setNaechsterWagen(null);
      return wagenZuEntfernen;
    } else {
      //2. Fall: irgendein anderen Wagen abhängen
      Wagen vorgaengerWagen = findeVorgaengerVon(wagen);
      Wagen wagenZuEntfernen = vorgaengerWagen.getNaechsterWagen();
      //der Wagen, der hinter dem wagenZuEnfernen ist, wird an den Zug gehängt
      vorgaengerWagen.setNaechsterWagen(wagenZuEntfernen.getNaechsterWagen());
      //naechsterWagen vom wagenZuEnfernen wird enfernt, da dieser keinen Nachfolger mehr hat
      wagenZuEntfernen.setNaechsterWagen(null);
      return wagenZuEntfernen;
    }
  }

  /**
   * Hängt den letzen Wagen des Zuges ab.
   */
  public void abhaengenLetzter() {
    if (ersterWagen == null) {
      throw new IllegalArgumentException("Kein Wagen hängt am Zug");
    }
    if (ersterWagen.getNaechsterWagen() == null) {
      ersterWagen = null;
    } else {
      Wagen wagenZuEntfernen = findeVorgaengerVon(null);
      findeVorgaengerVon(wagenZuEntfernen).setNaechsterWagen(null);
    }
  }

  /**
   * gibt den Wagen aus, der vor dem eingegebenen Wagen hägt, zB: zug-wagen1-*rückgabe*-*wagen*-wagen4
   * IllegalArgumentException, falls:
   * 1. der gesuchte Wagen hängt nicht am Zug
   * 2. der gesuchte Wagen ist der erste Wagen des Zuges, hängt also an dem Zug
   *
   * @param wagen nächsterWagen des gesuchten Wagens
   * @return der gesuchte Wagen
   */
  private Wagen findeVorgaengerVon(Wagen wagen) {
    if (ersterWagen == wagen) {
      throw new IllegalArgumentException("Der Wagen mit der id = " + wagen.getId() + " ist am Zug angehängt");
    }
    Wagen aktuellerWagen = ersterWagen;
    //Solange aktuellerWagen nicht der gesuchte Wagen ist, wird der nachfolger in aktuellerWagen gespeichert
    while (aktuellerWagen.getNaechsterWagen() != wagen) {
      aktuellerWagen = aktuellerWagen.getNaechsterWagen();
      //IllegalArgumentException, falls der Wagen nicht am Zug hängt
      if (aktuellerWagen == null) {
        throw new IllegalArgumentException("Wagen mit id = " + wagen.getId() + " hängt nicht an diesem Zug");
      }
    }
    return aktuellerWagen;
  }

  /**
   * Gibt den ersten Wagen mit der gesuchten id aus. IllegalArgumentException, falls die id nicht existiert
   *
   * @param id Id des gesuchten Wagens
   * @return Wagen Objekt mit der gesuchten ID
   */
  public Wagen findeWagenObjektMitId(String id) {
    Wagen aktuellerWagen = ersterWagen;
    while (!aktuellerWagen.getId().equalsIgnoreCase(id)) {
      if (aktuellerWagen.getNaechsterWagen() == null) {
        throw new IllegalArgumentException("kein Wagen mit dieser ID gefunden");
      }
      aktuellerWagen = aktuellerWagen.getNaechsterWagen();
    }
    return aktuellerWagen;
  }

  public Wagen getErsterWagen() {
    return ersterWagen;
  }
}

