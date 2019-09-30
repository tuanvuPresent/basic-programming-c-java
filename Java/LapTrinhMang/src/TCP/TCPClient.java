package TCP;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
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
public class TCPClient extends Thread implements ActionListener {

	JFrame frame;

	JTextField txtField, txtFieldTen;
	JTextArea txtArea;
	JScrollPane scroll;
	JButton btn;

	public TCPClient() {
		frame = new JFrame("Client");
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
		btn = new JButton("connect");
		btn.setBounds(410, 0, 100, 30);
		btn.addActionListener(this);
		frame.add(btn);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Thoát giao diện khi đóng
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == txtField) {
			sentData();
		}

		if (e.getSource() == btn) {
			connect(); // ket noi voi sever
			this.start(); // doc data
		}
	}

	private void sentData() {
		try {
			dataOutputStream = new DataOutputStream(socketClient.getOutputStream());
			dataOutputStream.writeUTF(Ten + ":" + txtField.getText());
			dataOutputStream.flush();

			txtArea.append(Ten + ":" + txtField.getText() + "\n");
			txtField.setText("");
		} catch (IOException ex) {
			Logger.getLogger(TCPClient.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	public void readData() throws IOException {
		dataInputStream = new DataInputStream(socketClient.getInputStream());
		String str = dataInputStream.readUTF();
		txtArea.append(str + "\n");
	}

	private void connect() {
		// 192.168.0.1
		try {
			// Tìm port và tìm IP
			ipAddress = JOptionPane.showInputDialog(null, "Nhập ip");
			System.out.println(ipAddress);
			// Kết nối
			socketClient = new Socket(ipAddress, 2222); // Kết nối dựa trên ip vừa nhập và cổng mặc định
			btn.setEnabled(false);
			txtArea.setText("Kết nối thành công\n");
		} catch (IOException ex) {
			JOptionPane.showMessageDialog(null, "Kết nối thất bại");
		}
	}

	@Override
	public void run() {
		while (true) {
			try {
				readData();
			} catch (IOException ex) {

			}
		}
	}

	public static void main(String[] args) throws IOException {
		TCPClient tCPClient = new TCPClient();
	}

	private static Socket socketClient = null; // Tạo socket kết nối
	private DataInputStream dataInputStream = null;
	private DataOutputStream dataOutputStream = null;
	private InetAddress addr = null;
	private String ipAddress = null;
	private String Ten;
}
