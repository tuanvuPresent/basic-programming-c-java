/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExSwing;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author NguyenTuanVu
 */
public class ex_setLayout {

    //setLayout mạnh nhất trong Swing là setLayout(null) cho đối tượng add, 
    //còn đối với đối tượng bị add thì setBounds, cú pháp setBounds(x,y,width,height)
    ex_setLayout() {
        JFrame frame = new JFrame("My frame");
        frame.setLayout(null);

        JButton b1 = new JButton("Button 1");
        b1.setBounds(0, 0, 100, 25);
        frame.add(b1);

        JButton b2 = new JButton("Button 2");
        b2.setBounds(100, 0, 100, 25);
        frame.add(b2);

        frame.setLocation(600,300);
        frame.setSize(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        ex_setLayout layout = new ex_setLayout();

    }
}
