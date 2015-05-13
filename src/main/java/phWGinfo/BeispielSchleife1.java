package phWGinfo;

/** Einfache Verwendung einer for Schleife
 * Diese Programme sucht eine zufälilige Zahl unter 0,1.
 */
public class BeispielSchleife1 {
    public static void main(String[] args) {


        double zufall = Math.random();
        int numVersuche = 1;

        while( zufall >= 0.1 ) {
            System.out.println("Ich suche noch.");
            zufall = Math.random();
            numVersuche = numVersuche + 1;
        }
        System.out.println(zufall);
    }
}
