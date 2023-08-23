package JotEase;

import javax.swing.*;

import java.awt.*;

public class JotEase extends JFrame {

    JotEase(){
        setTitle("Note");

//        Set Logo
        ImageIcon JotEaseLogo = new ImageIcon(ClassLoader.getSystemResource("JotEase/icons/notepad.png"));
        Image logo = JotEaseLogo.getImage();
        setIconImage(logo);

        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);
    }

    public static void main(String[] args) {

        new JotEase();

    }
}
