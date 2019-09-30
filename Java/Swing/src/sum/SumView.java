/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sum;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author NguyenTuanVu
 */
public class SumView extends JFrame {

	private JLabel lab1, lab2, labCong, labTru, labNhan, labChia;
	private JTextField texFA, texFB, texFKQCong, texFKQTru, texFKQNhan, texFKQChia;
	private JButton bt;

	public SumView() {
		// add Frame
		this.setLayout(null);
		setSize(450, 250);
		// add Label
		lab1 = new JLabel("so A=");
		lab1.setBounds(0, 10, 50, 30);
		add(lab1);
		lab2 = new JLabel("so B=");
		lab2.setBounds(0, 50, 50, 30);
		add(lab2);
		labCong = new JLabel("A + B =");
		labCong.setBounds(250, 0, 50, 30);
		add(labCong);
		labTru = new JLabel("A - B =");
		labTru.setBounds(250, 30, 50, 30);
		add(labTru);
		labNhan = new JLabel("A x B =");
		labNhan.setBounds(250, 60, 50, 30);
		add(labNhan);
		labChia = new JLabel("A / B =");
		labChia.setBounds(250, 90, 50, 30);
		add(labChia);
		// add TextFiled
		texFA = new JTextField();
		texFA.setBounds(80, 10, 150, 30);
		add(texFA);
		texFB = new JTextField();
		texFB.setBounds(80, 50, 150, 30);
		add(texFB);
		texFKQCong = new JTextField();
		texFKQCong.setBounds(300, 0, 100, 30);
		add(texFKQCong);
		texFKQTru = new JTextField();
		texFKQTru.setBounds(300, 30, 100, 30);
		add(texFKQTru);
		texFKQNhan = new JTextField();
		texFKQNhan.setBounds(300, 60, 100, 30);
		add(texFKQNhan);
		texFKQChia = new JTextField();
		texFKQChia.setBounds(300, 90, 100, 30);
		add(texFKQChia);
		// add Button
		bt = new JButton("Kết quả");
		bt.setBounds(80, 100, 100, 30);
		add(bt);
		// show Jrame
		setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		bt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String sA = texFA.getText();
				String sB = texFB.getText();
				int a, b;
				if (!sA.equals("") && !sB.equals("")) {
					try {
						a = Integer.parseInt(sA);
						b = Integer.parseInt(sB);
					} catch (NumberFormatException E) {
						JOptionPane.showMessageDialog(null, "Vui lòng nhập số", "Thông báo", 1);
						return;
					}
					texFKQCong.setText(Integer.toString(a + b));
					texFKQTru.setText(Integer.toString(a - b));
					texFKQNhan.setText(Integer.toString(a * b));
					texFKQChia.setText(Integer.toString(a / b));
				} else {
					JOptionPane.showMessageDialog(null, "Không được để trống", "Thông báo", 1);
				}
			}
		});
		
	}
	public static void main(String[] args) {
		 new SumView();
	}
}
