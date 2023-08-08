import java.util.*;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class testGUI {
    void m1() {
        JFrame frame = new JFrame("Frame Example 1");
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        JLabel label = new JLabel("This is the Lable of test GUI");
        JButton button = new JButton();
        button.setText("Sample Button");
        panel.add(label);
        panel.add(button);
        frame.add(panel);
        frame.setSize(400, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String args[]) {
        testGUI ob = new testGUI();
        ob.m1();
    }
}
