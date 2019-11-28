package Aufgabe5;

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
    if (ersterWagen == null) {
      //Falls noch kein Wagen da ist, wird einer an den Zug gehängt
      ersterWagen = neuerWagen;
    } else {
      while (aktuellerWagen.naechsterWagen != null) {
          //Schleife geht durch Zug und findet letzen Wagen,
          //Falls der neuerWagen schon am Zug hängt -> IllegalArgumentException
          if (aktuellerWagen == neuerWagen) {
              throw new IllegalArgumentException("Wagen hängt bereits am Zug");
          }
          aktuellerWagen = aktuellerWagen.naechsterWagen;
      }
      //sonst wird an den letzten Wagen der neue rangehängt
      Wagen letzerWagen = findeVorgaengerVon(null);
      letzerWagen.naechsterWagen = neuerWagen;
    }
  }

  /**
   * Hängt einen bestimmten Wagen ab, der Wagen davor (bzw. Zug) und Wagen danach werden verbunden:
   * zug-wagen1-*wagen*-wagen3  -> zug-wagen1-wagen3
   *
   * @param wagen wird abgehägt
   */
  public void abhaengen(Wagen wagen) {
    if (wagen == null) {
      throw new IllegalArgumentException("Kann nicht null sein");
    }
    if (ersterWagen == wagen) {
      //1. Fall: ersten Wagen abhängen
      Wagen wagenZuEntfernen = ersterWagen;
      //der Wagen, der hinter dem wagenZuEnfernen ist, wird an den Zug gehängt
      ersterWagen = wagenZuEntfernen.naechsterWagen;
      //naechsterWagen vom wagenZuEnfernen wird enfernt, da dieser keinen Nachfolger mehr hat
      wagenZuEntfernen.naechsterWagen = null;

    } else {
      //2. Fall: irgendein anderen Wagen abhängen
      Wagen vorgaengerWagen = findeVorgaengerVon(wagen);
      Wagen wagenZuEntfernen = vorgaengerWagen.naechsterWagen;
      //der Wagen, der hinter dem wagenZuEnfernen ist, wird an den Zug gehängt
      vorgaengerWagen.naechsterWagen = wagenZuEntfernen.naechsterWagen;
      //naechsterWagen vom wagenZuEnfernen wird enfernt, da dieser keinen Nachfolger mehr hat
      wagenZuEntfernen.naechsterWagen = null;
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
    while (aktuellerWagen.naechsterWagen != wagen) {
      aktuellerWagen = aktuellerWagen.naechsterWagen;
      //IllegalArgumentException, falls der Wagen nicht am Zug hängt
      if (aktuellerWagen == null) {
        throw new IllegalArgumentException("Wagen mit id = " + wagen.getId() + " hängt nicht an diesem Zug");
      }
    }
    return aktuellerWagen;
  }

  /**
   * Gibt den ersten Wagen mit der gesuchten id aus. IllegalArgumentException, falls die id nicht ex.
   *
   * @param id Id des gesuchten Wagens
   * @return Wagen Objekt mit der gesuchten ID
   */
  public Wagen findeWagenObjektMitId(String id) {
    Wagen aktuellerWagen = ersterWagen;
    while (!aktuellerWagen.getId().equalsIgnoreCase(id)) {
      if (aktuellerWagen.naechsterWagen == null) {
        throw new IllegalArgumentException("kein Wagen mit dieser ID gefunden");
      }
      aktuellerWagen = aktuellerWagen.naechsterWagen;
    }
    return aktuellerWagen;
  }

  public Wagen getErsterWagen() {
    return ersterWagen;
  }
}

