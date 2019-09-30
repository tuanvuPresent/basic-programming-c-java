/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExSwing;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author NguyenTuanVu
 */
public class ex_JFrame {

    public static void main(String[] a) {
        //full_Scr
//        Toolkit kit = Toolkit.getDefaultToolkit();
//        Dimension screenSize = kit.getScreenSize();
//        int screenWidth = screenSize.width;
//        int screenHeight = screenSize.height;
        
        //add khung frame
        JFrame frame = new JFrame("Main Frame");                //Main Frame la ten cai cua so
        frame.setLayout(null);                                  //hien
        frame.setSize(600, 400);                                //kich thuoc
        frame.setLocationRelativeTo(frame);                      //man hinh ra giua
        frame.setResizable(false);                              //khong cho phong to
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //ham dong cua so lai
        frame.setVisible(true);//hien thi trinh do hoa ra man hinh
    }
}
