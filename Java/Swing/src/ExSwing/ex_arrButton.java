/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExSwing;

import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author NguyenTuanVu
 */
public class ex_arrButton implements ActionListener {

    private boolean flag = true;
    private int ToaDoX, ToaDoY;
    final int HEIGHT_MAX = 20;
    final int WIDTH_MAX = 20;

    public ex_arrButton() {
        //add frame
        JFrame frame = new JFrame("My Frame");
        frame.setSize(1000, 650);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //add menu
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

        //add button
        for (int i = 0; i < WIDTH_MAX; i++) {
            for (int j = 0; j < HEIGHT_MAX; j++) {
                bt[i][j] = new Button();
                bt[i][j].setBounds(0 + 30 * i, 0 + 30 * j, 30, 30);
                frame.add(bt[i][j]);
                bt[i][j].addActionListener(this);
            }
        }
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < HEIGHT_MAX; i++) {
            for (int j = 0; j < WIDTH_MAX; j++) {
                if (e.getSource() == bt[i][j]) {
                    ToaDoX = i;
                    ToaDoY = j;
                    event();
                }
            }
        }
//        bt[0][0].setIcon(getClass().getResource(null));
    }

    private void event() {
        String s = bt[ToaDoX][ToaDoY].getLabel();
        System.out.println("" + s);
        if (s.equals("")) {
            if (flag) {
                bt[ToaDoX][ToaDoY].setBackground(Color.red);
                bt[ToaDoX][ToaDoY].setLabel("X");
                flag = !flag;
            } else {
                bt[ToaDoX][ToaDoY].setBackground(Color.blue);
                bt[ToaDoX][ToaDoY].setLabel("O");
                flag = !flag;
            }
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        ex_arrButton bt = new ex_arrButton();
    }

    private Button bt[][] = new Button[WIDTH_MAX][HEIGHT_MAX];
    private JMenuBar menu;
    private JMenuItem INew, IOpen, ISave, IExit;
    private JMenu jFile, jEdit;
}
