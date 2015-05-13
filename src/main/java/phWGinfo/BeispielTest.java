package phWGinfo;

import javax.swing.*;

/** Einfache Verwendung der If Konstrollstruktur
 */
public class BeispielTest {
    public static void main(String[] args) {

        String zahlText = JOptionPane.showInputDialog("Geben Sie eine Zahl ein.");
        int zahl = Integer.parseInt(zahlText);

        if(zahl % 7 == 0) {
            System.out.println("Ihre Zahl " + zahl + " ist durch 7 teilbar.");
        } else {
            System.out.println("Ihre Zahl " + zahl + " ist nicht durch 7 teilbar.");
        }

    }
}
