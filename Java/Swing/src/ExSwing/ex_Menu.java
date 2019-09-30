/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExSwing;

import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author NguyenTuanVu
 */
public class ex_Menu {

    public ex_Menu() {
        JFrame frame = new JFrame("My frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        menu = new JMenuBar();
        frame.setJMenuBar(menu);

        jFile = new JMenu("File");
        jFile.setMnemonic(KeyEvent.VK_F);
        menu.add(jFile);

        jEdit = new JMenu("Edit");
        jEdit.setMnemonic(KeyEvent.VK_E);
        menu.add(jEdit);

        INew = new JMenuItem("New");
        INew.setMnemonic(KeyEvent.VK_N);
        jFile.add(INew);

        IExit = new JMenuItem("Exit");
        IExit.setMnemonic(KeyEvent.VK_E);
        jEdit.add(IExit);

        //phan code duoi them vao day
        frame.setSize(200, 60);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        ex_Menu menu = new ex_Menu();
    }
    private JMenuItem INew, IOpen, ISave, IExit;
    private JMenu jFile, jEdit;
    private JMenuBar menu;
}
