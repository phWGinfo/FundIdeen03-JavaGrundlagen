package phWGinfo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DemoParalleleMitGUIs {

    public static void main(String[] args) {
        new DemoParalleleMitGUIs().run();
    }

    int counter = 0;
    JLabel state = new JLabel("counter: " + counter);

    class IncrementAction extends AbstractAction {
        IncrementAction(int increment) {
            super("" + increment);
            this.increment = increment;
        }
        int increment;

        public void actionPerformed(ActionEvent e) {
            counter = counter + increment;
            state.setText("counter " + counter);
        }
    }

    void run() {
        JFrame frame = new JFrame("DemoParallelMitGUIs");
        Container root = frame.getRootPane();
        frame.getRootPane().setLayout(new GridLayout(3,1,10,10));
        root.add(new JButton(new IncrementAction(-1)));
        root.add(new JButton(new IncrementAction(+1)));
        root.add(state);
        frame.setSize(300,200);
        frame.setVisible(true);
    }

}
