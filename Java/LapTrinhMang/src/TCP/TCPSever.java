/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TCP;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author NguyenTuanVu
 */
public class TCPSever extends Thread implements ActionListener {

	JFrame frame;

	JTextField txtField, txtFieldTen;
	JTextArea txtArea;
	JScrollPane scroll;
	JButton btn;

	public TCPSever() throws IOException {
		frame = new JFrame("Server");
		frame.setSize(550, 360);
		frame.setLayout(null);
		frame.setResizable(false);
		// add TxtArea
		txtArea = new JTextArea(5, 5);
		txtArea.setEditable(false);
		txtArea.setLineWrap(true);
		txtArea.setWrapStyleWord(true);

		scroll = new JScrollPane(txtArea);
		scroll.setBounds(0, 0, 400, 300);
		frame.add(scroll);
		// add TxtField
		txtField = new JTextField();
		txtField.setBounds(0, 300, 400, 30);
		txtField.addActionListener(this);
		frame.add(txtField);

		txtFieldTen = new JTextField();
		txtFieldTen.setBounds(410, 50, 100, 50);
		txtFieldTen.setEditable(false);
		frame.add(txtFieldTen);
		// add btn
		btn = new JButton("Creat");
		btn.setBounds(410, 0, 100, 30);
		btn.addActionListener(this);
		frame.add(btn);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Thoát
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == txtField) {
			sentData();
		}
		if (e.getSource() == btn) {
			this.start(); // creat sever
		}
	}

	private void sentData() {
		try {
			dataOutputStream = new DataOutputStream(sA.getOutputStream());
			dataOutputStream.writeUTF(Ten + ":" + txtField.getText());
			dataOutputStream.flush();

			txtArea.append(Ten + ":" + txtField.getText() + "\n");
			txtField.setText("");
		} catch (IOException ex) {
			Logger.getLogger(TCPSever.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	public void readData() throws IOException {
		dataInputStream = new DataInputStream(sA.getInputStream());
		String str = dataInputStream.readUTF();

		txtArea.append(str + "\n"); // thêm vào txtArea
	}

	@Override
	public void run() {
		try {
			connect();
			while (true) {
				readData();
			}
		} catch (IOException ex) {
			Logger.getLogger(TCPSever.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	private void connect() throws IOException {
		try {
			Ten = JOptionPane.showInputDialog(null, "Nhập tên");
			txtFieldTen.setText(Ten);
			serA = new ServerSocket(2222);
			txtArea.setText("Server đang đợi...");
			sA = serA.accept();
			txtArea.setText("Server kết nối thành công\n");
		} catch (IOException ex) {
			Logger.getLogger(TCPSever.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	private static ServerSocket serA;
	private static Socket sA = new Socket();
	private DataInputStream dataInputStream;
	private DataOutputStream dataOutputStream;
	private String Ten;

	public static void main(String[] args) throws IOException {
		TCPSever tCPSever = new TCPSever();
	}
}
