import java.awt.*;
import java.awt.event.*;

public class SimpleFrame {
    public static void main(String[] args) {
        Frame f = new Frame("AWT Frame Example");
        f.setSize(400, 300);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
