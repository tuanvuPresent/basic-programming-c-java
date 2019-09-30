/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExSwing;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author NguyenTuanVu
 */
/*
 �?ưa nội dung văn bản vào bằng void setText(String txt)
 Lấy nội dung văn bản ra bằng String getText()
 Lấy nội dung văn bản đang được đánh dấu (bôi đen) ra bằng String getSelectedText()
 �?ể ngư�?i dùng không thể thay đổi nội dung bằng void setEditable(false) (mặc định là true)
 �?ặc biệt là TextField có một phương thức mà TextArea không có, đó là void setEchoChar(char c).
 Ví dụ setEchoChar(‘*’) thì phương thức này sẽ khiến cho tất cả kí tự nhập vào TextField đ�?u chỉ hiển thị là kí tự ‘*’ (rất hữu dụng khi nhập password)
 */
public class ex_TexField_TextArea {

    ex_TexField_TextArea() {
        JFrame frame = new JFrame("Main Frame");                //Main Frame la ten cai cua so
        frame.setLayout(null);                                  //hien
        frame.setSize(600, 400);                                //kich thuoc
        frame.setLocationRelativeTo(frame);                      //man hinh ra giua
        frame.setResizable(false);                              //khong cho phong to
        //add TextField
        JTextField tField = new JTextField();
        tField.setBounds(0, 0, 150, 30);
        frame.add(tField);
        //add TextArea
        JTextArea area = new JTextArea();
//        area.setBounds(50, 50, 100, 100);
        JScrollPane s = new JScrollPane(area);
        s.setBounds(30, 30, 100, 200);
        frame.add(s);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //ham dong cua so lai
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        ex_TexField_TextArea area = new ex_TexField_TextArea();
    }

}
