package phWGinfo;

import java.io.File;

/** Einfache Verwendung von Variablen mit Objekten die die Welt spiegeln
 */
public class BeispielObjekte2 {
    public static void main(String[] args) {

        File file = new File("LICENSE");
        System.out.println(file.exists());

        file=file.getAbsoluteFile();
        File file2 = file.getParentFile();
        System.out.println(file2.getName());

        System.out.println(file.equals(file2));


    }
}
