/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExSwing;

import javax.swing.JCheckBox;
import javax.swing.JFrame;

/**
 *
 * @author NguyenTuanVu
 */
public class ex_CheckBox {

    ex_CheckBox() {
        JFrame frame = new JFrame("My frame");
//        frame.setLayout(null);                                  //hien
        frame.setSize(600, 400);                                //kich thuoc
        frame.setLocationRelativeTo(frame);                      //man hinh ra giua
        //add JCheckBox
        JCheckBox checkbox = new JCheckBox("Documents", false);
        frame.add(checkbox);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        ex_CheckBox cBox=new ex_CheckBox();
    }
}
