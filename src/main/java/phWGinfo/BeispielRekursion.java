package phWGinfo;

import javax.swing.*;
import java.io.File;

/** Eine mögliche Verwendung der Rekursion: um in Verzeichnisse zu suchen.
 */
public class BeispielRekursion {

    // findet Datei im Verzeichnis file und gibt es zurück
    static String sucheDatei(File startVerzeichnis, String dateiName) {
        System.out.println("Suche: " + startVerzeichnis);
        if(startVerzeichnis.isFile()) {
            if(dateiName.equals(startVerzeichnis.getName())) {
                return startVerzeichnis.getAbsolutePath();
            } else {
                return null;
            }
        } else { // file ist ein Verzeichnis
            for(File kind: startVerzeichnis.listFiles()) {
                String gefunden = sucheDatei(kind, dateiName);
                if(gefunden!=null) return gefunden;
            }
            // nicht gefunden, einfach "nichts" zurückgeben
            return null;
        }
    }

    public static void main(String[] args) throws Throwable {
        String dateiName = JOptionPane.showInputDialog("Geben Sie ein Dateiname an. Ich werde sie suchen");
        String gefundene = sucheDatei(new File("src"), dateiName);
        System.out.println(gefundene);
    }


}
