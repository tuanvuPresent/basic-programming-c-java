package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class client extends JFrame implements ActionListener {

    static JTextArea content; // Khai báo nội dung nhập liệu
    static JButton send; // Khai báo nút gửi tin
    static JTextField nhap, toName; // Khai báo nội dung nhập liệu
    static String chuoi = ""; // Tạo chuỗi chưa nội dung nhận
    static Socket sB; // Khai báo socket phía client 
    static PrintWriter gui; // Khai báo luồn gửi tin

    public static void main(String[] args) {

        try {

            String ip = JOptionPane.showInputDialog(null, "Nhập IP máy chủ"); // họp thoại thông báo yêu cầu nhập ip server
            new client();  // Khởi tạo giao diện
            sB = new Socket(ip, 2222); // Kết nối dựa trên ip vừa nhập và cổng mặc định  

//            BufferedReader nhan = new BufferedReader(
//                    new InputStreamReader(sB.getInputStream())); // Luồng nhận tin
            DataInputStream dataInputStream = new DataInputStream(sB.getInputStream());

//            while ((chuoi = nhan.readLine()) != null) // Kiểm tra xem có tin để nhận hay không?
//            {
//                content.append(chuoi + "\n"); // Đưa nội dung lên giao diện
//            }
            while (true) {
                chuoi = dataInputStream.readUTF();
                content.append(chuoi + "\n"); // Đưa dữ liệu chat lên giao diện
            }
        } catch (Exception e) { // Xử lý ngoại lệ
            e.printStackTrace();
        }
    }

    public client() {
        setSize(600, 600); // Định nghĩa kích thước client
        setTitle("Client"); // Tiêu đề
        Font f = new Font("Arial", Font.BOLD, 20);  // Font chữ

        content = new JTextArea(10, 10); // Nội dung chat
        content.setFont(f); // Định nghĩa font cho nội dung
        content.setBackground(Color.cyan); // Đặt hình nền
        JScrollPane sp = new JScrollPane(content); // Cho phép scrolling khi nội dung quá dài
        content.setEditable(false); // Không cho phép chỉnh sửa nội dung
        send = new JButton("Gửi"); // Tạo nút gửi tin
        nhap = new JTextField(30); // Tạo khung nhập tên với chiều dài tối đa
        nhap.setFont(f); // Định nghĩa font cho khung
        toName = new JTextField("Nhập tên bạn"); // Định nghĩa nội dung mặc định cho khung
        toName.setFont(f); // Đặt font cho khung
        toName.setBackground(Color.pink); // Đặt nền cho khung

        add(toName, BorderLayout.PAGE_START); // Bố trí toName ở trị trí bắt đầu
        add(sp, BorderLayout.CENTER); // sp ở vị trí giữa
        add(nhap, BorderLayout.PAGE_END); // nhap ở vị trí cuối
        nhap.addActionListener(this); // Định nghĩa sự kiện cho khung nhập

        setVisible(true); // cập nhật giao diện
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Thoát khi đóng chương trình
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(nhap)) // Bắt sự kiện khi người dùng gửi
        {
            try {
                DataOutputStream dataOutputStream = new DataOutputStream(sB.getOutputStream());
                dataOutputStream.writeUTF(toName.getText() + ": " + nhap.getText());
                dataOutputStream.flush();
//                gui = new PrintWriter(sB.getOutputStream(), true); // luồng gửi tin
//                gui.println(toName.getText() + ": " + nhap.getText()); // Gửi tin và kèm tên

                content.append(toName.getText() + ": " + nhap.getText() + "\n"); // Đưa lên giao diện

                nhap.setText(""); // Xóa nội dung nhập liệu
                nhap.requestFocus(); // Focus con trỏ vào khung nhập liệu     
            } catch (Exception r) { // Xử lý ngoại lệ khi xảy ra lỗi
                r.printStackTrace();
            }
        }

    }
}
