/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExSwing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.mysql.cj.xdevapi.Statement;

/**
 *
 * @author NguyenTuanVu
 */
public class ex_Table implements ActionListener {

	private JButton btn = null;
	private JScrollPane scrollPane = null;

	public ex_Table() {
		// Frame
		JFrame frame = new JFrame("My frame");
		frame.setSize(300, 300);
		frame.setLocationRelativeTo(frame);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// add pnl
		JPanel panel = new JPanel(null);
		frame.add(panel);
		// add Table
		model = new DefaultTableModel();
		model.addColumn("ID");
		model.addColumn("Name");
		model.addColumn("Ngày sinh");
		table = new JTable();
		table.setModel(model);
		// cho table vĂ o JScrollPane
		scrollPane = new JScrollPane(table);
		scrollPane.setBounds(0, 0, 200, 200);
		// add button
		btn = new JButton("Ok");
		btn.setBounds(210, 50, 70, 30);
		// add vao panel
		panel.add(scrollPane);
		panel.add(btn);
		btn.addActionListener(this);
		frame.setVisible(true);
	}

	public static void main(String args[]) {
		ex_Table table = new ex_Table();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// kết nối với csdl
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/login", "root", "wellcome");
			// lấy dữ liệu tất cả
			String sql = "select * from sinhvien";
			pst = conn.prepareStatement(sql);
			rs = pst.executeQuery();
			// xuất kết quả ra
			updateView();
		} catch (Exception ex) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null, "thất bại");
		}
	}

	private void updateView() throws SQLException {
		// TODO Auto-generated method stub
		while (rs.next()) {
			Object data[] = { rs.getString(1), rs.getString(2), rs.getString(3) };
			model.addRow(data);
		}
	}

	DefaultTableModel model;
	private JTable table;
	//
	static Connection conn = null;
	static ResultSet rs;
	static PreparedStatement pst;
	static Statement st;
}
