/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExSwing;

import java.awt.Choice;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JFrame;

/**
 *
 * @author NguyenTuanVu
 */
public class ex_Choice {

    public static void main(String args[]) {
        JFrame frame = new JFrame("My frame");
        //        frame.setLayout(null);                                  //hien
        frame.setSize(600, 400);                                //kich thuoc
        frame.setLocationRelativeTo(frame);                      //man hinh ra giua
        Choice myChoice = new Choice();
        myChoice.addItem("Red");
        myChoice.addItem("Green");
        myChoice.addItem("Blue");
        myChoice.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    String s = (String) e.getItem();
                    System.out.println(s);
                }
            }
        });
        frame.add(myChoice);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.pack();
        frame.setVisible(true);
    }
}
