/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GiaiTamGiac;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author NguyenTuanVu
 */
public class GiaiTamGiac extends JFrame {

	private JTable Jtab;
	private JButton btOk;
	private JTextField tFxA, tFxB, tFxC, tFyA, tFyB, tFyC;
	private JLabel lb1, lb2, lb3, lb4, lb5, lb6, lb7, lb8, lb9, lb10, lb11, lb12, lbKq1, lbKq2, lbKq3, lbKq4, lbKq5,
			lbKq6, lbKqA, lbKqB, lbKqC;

	public GiaiTamGiac() {
		// add Frame
		this.setLayout(null);
		this.setSize(500, 400);
		this.setTitle("Tích vô hướng-Giải tam giác");
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// add TextField
		tFxA = new JTextField();
		tFxA.setBounds(130, 10, 50, 20);
		this.add(tFxA);
		tFxB = new JTextField();
		tFxB.setBounds(130, 40, 50, 20);
		this.add(tFxB);
		tFxC = new JTextField();
		tFxC.setBounds(130, 70, 50, 20);
		this.add(tFxC);

		tFyA = new JTextField();
		tFyA.setBounds(180, 10, 50, 20);
		this.add(tFyA);
		tFyB = new JTextField();
		tFyB.setBounds(180, 40, 50, 20);
		this.add(tFyB);
		tFyC = new JTextField();
		tFyC.setBounds(180, 70, 50, 20);
		this.add(tFyC);
		// add Label
		lb1 = new JLabel("Tọa độ A( x ; y)=");
		lb1.setBounds(10, 10, 120, 20);
		this.add(lb1);
		lb2 = new JLabel("Tọa độ B( x ; y)=");
		lb2.setBounds(10, 40, 120, 20);
		this.add(lb2);
		lb3 = new JLabel("Tọa độ C( x ; y)=");
		lb3.setBounds(10, 70, 120, 20);
		this.add(lb3);
		lb4 = new JLabel("Góc vecto (AB,AC)=");
		lb4.setBounds(10, 150, 120, 20);
		this.add(lb4);
		lb5 = new JLabel("Góc vecto (BA,BC)=");
		lb5.setBounds(10, 180, 120, 20);
		this.add(lb5);
		lb6 = new JLabel("Góc vecto (CA,CB)=");
		lb6.setBounds(10, 210, 120, 20);
		this.add(lb6);
		lb7 = new JLabel("Ngoại tiếp tâm I( x; y)");
		lb7.setBounds(10, 240, 120, 20);
		this.add(lb7);
		lb8 = new JLabel("Nội tiếp tâm I'( x; y)");
		lb8.setBounds(10, 270, 120, 20);
		this.add(lb8);
		lb9 = new JLabel("Trực tâm H( x; y)");
		lb9.setBounds(10, 300, 120, 20);
		this.add(lb9);
		lbKq1 = new JLabel("???");
		lbKq1.setBounds(130, 150, 40, 20);
		this.add(lbKq1);
		lbKq2 = new JLabel("???");
		lbKq2.setBounds(130, 180, 40, 20);
		this.add(lbKq2);
		lbKq3 = new JLabel("???");
		lbKq3.setBounds(130, 210, 60, 20);
		this.add(lbKq3);
		lbKq4 = new JLabel("???");
		lbKq4.setBounds(130, 240, 60, 20);
		this.add(lbKq4);
		lbKq5 = new JLabel("???");
		lbKq5.setBounds(130, 270, 60, 20);
		this.add(lbKq5);
		lbKq6 = new JLabel("???");
		lbKq6.setBounds(130, 300, 40, 20);
		this.add(lbKq6);
		lb10 = new JLabel("Chân đường cao từ A");
		lb10.setBounds(250, 150, 200, 20);
		this.add(lb10);
		lb11 = new JLabel("Chân đường cao từ B");
		lb11.setBounds(250, 180, 200, 20);
		this.add(lb11);
		lb12 = new JLabel("Chân đường cao từ C");
		lb12.setBounds(250, 210, 200, 20);
		this.add(lb12);
		lbKqA = new JLabel("???");
		lbKqA.setBounds(400, 150, 60, 20);
		this.add(lbKqA);
		lbKqB = new JLabel("???");
		lbKqB.setBounds(400, 180, 60, 20);
		this.add(lbKqB);
		lbKqC = new JLabel("???");
		lbKqC.setBounds(400, 210, 60, 20);
		this.add(lbKqC);
		// add button
		btOk = new JButton("Ok");
		btOk.setBounds(130, 100, 50, 30);
		this.add(btOk);

		// bt action
		btOk.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				double xA, xB, xC, yA, yB, yC;
				try {
					xA = Double.parseDouble(tFxA.getText());
					xB = Double.parseDouble(tFxB.getText());
					xC = Double.parseDouble(tFxC.getText());
					yA = Double.parseDouble(tFyA.getText());
					yB = Double.parseDouble(tFyB.getText());
					yC = Double.parseDouble(tFyC.getText());
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Bạn phải nhập số", "Thông Báo", 1);
					return;
				}
				double dAB = Math.sqrt((xB - xA) * (xB - xA) + (yB - yA) * (yB - yA));
				double dAC = Math.sqrt((xC - xA) * (xC - xA) + (yC - yA) * (yC - yA));
				double dBC = Math.sqrt((xC - xB) * (xC - xB) + (yC - yB) * (yC - yB));

				double vA = (xB - xA) * (xC - xA) + (yB - yA) * (yC - yA);
				double vB = (xA - xB) * (xC - xB) + (yA - yB) * (yC - yB);
				double vC = (xA - xC) * (xB - xC) + (yA - yC) * (yB - yC);

				lbKq1.setText(Double.toString(Math.acos(vA / dAC / dAB) / Math.PI * 180));
				lbKq2.setText(Double.toString(Math.acos(vB / dBC / dAB) / Math.PI * 180));
				lbKq3.setText(Double.toString(Math.acos(vC / dBC / dAC) / Math.PI * 180));
				// Xac định chân đưỿng cao
//                Mathmath m=new Mathmath();    

			}
		});
	}

	public static void main(String[] args) {
		new GiaiTamGiac().setVisible(true);

	}
}
