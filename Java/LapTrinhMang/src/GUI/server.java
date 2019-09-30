package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class server extends JFrame implements ActionListener {

    static JTextArea content; // Khai báo ô nhập nội dung chat
    static JButton send; // Khai báo nút gửi nội dung
    static JTextField nhap, toName; // Khai báo ô nhập tên 
    static String chuoi = ""; // Chuỗi nội dung tin chat giữa 2 máy
    static ServerSocket serA; // Tạo socket server 
    static Socket s, sA = new Socket(); // Tạo socket kết nối
    static PrintWriter gui; // Khai báo biến gửi tin

    public static void main(String[] args) {
        new server();  // Hàm tạo đối tượng giao diện chat đã định nghĩa phía dưới

        try { 
            serA = new ServerSocket(2222); // Tạo cổng kết nối với server ở cổng 2222
            sA = serA.accept(); // Chấp nhận khi có kết nối 
            DataInputStream dataInputStream;
            while (true) // Vòng lặp liên tục khi nhận được yêu cầu từ phía client gửi về
            {
                dataInputStream = new DataInputStream(sA.getInputStream());
//                BufferedReader nhan = new BufferedReader(
//                        new InputStreamReader(s.getInputStream()));  // Luồng nhận tin từ Client sẽ được lấy qua biến này          
//                while ((chuoi = nhan.readLine()) != null) // Kiểm tra xem có tin để nhận từ Client hay không
//                {
//                    content.append(chuoi + "\n"); // Đưa dữ liệu chat lên giao diện
//                }
                chuoi = dataInputStream.readUTF();
                content.append(chuoi + "\n"); // Đưa dữ liệu chat lên giao diện
            }
        } catch (Exception e) {     // Xử lý ngoại lệ khi gặp lỗi
            e.printStackTrace();
        }

    }

    public server() {
        setSize(600, 600); // Định nghĩa kích thước giao diện chat
        setTitle("Server"); // Tiêu đề giao diện
        Font f = new Font("Arial", Font.BOLD, 20);  // Định nghĩa Font chữ nội dung   

        content = new JTextArea(10, 10); // Tạo mới thành phần từ khai báo phía trên
        content.setFont(f); // Đặt font đã định nghĩa và ô nội dung chat
        content.setBackground(Color.cyan); // Định nghĩa ô nền nội dung
        content.setEditable(false); // Đặt chế độ không có phép chỉnh sửa trên ô
        JScrollPane sp = new JScrollPane(content); // Định nghĩa cho phép scrolling trên ô nội dung nếu nội dung quá dài
        send = new JButton("Gửi"); // Định nghĩa nút gửi tin
        nhap = new JTextField(30); // Định nghĩa độ dài kí tự nhập vào khung tên
        nhap.setFont(f); // Đặt font đã khai báo phía trên cho khung tên
        toName = new JTextField("Nhập tên bạn");  // Đặt nội dung yêu cầu mặc định
        toName.setFont(f); // Định nghĩa font cho toName
        toName.setBackground(Color.pink); // Định nghĩa nền cho toName

        add(toName, BorderLayout.PAGE_START); // Chia bố cục cho toName nằm ở vị trí đầu tiên
        add(sp, BorderLayout.CENTER); // Chia bố cục cho sp nằm ở vị trí giữa
        add(nhap, BorderLayout.PAGE_END); // Chia bố cục cho khung nhập liệu ở vị trí cuối
        nhap.addActionListener(this); // Gán sự kiện khi người dùng nhấn gửi

        setVisible(true); // Cập nhật lại giao diện
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Thoát giao diện khi đóng
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource().equals(nhap)) {
            try {
                DataOutputStream dataOutputStream = new DataOutputStream(sA.getOutputStream());
                dataOutputStream.writeUTF(toName.getText() + ": " + nhap.getText());
                dataOutputStream.flush();
//                gui = new PrintWriter(s.getOutputStream(), true); // Tạo mới đối tượng gửi tin
//                gui.println(toName.getText() + ": " + nhap.getText()); // Gửi tin qua mạng kèm tên

                content.append(toName.getText() + ": " + nhap.getText() + "\n"); // Cập nhật lại giao diện hiển thị nội dung tin

                nhap.setText(""); // Xóa trường nhập liệu
                nhap.requestFocus(); // Focus con chỏ ngay ô nhập liệu                             
            } catch (Exception r) { // Xử lý ngoại lệ khi xảy ra lỗi
                r.printStackTrace();
            }
        }

    }
}
