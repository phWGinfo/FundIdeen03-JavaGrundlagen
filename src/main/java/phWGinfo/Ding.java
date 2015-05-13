package phWGinfo;

/** Einfaches Beispiel einer Klasse.
 */
public class Ding {
    String feld1 = "";
    int x = 0;

    // Eine Methode
    void sagFeld1() {
        System.out.println(feld1);
    }

    // hier startet der Lauf, wenn die Klasse gelaufen ist
    public static void main(String[] args) {
        Ding ding = new Ding();
        ding.feld1 = "etwas";

        Ding ding2 = new Ding();
        ding2.feld1 = ding.feld1;
    }

}
