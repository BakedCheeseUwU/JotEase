package JotEase;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class JotEase extends JFrame {

    JotEase(){
        setTitle("Note");

//        Sets Logo
        ImageIcon JotEaseLogo = new ImageIcon(ClassLoader.getSystemResource("JotEase/icons/notepad.png"));
        Image logo = JotEaseLogo.getImage();
        setIconImage(logo);

        // creating a menu bar
        JMenuBar menubar = new JMenuBar();
        menubar.setBackground(Color.WHITE);


        // creating a File Menu
        JMenu file = new JMenu("File");
        file.setFont(new Font("AERIAl",Font.PLAIN,14));

        // Creating File menu items and mnemonics
        JMenuItem newDoc = new JMenuItem("New");
        newDoc.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));

        JMenuItem openDoc = new JMenuItem("Open");
        openDoc.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_DOWN_MASK));

        JMenuItem saveDoc = new JMenuItem("Save");
        saveDoc.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK));

        JMenuItem printDoc = new JMenuItem("Print");
        printDoc.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, InputEvent.CTRL_DOWN_MASK));

        JMenuItem exit = new JMenuItem("Exit");
        exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, InputEvent.CTRL_DOWN_MASK));

        //Appending menu items to file menu
        file.add(newDoc);
        file.add(openDoc);
        file.add(saveDoc);
        file.add(printDoc);
        file.add(exit);


        // Creating Edit menu
        JMenu edit = new JMenu("Edit");
        edit.setFont(new Font("AERIAl",Font.PLAIN,14));

        // Creating Edit menu items and mnemonics
        JMenuItem copy= new JMenuItem("Copy");
        copy.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_DOWN_MASK));

        JMenuItem paste = new JMenuItem("Paste");
        paste.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, InputEvent.CTRL_DOWN_MASK));

        JMenuItem cut = new JMenuItem("Cut");
        cut.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_DOWN_MASK));

        JMenuItem selectAll = new JMenuItem("Print");
        selectAll.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, InputEvent.CTRL_DOWN_MASK));

        //Appending menu items to edit menu
        edit.add(copy);
        edit.add(paste);
        edit.add(cut);
        edit.add(selectAll);


        // Creating Help menu
        JMenu helpmenu = new JMenu("Help");
        helpmenu.setFont(new Font("AERIAl",Font.PLAIN,14));

        // Creating Edit menu items and mnemonics
        JMenuItem help= new JMenuItem("Help");
        help.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H, InputEvent.CTRL_DOWN_MASK));

        //Appending menu items to edit menu
        helpmenu.add(help);


        // Appending menus to the menu bar
        menubar.add(file);
        menubar.add(edit);
        menubar.add(helpmenu);

        setJMenuBar(menubar);// Add menubar to the screen

        setExtendedState(JFrame.MAXIMIZED_BOTH);// Open window in full-screen
        setVisible(true);
    }

    public static void main(String[] args) {

        new JotEase();

    }
}
