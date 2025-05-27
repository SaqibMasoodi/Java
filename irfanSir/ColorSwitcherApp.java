import java.awt.*;
import java.awt.event.*;

public class ColorSwitcherApp {
    Frame f;
    Button b;
    Color[] colors = {Color.CYAN, Color.PINK, Color.ORANGE, Color.LIGHT_GRAY, Color.GREEN};
    int colorIndex = 0;

    public ColorSwitcherApp() {
        f = new Frame("Switch Background Color");

        
        b = new Button("Change Color");
        b.setBounds(90, 100, 120, 40);

        
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                f.setBackground(colors[colorIndex]);
                colorIndex = (colorIndex + 1) % colors.length;
            }
        });

        f.add(b);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new ColorSwitcherApp();
    }
}
