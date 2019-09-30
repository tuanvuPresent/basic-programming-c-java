/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExSwing;

import java.awt.ScrollPane;
import java.awt.TextArea;
import javax.swing.JFrame;

/**
 *
 * @author NguyenTuanVu
 */
public class ex_ScrollPanel {

    public ex_ScrollPanel() {
        JFrame f = new JFrame("My frame");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ScrollPane s = new ScrollPane();
        TextArea t = new TextArea();
        s.add(t);
        f.add(s);
        f.setSize(200, 600);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        ex_ScrollPanel scroll = new ex_ScrollPanel();
    }
}
