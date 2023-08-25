package JotEase;

import javax.swing.*;
import java.awt.*;

public class About extends JFrame {
    About(){
//        Opens a window with preset dimensions
        setBounds(700,300,600,500);
        setLayout(null);

//        Adding an image (i1) and downscaling it (i2)
//        since JLabel is a class in Swing, it doesn't accept an awt object (i2)
//        (JLabel doesn't accept object of Image class)so we have to convert it back to ImageIcon object (i3)

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("JotEase/icons/windows.png"));
        Image i2 = i1.getImage().getScaledInstance(300,60,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel headerIcon = new JLabel(i3);

//        Places the image on top of the window
        headerIcon.setBounds(70,40,400,80);
        add(headerIcon);


        setVisible(true);
    }
    public static void main(String[] args) {
        new About();
    }
}
