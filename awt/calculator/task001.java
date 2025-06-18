import java.awt.*;

public class task001 {
    public task001() {
        Frame f = new Frame("Calculator");

      
        f.setLayout(new GridLayout(5, 4, 5, 5)); 

        
        TextField display = new TextField();
        display.setEditable(false);
        f.add(display);
        
       
        for (int i = 1; i < 4; i++) {
            f.add(new Label(""));
        }

       
        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+"
        };

        for (String b : buttons) {
            f.add(new Button(b));
        }

       
        f.setSize(300, 400);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new task001();
    }
}