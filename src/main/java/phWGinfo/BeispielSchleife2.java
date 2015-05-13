package phWGinfo;

/** Einfache Verwendung einer for Schleife
 * Diese Programme sucht eine zufälilige Zahl unter 0,1.
 */
public class BeispielSchleife2 {
    public static void main(String[] args) {

        String text = "carpe diem";
        for(int n = 0;
            n<10; n++) {
            System.out.println(text.charAt(n));
        }
        for(char c:
                text.toCharArray()) {
            System.out.println(c);
        }



    }
}
