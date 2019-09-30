/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExSwing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author NguyenTuanVu
 */
public class ex_evenClick implements ActionListener {

    public ex_evenClick() {
        JFrame frame = new JFrame("My frame");
        frame.setSize(600, 400);
        frame.setLocationRelativeTo(frame);
        //add button
        JButton button = new JButton("My button");
        frame.add(button);
        button.addActionListener((this) );
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String args[]) {
        ex_evenClick even=new ex_evenClick();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "Hello", "thong bao", 1);
    }

}
