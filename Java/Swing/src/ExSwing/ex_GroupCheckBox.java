/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ExSwing;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Panel;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JFrame;

/**
 *
 * @author NguyenTuanVu
 */
public class ex_GroupCheckBox {
     public static void main(String args[])
    {
        JFrame frame = new JFrame("My frame");
        CheckboxGroup g=new CheckboxGroup();
        Checkbox c1=new Checkbox("Option 1",g,true);
        Checkbox c2=new Checkbox("Option 2",g,false);
        Checkbox c3=new Checkbox("Option 3",g,false);
        MyItemListener listener = new MyItemListener();
        c1.addItemListener(listener);
        c2.addItemListener(listener);
        c3.addItemListener(listener);
        Panel panel=new Panel();
        frame.add(panel);
        panel.add(c1);
        panel.add(c2);
        panel.add(c3);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
class MyItemListener implements ItemListener
{
    public void itemStateChanged(ItemEvent e)
    {
        if(e.getStateChange()==ItemEvent.SELECTED)
        {
            Object temp=e.getItem();
            String s=(String)temp;
            System.out.println(s);
        }
    }
}
