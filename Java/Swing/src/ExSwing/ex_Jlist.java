/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExSwing;

import java.awt.ScrollPane;
import javax.swing.JFrame;
import javax.swing.JList;

/**
 *
 * @author NguyenTuanVu
 */
public class ex_Jlist {

    public ex_Jlist() {
        JFrame f = new JFrame("My frame");
        String[] label = {"ASM", "Pascal", "C\\C++", "VB", "Java"};
        JList l = new JList(label);
        ScrollPane s = new ScrollPane();
        s.add(l);
        f.add(s);
        f.setSize(100, 100);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        ex_Jlist list = new ex_Jlist();
    }
}
