package phWGinfo;

/** Einfache Verwendung von Variablen mit Objekten.
 */
public class BeispielObjekte1 {
    public static void main(String[] args) {

        StringBuffer b;
        b = new StringBuffer("abc");
        System.out.println(b);
        b.setCharAt(1,'x');
        System.out.println(b);



    }
}
