package phWGinfo;

/** Einfaches Beispiel einer Subklasse:
 */
public class BeweglichesDing extends Ding {

    int posX, posY, posZ;

    void bewegen(int x, int y, int z) {
        posX = x;
        posY = y;
        posZ = z;
    }

    public static void main(String[] args) {
        BeweglichesDing meinAuto = new BeweglichesDing();
        meinAuto.feld1 = "Mein beliebtes Viano.";
        meinAuto.sagFeld1();
        meinAuto.bewegen(20,10,-10);

        BeweglichesDing ice584 = new BeweglichesDing();
        ice584.feld1 = "Ein Zug.";
        ice584.sagFeld1();
        ice584.bewegen(20,10,-10);
    }

}
