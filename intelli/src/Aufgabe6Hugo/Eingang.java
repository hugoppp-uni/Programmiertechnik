package Aufgabe6Hugo;

public class Eingang implements Gatter {
    private boolean wert;

    @Override
    public boolean getOutput(){
        return wert;
    }

    @Override
    public String toString(){
        return "nicht fertig";
    }

    public Eingang(boolean wert){
        this.wert = wert;
    }
}
