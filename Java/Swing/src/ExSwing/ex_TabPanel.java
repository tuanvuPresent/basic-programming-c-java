/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExSwing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;

/**
 *
 * @author NguyenTuanVu
 */
public class ex_TabPanel {

    public static void main(String[] args) {
        JFrame f = new JFrame("My frame");
        String[] label = {"ASM", "Pascal", "C\\C++", "VB", "Java"};
        JButton[] b = new JButton[label.length];
        JTabbedPane p = new JTabbedPane();
        for (int i = 0; i < label.length; i++) {
            b[i] = new JButton(label[i]);
            p.addTab(label[i], b[i]);
        }
        f.add(p);
        f.setSize(300, 100);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

}
