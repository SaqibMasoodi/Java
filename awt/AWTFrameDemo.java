import java.awt.*;
import java.awt.event.*;

public class AWTFrameDemo extends Frame {
    public AWTFrameDemo() {
        setTitle("AWT Frame - No Events");
        setSize(300, 200);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();     
                System.exit(0); 
            }
        });
    }

    public static void main(String[] args) {
        new AWTFrameDemo();
    }
}
